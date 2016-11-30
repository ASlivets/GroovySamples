def pattern = ~/a slash must be escaped \/ but backslash, like in a digit match \d does not/
println pattern.getClass()

def matcher = "The Hitchhiker's 2 Guide to the Galaxy" =~ /\d/
if (matcher) {
    println "Found the word 'Galaxy'"
}

