package getset

class Man {

    @JvmField   //jvm annotations -> If you really want java-like fields which do not have the extra benefit of the setters and getters,
    //then you can attach the jvm field annotations
    var name: String = "John Doe"

    @JvmField
    var age: Int = 18
}