package com.river.kmp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.river.kmp.Greeting
import com.river.kmp.model.User
import com.river.kmp.utils.DateUtil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingView()
                }
            }
        }
    }
}

@Composable
fun GreetingView() {
    val greeting = Greeting().greet()
    val user = User(1, "Alice", "alice@example.com")
    val dateMessage = DateUtil.getCurrentDateMessage()

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = greeting)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "User: ${user.name}, Email: ${user.email}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = dateMessage)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView()
    }
}
