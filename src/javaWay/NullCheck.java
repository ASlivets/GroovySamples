package javaWay;

import common.NodeProvider;

public class NullCheck {

	public static void main(String[] args) {
		NodeProvider nodeProvider = new NodeProvider();
		if (nodeProvider != null
				&& nodeProvider.getNodes() != null
				&& nodeProvider.getNodes().get(0) != null
				&& nodeProvider.getNodes().get(0).getName() != null) {
			nodeProvider.getNodes().get(0).setName("java");
		}
	}

}
