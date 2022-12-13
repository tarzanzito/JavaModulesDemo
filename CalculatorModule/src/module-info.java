//
//
// com.candal.test - this is name used in required (search for all REF01)
//
// exports com.candal.maths; - package name to expose for others jars
//
// exports com.candal.maths to friendProject;  - only specific project can access to this jar.
//
module com.candal.test { //REF1
	
	exports com.candal.maths; //REF02
	//exports com.candal.maths to friendProject;
}