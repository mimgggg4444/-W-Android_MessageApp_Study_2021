# androidStudio
Study

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
