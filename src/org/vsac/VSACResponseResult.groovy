package org.vsac

class VSACResponseResult {
	String xmlPayLoad = "";
	//Added to handle programs and releases
	List<String> pgmRels;
	boolean isFailResponse = false;
	int failReason;
}
