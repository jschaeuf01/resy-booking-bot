package com.resy

object BookingDetails {
  //Your user profile Auth Token
  val auth_token = "QPLL318J4kKwfSS1j8dN596fnLCk9AAaiPYzgRpt7pavGH3_2P4l5zEOLUBHdA7hjr9YLyJHKReFywCxoypmKOl35pitqnfg9fW4Ifhp%7Cuo%3D-bd935bccbbb386896022db15405e1a6b2a0cfa72d48126a38af1e830"
  //Your user profile API key
  val api_key = "QPLL318J4kKwfSS1j8dN596fnLCk9AAa…b15405e1a6b2a0cfa72d48126a38af1e830"
  //RestaurantId where you want to make the reservation
  val venueId = "5580"
  //YYYY-MM-DD of reservation
  val day = "2020-03-21"
  //Seq of HH:MM:SS times of reservations in military time format
  val times = Seq(
    "19:00:00",
    "19:15:00",
    "19:30:00",
    "19:45:00",
    "20:00:00")
  //Size of party
  val partySize = "6"
}
