package com.example.busapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.busapp.ui.theme.BusAppTheme

class screen3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Eve()

        }
    }
}
@Preview(showBackground = true)

@Composable
fun Eve(){
    val goto = LocalContext.current
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp)){
        item{

           Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
               Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.Top) {
                   Image(painter = painterResource(R.drawable.prof),
                       modifier= Modifier
                           .clip(CircleShape)
                           .size(300.dp)
                       ,contentDescription = null )


               }
               Row( verticalAlignment = Alignment.CenterVertically) {
                   Column {
                       Text(text = "Ann Barchiba", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
                       Text(text = "annchebet09@gmail.com", fontSize = 20.sp)
                   }
               }
               Column (modifier = Modifier
                   .background(LightGray)
                   .fillMaxSize()) {

                   Row (verticalAlignment = Alignment.CenterVertically){
                       Image(painter = painterResource(R.drawable.person),modifier= Modifier
                           .clip(CircleShape)
                           .size(64.dp), contentDescription = null)
                       Spacer(modifier = Modifier.width(15.dp))
                       Text(text = "Personal Data",fontSize=20.sp)

                   }
                   Spacer(modifier = Modifier.height(10.dp))
                   Row (verticalAlignment = Alignment.CenterVertically){
                       Image(painter = painterResource(R.drawable.pay),modifier= Modifier
                           .clip(CircleShape)
                           .size(64.dp), contentDescription = null)
                       Spacer(modifier = Modifier.width(15.dp))
                       Text(text = "Payment Method",fontSize=20.sp)

                   }
                   Spacer(modifier = Modifier.height(10.dp))
                   Row (verticalAlignment = Alignment.CenterVertically){
                       Image(painter = painterResource(R.drawable.settings),modifier= Modifier
                           .clip(CircleShape)
                           .size(64.dp), contentDescription = null)
                       Spacer(modifier = Modifier.width(15.dp))
                       Text(text = "Settings",fontSize=20.sp)

                   }
                   Spacer(modifier = Modifier.height(10.dp))
                   Row (verticalAlignment = Alignment.CenterVertically){
                       Image(painter = painterResource(R.drawable.lock), modifier= Modifier
                           .clip(CircleShape)
                           .size(64.dp),contentDescription = null)
                       Spacer(modifier = Modifier.width(15.dp))
                       Text(text = "Change Password",fontSize=20.sp)

                   }
                   Spacer(modifier = Modifier.height(10.dp))
                   Row (verticalAlignment = Alignment.CenterVertically){
                       Image(painter = painterResource(R.drawable.signout),modifier= Modifier
                           .clip(CircleShape)
                           .size(64.dp), contentDescription = null)
                       Spacer(modifier = Modifier.width(15.dp))
                       Text(text = "Sign Out",fontSize=20.sp)

                   }
               }
           }
            Spacer(modifier = Modifier.height(20.dp))
            Row (modifier=Modifier.fillMaxWidth()){
                Button(onClick = { /*TODO*/ }) {
                    Text( "Trips",fontSize=20.sp,color=Color.White, modifier = Modifier
                        .clickable{ goto.startActivity(Intent(goto,screen1::class.java)) })
                    
                }
            }
        }
    }


}