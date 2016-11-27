import common.NodeProvider

def nodes = NodeProvider.nodes

def printer = { String x, int y ->
    println "hey ${x} the value is ${y}"
}

printer "me", 1
