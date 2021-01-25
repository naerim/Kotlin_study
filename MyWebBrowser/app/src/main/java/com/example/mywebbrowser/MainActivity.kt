package com.example.mywebbrowser

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var webView : WebView
    lateinit var urlEditText: EditText
    lateinit var backButton: Button
    lateinit var forwardButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        urlEditText = findViewById(R.id.urlEditText)
        backButton = findViewById(R.id.backButton)
        forwardButton = findViewById(R.id.forwardButton)

        webView.apply {
            settings.javaScriptEnabled = true
            webViewClient = WebViewClient()
        }

        webView.loadUrl("http://www.google.com")

        // context 메뉴(화면 길게 클릭하면 나옴)
        registerForContextMenu(webView)

        urlEditText.setOnEditorActionListener { v, actionId, event ->
            // 검색 버튼 눌렀을 때
            if(actionId == EditorInfo.IME_ACTION_SEARCH){
                webView.loadUrl(urlEditText.text.toString())
                true
            }
            else{
                false
            }
        }

        // 뒤로가기
        backButton.setOnClickListener {
            onBackPressed()
        }

        // 앞으로가기
        forwardButton.setOnClickListener {
            if(webView.canGoForward()){
                webView.goForward()
            }
        }
    }

    // 뒤로 가기
    override fun onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack()
        }
        else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.action_google, R.id.action_home -> {
                webView.loadUrl("http://www.google.com")
                return true
            }
            R.id.action_reload -> {
                webView.reload()
                return true
            }
            R.id.action_naver -> {
                webView.loadUrl("http://www.naver.com")
                return true
            }
            R.id.action_daum -> {
                webView.loadUrl("http://www.daum.net")
                return true
            }
            R.id.action_call -> {
                // 전화하기
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:012-3456-7890")
                if(intent.resolveActivity(packageManager)!=null){
                    startActivity(intent)
                }
                return true
            }
            R.id.action_send_text -> {
                // 문자보내기
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("smsto:" + Uri.encode("012-3456-7890"))
                if(intent.resolveActivity(packageManager)!=null){
                    startActivity(intent)
                }
                return true
            }
            R.id.action_email -> {
                // 이메일하기
                val intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("mailto:example@example.com")
                if(intent.resolveActivity(packageManager)!=null){
                    startActivity(intent)
                }
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.action_share -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT, webView.url.toString())
                intent.setType("text/plain")
                val shareIntent = Intent.createChooser(intent, "공유 페이지")
                startActivity(shareIntent)
                return true
            }
            R.id.action_browser -> {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(webView.url))
                startActivity(Intent.createChooser(intent, "Browser"))
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}