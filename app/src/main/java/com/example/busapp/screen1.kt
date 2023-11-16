package com.example.busapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.busapp.ui.theme.BusAppTheme

class screen1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gre()

        }
    }
}

@Preview(showBackground = true)

@Composable
fun Gre(){

    val goto = LocalContext.current
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)
        .padding(30.dp)
       ) {
    item {
        Column {

            Text(text = "Book Tickets For Your Next Trip!",Modifier
                .fillMaxWidth(),
                fontSize= 40.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(60.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Row {
                        Text(text = "From",Modifier,
                            fontSize= 20.sp,
                            )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(text = "Nanyuki",fontWeight = FontWeight.ExtraBold,
                            fontSize= 20.sp,
                            )
                        Spacer(modifier = Modifier.width(30.dp))
                        Image(painter = painterResource(R.drawable.img_4), contentDescription = null )
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                    Row {
                        Text(text = "To",fontSize=20.sp)
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "Nairobi",fontWeight = FontWeight.ExtraBold,fontSize=20.sp)
                        Spacer(modifier = Modifier.width(35.dp))
                        Image(painter = painterResource(R.drawable.img_5), contentDescription = null )
                    }


                }
                Spacer(modifier = Modifier.width(70.dp))
                Image(painter = painterResource(R.drawable.img_3), modifier = Modifier
                    .size(75.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.Red, CircleShape)
                    , contentDescription = null )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row {
                        Text(text = "Date",fontSize=20.sp)
                        Spacer(modifier = Modifier.width(100.dp))
                        Text(text = "Returning",fontSize=20.sp)


                    }
                    Spacer(modifier = Modifier.height(7.dp))
                    Row {
                        Text(text = "15th Nov 2023", fontSize=20.sp,fontWeight = FontWeight.ExtraBold)
                        Spacer(modifier = Modifier.width(45.dp))
                        Text(text = "Set date", fontSize = 20.sp,fontWeight = FontWeight.ExtraBold)


                    }


                }

            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Passengers", fontSize = 20.sp)
                Spacer(modifier = Modifier.width(100.dp))
                Button(onClick = { /*TODO*/ },) {

                }

            }
            Spacer(modifier = Modifier.height(40.dp))
            Row(Modifier.fillMaxWidth()) {
                Text(text = "Do you have promocode?", fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(Modifier.fillMaxWidth()) {
                Text(text = "One way",fontSize=20.sp)
                Spacer(modifier = Modifier.width(100.dp))
                Button(onClick = { /*TODO*/ },) {
                    Text(text = "Round Trip",fontSize=20.sp)

                }

            }
            Spacer(modifier = Modifier.height(50.dp))

            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { /*TODO*/ },shape = CutCornerShape(10),modifier = Modifier.fillMaxWidth()) {
                    Text( "Search For Tickets",fontSize=20.sp,color=Color.White, modifier = Modifier
                        .clickable{ goto.startActivity(Intent(goto,MainActivity::class.java)) })
                    
                }
            }


        }
    }

    }
}