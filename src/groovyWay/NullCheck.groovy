package groovyWay

import common.NodeProvider

NodeProvider nodeProvider = new NodeProvider()

if (nodeProvider
        ?.getNodes()
        ?.get(0)
        ?.getName() != null) {
    nodeProvider.getNodes().get(0).name = 'java'
}




a ?: ""