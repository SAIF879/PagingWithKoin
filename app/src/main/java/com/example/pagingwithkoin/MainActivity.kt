package com.example.pagingwithkoin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.pagingwithkoin.ui.theme.PagingWithKoinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PagingWithKoinTheme {

            }
        }
    }
}


//TODO : 1. IMPLEMENT PAGINATION,
// 2. CACHEING ,
// 3.VIEWMODEL WITH STATES ,
// 4. KOIN FOR DI ,
// 5.OFFLINE FIRST APPROACH  ,
// 6.COROUTINE,
// 7. SWIPE TO REFRESH , 8. ROOM DB , 9 . SEARCHING , 10 type alias


// TODO: read NetworkBoundResource - > {
//  1. Load data from DB (Room)
//  2. Emit loading state
//  3. Fetch from network
//  4. If successful, save result to DB
//  5. Emit updated data from DB
//  }