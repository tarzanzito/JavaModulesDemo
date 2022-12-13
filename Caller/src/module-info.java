//
// Eclipse 2022-09
// ================
//
// To access "com.candal.test" we must configure Java Build Path
//
// 1 - Right click in this project
// 2 - Select "Build Path" -> "Configure Build Path..."
// 3 - In "Java Build Path"  select Group-TAB "Projects"
// 4 - Select Modulepath -> Add
// 5 - Choose Projects -> OK
// 6 - Apply and Close
//
module com.candal.calculator {
	requires com.candal.test; // REF01
}