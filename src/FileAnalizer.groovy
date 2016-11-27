import groovy.xml.MarkupBuilder

if (!(args.size() in 1..2)) {
    println "Incorrect number of arguments"
    System.exit(1)
}

def content = new File(args[0]).text
def charCount = content.size()
def wordCount = content.split(/\W+/).size()

def stringCount
if (args.size() == 2) {
    stringCount = content.count(args[1])
    println "String '${args[1]}' occurs:".padRight(25) + stringCount
}

println "Characters:".padRight(25) + charCount
println "Words:".padRight(25) + wordCount

new File("xml-report.xml").withWriter { writer ->
    def builder = new MarkupBuilder(writer)
    builder.report {
        'char-count'(charCount)
        'word-count'(wordCount)
        if (stringCount) {
            'string-search' {
                string(args[1])
                occurrences(stringCount)
            }
        }
    }
}
