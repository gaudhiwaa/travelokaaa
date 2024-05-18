package com.ppb.travelokaaa

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun Home(modifier: Modifier = Modifier) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 357.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg),
                contentDescription = "unsplash:rsD_jv_A8Yo",
                modifier = Modifier
                    .fillMaxSize()
                    )
            TopBar(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 10.dp,
                        y = 60.dp
                    ))
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Pas foto - Gaudhiwaaa Hendrasto 1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 5.dp,
                        y = 64.dp
                    )
                    .requiredWidth(width = 41.dp)
                    .requiredHeight(height = 40.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
//                    .rotate(degrees = -180f)
                    )
            Text(
                text = "Where’s your next destination?",
                color = Color(0xfffcfcfd),
//                lineHeight = 3.75.em,
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .offset(
                        x = 16.dp,
                        y = (-144).dp
                    )
                    .requiredWidth(width = 251.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .offset(
                        x = 0.dp,
                        y = (-24).dp
                    )
                    .fillMaxWidth()
            ) {
                BannerButtonflight()
                BannerButtonhotel()
                BannerButtoncars()
                BannerButtontaxi()
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.BottomStart)
                    .offset(
                        x = 0.dp,
                        y = (268).dp
                    )
                    .fillMaxWidth()
                    .requiredHeight(height = 255.dp)
                    .padding(start = 20.dp)
            )
            {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(end = 0.dp, bottom = 0.dp)
                    // .background(Color.Red)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                        // .requiredHeight(height = 57.dp)
                        // .padding(end = 156.dp)
                    ) {
                        Text(
                            text = "Deals",
                            color = Color(0xff181a25),
                            style = TextStyle(fontSize = 20.sp),
                            modifier = Modifier.requiredWidth(width = 291.dp)
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.Start),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 0.dp, y = 51.dp)
                                .requiredWidth(width = 291.dp)
                        ) {
                            Property1select()
                            Property1unselect()
                            PropertyHotelsunselect()
                            PropertyTransportsunselect()
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp), // Space between items
                        verticalAlignment = Alignment.CenterVertically, // Align items vertically
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp, y = 97.dp)
                    ) {
                        DealAds()
                    }
                }
            }



        }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.weight(1f)) // Spacer to occupy remaining space

        Box(
            modifier = modifier
                .fillMaxWidth()
                .requiredHeight(height = 60.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(x = 0.dp, y = 0.dp)
                    .fillMaxWidth()
                    .requiredHeight(height = 60.dp)
                    .clip(shape = RoundedCornerShape(100.dp))
                    .background(color = Color.White)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(x = 0.dp, y = 0.dp)
                    .fillMaxWidth()
            ) {
                Statusselect()
                Statusunselect()
                Statusunselect()
                Statusunselect()
            }
        }
    }
        }

@Composable
fun Statusselect(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 68.dp)
            .requiredHeight(height = 48.dp)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 68.dp)
                .requiredHeight(height = 48.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(color = Color(0xff189cf4)))
        Image(
            painter = painterResource(id = R.drawable.hotel),
            contentDescription = "icon",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 18.dp,
                    y = 8.dp)
                .requiredSize(size = 32.dp))
    }
}

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 40.dp)
                .clip(shape = CircleShape)
                .background(color = Color(0xffc4c4c4))
                .border(
                    border = BorderStroke(2.dp, Color(0xfffcfcfd)),
                    shape = CircleShape
                ))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SmallFloatingActionButton(
                onClick = { },
                containerColor = Color(0xff3d415c).copy(alpha = 0.2f)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "icon")
                }
            }
            SmallFloatingActionButton(
                onClick = { },
                containerColor = Color(0xff3d415c).copy(alpha = 0.2f)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.barcode),
                        contentDescription = "icon")
                }
            }
        }
    }
}

@Composable
fun BannerButtonflight(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 94.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.flight),
                contentDescription = "Rectangle 50",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(8.dp)))
            Image(
                painter = painterResource(id = R.drawable.flight),
                contentDescription = "icon",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 12.dp,
                        end = 11.548389434814453.dp,
                        top = 12.dp,
                        bottom = 12.774192810058594.dp
                    ))
        }
        Text(
            text = "Flight",
            color = Color(0xfffcfcfd),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold))
    }
}

@Composable
fun BannerButtonhotel(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 94.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.hotel),
                contentDescription = "Rectangle 50",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(8.dp)))
            Image(
                painter = painterResource(id = R.drawable.hotel),
                contentDescription = "icon",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 12.dp,
                        end = 11.548389434814453.dp,
                        top = 12.dp,
                        bottom = 12.774192810058594.dp
                    ))
        }
        Text(
            text = "Hotel",
            color = Color(0xfffcfcfd),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold))
    }
}

@Composable
fun BannerButtoncars(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 94.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "Rectangle 50",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(8.dp)))
            Image(
                painter = painterResource(id = R.drawable.car),
                contentDescription = "icon",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 12.dp,
                        end = 11.548389434814453.dp,
                        top = 12.dp,
                        bottom = 12.774192810058594.dp
                    ))
        }
        Text(
            text = "Flight",
            color = Color(0xfffcfcfd),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold))
    }
}

@Composable
fun BannerButtontaxi(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 94.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.taxi),
                contentDescription = "Rectangle 50",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(8.dp)))
            Image(
                painter = painterResource(id = R.drawable.taxi),
                contentDescription = "icon",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        start = 12.dp,
                        end = 11.548389434814453.dp,
                        top = 12.dp,
                        bottom = 12.774192810058594.dp
                    ))
        }
        Text(
            text = "Taxi",
            color = Color(0xfffcfcfd),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold))
    }
}


@Composable
fun Property1select(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .requiredWidth(width = 30.dp)
    ) {
        Text(
            text = "All",
            color = Color(0xff189cf4),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 2.dp)
                .background(color = Color(0xff189cf4)))
    }
}

@Composable
fun Property1unselect(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .requiredWidth(width = 40.dp)
    ) {
        Text(
            text = "Flight",
            color = Color(0xffc2c5d6),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 2.dp))

    }
}

@Composable
fun PropertyHotelsunselect(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .requiredWidth(width = 60.dp)
    ) {
        Text(
            text = "Hotels",
            color = Color(0xffc2c5d6),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 2.dp))

    }
}

@Composable
fun PropertyTransportsunselect(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .requiredWidth(width = 200.dp)
    ) {
        Text(
            text = "Transportations",
            color = Color(0xffc2c5d6),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 16.sp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 2.dp))

    }
}

@Composable
fun DealAds(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
//            .requiredWidth(360.dp)
            .requiredHeight(180.dp)
    ) {
        // Add Image as background
        Image(
            painter = painterResource(id = R.drawable.beach), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
//                .requiredWidth(320.dp)// Set the desired width
                .requiredHeight(180.dp)
                .clip(RoundedCornerShape(6.dp))
        )

        // Overlay Box with rounded corners
        Box(
            modifier = Modifier
                .requiredWidth(340.dp)
                .fillMaxSize()
                .clip(RoundedCornerShape(6.dp))
//                .background(Color(0x99c4c4c4)) // Semi-transparent overlay if needed
        )
    }
}

@Composable
fun Statusunselect(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 68.dp)
            .requiredHeight(height = 48.dp)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 68.dp)
                .requiredHeight(height = 48.dp)
                .clip(shape = RoundedCornerShape(100.dp)))
        Image(
            painter = painterResource(id = R.drawable.hotel),
            contentDescription = "icon",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 18.dp,
                    y = 8.dp)
                .requiredSize(size = 32.dp))
    }
}


@Preview(widthDp = 390, heightDp = 812)
@Composable
private fun HomePreview() {
    Home(Modifier)
}