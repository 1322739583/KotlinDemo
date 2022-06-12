import java.io.File

fun main() {
    //代码一
    var file = File("test.txt");
    file.setExecutable(true)
    file.setReadable(true)
    file.setWritable(false)

    //代码二
    var readOnlyfile = file.apply() {
        setExecutable(true)
        setReadable(true)
        setWritable(false)
    }

    readOnlyfile.mkdir();


}