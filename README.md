# Android_MessageApp

"Android_MessageApp"는 Android Studio를 활용하여 메시지 전송 기능을 구현하는 애플리케이션입니다. 사용자는 이 앱을 통해 메시지를 작성하고, 전송 버튼을 눌러 다른 화면으로 메시지를 전달할 수 있습니다.

## 주요 기능:

1. **메시지 작성**: 사용자는 EditText를 통해 메시지를 작성할 수 있습니다.
2. **메시지 전송**: 사용자가 전송 버튼을 누르면, 작성한 메시지가 다른 화면으로 전달됩니다.

이 프로젝트의 코드는 'src' 폴더에 정리되어 있습니다. 해당 폴더에는 이 프로젝트에서 개발한 주요 코드와 관련된 파일들이 포함되어 있습니다.



--------

## 이슈

[안드로이드 스튜디오](https://developer.android.com/training/basics/firstapp/starting-activity#kotlin)
##### 전송버튼 오류 발생
##### 전송 버튼 누르고 화면 전환에 오류 발생


     fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

<span style="color:red">editText</span>


