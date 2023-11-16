package com.example.busapp

import android.content.Intent
import android.graphics.drawable.ShapeDrawable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.busapp.ui.theme.BusAppTheme

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bus()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Bus() {
    val goto = LocalContext.current
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)
        .padding(10.dp)) {
       item(){
           Row(modifier = Modifier
               .fillMaxWidth()
               .padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
               Text(text = "My Tickets", modifier = Modifier , fontWeight = FontWeight.Bold)
               Spacer(modifier = Modifier.width(10.dp))
               Image(painter = painterResource(R.drawable.img), contentDescription = null, modifier = Modifier.size(20.dp) )
               Spacer(modifier = Modifier.width(100.dp))
               Text( "Next",color=Color.Blue, fontSize = 20.sp, modifier = Modifier
                   .clickable{ goto.startActivity(Intent(goto,screen1::class.java)) })
               Spacer(modifier = Modifier.width(20.dp))
               Text( "Profile",fontSize=20.sp,color=Color.Blue, modifier = Modifier
                   .clickable{ goto.startActivity(Intent(goto,screen3::class.java)) })

           }
           Card(
               elevation = CardDefaults.cardElevation(30.dp), shape = RoundedCornerShape(20.dp),modifier = Modifier
                   .fillMaxWidth()
                   .height(425.dp)
                   .padding(10.dp)
                   .background(Color.Transparent)


           ) {
               Column(Modifier.padding(30.dp)) {
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column(){
                          Text(text = "16th Nov 2023", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(125.dp))
                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Active")
                           
                       }
                   }
                   Spacer(modifier = Modifier.height(5.dp))

                   Row( verticalAlignment = Alignment.CenterVertically) {
                      Column() {
                          Text(text = "Nanyuki", fontWeight = FontWeight.ExtraBold)
                          Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                      }
                       Spacer(modifier = Modifier.width(180.dp))
                      Text(text = "16:20")

                       }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nairobi", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "18:10")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Image(painter = painterResource(R.drawable.img_2), modifier = Modifier
                           .size(30.dp)
                           .background(
                               Color.LightGray
                           ), contentDescription = null )
                       Spacer(modifier = Modifier.width(3.dp))
                       Text(text = "1")

                       Spacer(modifier = Modifier.width(150.dp))
                           Row (verticalAlignment = Alignment.CenterVertically){
                           Image(painter = painterResource(R.drawable.img_1), contentDescription = null)

                           Spacer(modifier = Modifier.width(3.dp))
                           Text(text = "C1")

                       }

                   }
                   Spacer(modifier = Modifier.height(30.dp))
                   Row( verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                       Text(text = "2-9017-287898-7687-Turk", fontWeight = FontWeight.ExtraBold)


                   }

               }


               Row (Modifier.padding(10.dp)){
                   Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                       Text(text = "Show  Ticket")

                   }
               }
                   }
           Card(
               elevation = CardDefaults.cardElevation(30.dp), shape = RoundedCornerShape(20.dp),modifier = Modifier
                   .fillMaxWidth()
                   .height(425.dp)
                   .padding(10.dp)
                   .background(Color.Transparent)


           ) {
               Column(Modifier.padding(30.dp)) {
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column(){
                           Text(text = "16th Nov 2023", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(125.dp))
                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Active")

                       }
                   }
                   Spacer(modifier = Modifier.height(5.dp))

                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nanyuki", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "16:20")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nairobi", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "18:10")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Image(painter = painterResource(R.drawable.img_2), modifier = Modifier
                           .size(30.dp)
                           .background(
                               Color.LightGray
                           ), contentDescription = null )
                       Spacer(modifier = Modifier.width(3.dp))
                       Text(text = "1")

                       Spacer(modifier = Modifier.width(150.dp))
                       Row (verticalAlignment = Alignment.CenterVertically){
                           Image(painter = painterResource(R.drawable.img_1), contentDescription = null)

                           Spacer(modifier = Modifier.width(3.dp))
                           Text(text = "C1")

                       }

                   }
                   Spacer(modifier = Modifier.height(30.dp))
                   Row( verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                       Text(text = "2-9017-287898-7687-Turk", fontWeight = FontWeight.ExtraBold)


                   }

               }


               Row (Modifier.padding(10.dp)){
                   Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                       Text(text = "Show  Ticket")

                   }
               }
           }
           Card(
               elevation = CardDefaults.cardElevation(30.dp), shape = RoundedCornerShape(20.dp),modifier = Modifier
                   .fillMaxWidth()
                   .height(425.dp)
                   .padding(10.dp)
                   .background(Color.Transparent)


           ) {
               Column(Modifier.padding(30.dp)) {
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column(){
                           Text(text = "16th Nov 2023", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(125.dp))
                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Active")

                       }
                   }
                   Spacer(modifier = Modifier.height(5.dp))

                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nanyuki", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "16:20")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nairobi", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "18:10")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Image(painter = painterResource(R.drawable.img_2), modifier = Modifier
                           .size(30.dp)
                           .background(
                               Color.LightGray
                           ), contentDescription = null )
                       Spacer(modifier = Modifier.width(3.dp))
                       Text(text = "1")

                       Spacer(modifier = Modifier.width(150.dp))
                       Row (verticalAlignment = Alignment.CenterVertically){
                           Image(painter = painterResource(R.drawable.img_1), contentDescription = null)

                           Spacer(modifier = Modifier.width(3.dp))
                           Text(text = "C1")

                       }

                   }
                   Spacer(modifier = Modifier.height(30.dp))
                   Row( verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                       Text(text = "2-9017-287898-7687-Turk", fontWeight = FontWeight.ExtraBold)


                   }

               }


               Row (Modifier.padding(10.dp)){
                   Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                       Text(text = "Show  Ticket")

                   }
               }
           }
           Card(
               elevation = CardDefaults.cardElevation(30.dp), shape = RoundedCornerShape(20.dp),modifier = Modifier
                   .fillMaxWidth()
                   .height(425.dp)
                   .padding(10.dp)
                   .background(Color.Transparent)


           ) {
               Column(Modifier.padding(30.dp)) {
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column(){
                           Text(text = "16th Nov 2023", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(125.dp))
                       Button(onClick = { /*TODO*/ }) {
                           Text(text = "Active")

                       }
                   }
                   Spacer(modifier = Modifier.height(5.dp))

                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nanyuki", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "16:20")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row(verticalAlignment = Alignment.CenterVertically) {
                       Column() {
                           Text(text = "Nairobi", fontWeight = FontWeight.ExtraBold)
                           Text(text = "Bus Station", fontWeight = FontWeight.ExtraBold)
                       }
                       Spacer(modifier = Modifier.width(180.dp))
                       Text(text = "18:10")

                   }
                   Spacer(modifier = Modifier.height(15.dp))
                   Row( verticalAlignment = Alignment.CenterVertically) {
                       Image(painter = painterResource(R.drawable.img_2), modifier = Modifier
                           .size(30.dp)
                           .background(
                               Color.LightGray
                           ), contentDescription = null )
                       Spacer(modifier = Modifier.width(3.dp))
                       Text(text = "1")

                       Spacer(modifier = Modifier.width(150.dp))
                       Row (verticalAlignment = Alignment.CenterVertically){
                           Image(painter = painterResource(R.drawable.img_1), contentDescription = null)

                           Spacer(modifier = Modifier.width(3.dp))
                           Text(text = "C1")

                       }

                   }
                   Spacer(modifier = Modifier.height(30.dp))
                   Row( verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                       Text(text = "2-9017-287898-7687-Turk", fontWeight = FontWeight.ExtraBold)


                   }

               }


               Row (Modifier.padding(10.dp)){
                   Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                       Text(text = "Show  Ticket")

                   }
               }
           }

                   }


                   }


               }













