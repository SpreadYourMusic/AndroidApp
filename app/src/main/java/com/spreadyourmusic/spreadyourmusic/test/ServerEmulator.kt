package com.spreadyourmusic.spreadyourmusic.test

import com.spreadyourmusic.spreadyourmusic.models.*
import java.util.*
import kotlin.collections.ArrayList

object ServerEmulator {
    val songList = HashMap<Long, Song>()
    val userList = HashMap<String, User>()
    val playlistList = HashMap<Long, Playlist>()
    val generesList = ArrayList<String>()
    val albumList = ArrayList<Album>()

    val cancionesFavoritas = HashMap<String, ArrayList<Song>>()
    val artistasSeguidos = HashMap<String, ArrayList<User>>()
    val playlistSeguidos = HashMap<String, ArrayList<Playlist>>()

    val recomendaciones = HashMap<String, ArrayList<Recommendation>>()
    val trends = ArrayList<Song>()

    val generos = ArrayList<Pair<String, List<Recommendation>>>()

    init {
        val autor1 = User("silentpartner", "Silent Partner","http://storage.googleapis.com/automotive-media/album_art.jpg", false)
        val autor2 = User("jinglepunks", "Jingle Punks", "http://storage.googleapis.com/automotive-media/album_art_2.jpg",false)
        val autor3 = User("abel", "Abel", "http://storage.googleapis.com/automotive-media/album_art_3.jpg", false)
        val autor4 = User("postmalone", "Post Malone", "http://storage.googleapis.com/automotive-media/album_art.jpg", true)
        val autor5 = User("6ix9ine", "6ix9ine", "http://storage.googleapis.com/automotive-media/album_art_2.jpg", false)
        val autor6 = User("tremaine", "Trey Songz", "http://storage.googleapis.com/automotive-media/album_art_3.jpg", false)
        autor1.twitterAccount = "asdasfdsfdsfds"
        autor1.instagramAccount = "asdasfdsfdsfds"
        autor1.facebookAccount = "asdasfdsfdsfds"


        val album1 = Album(1,"Jazz & Blues", autor1, GregorianCalendar(2018, 3, 22), "http://storage.googleapis.com/automotive-media/album_art.jpg")
        val album2 = Album(2,"Cinematic", autor1, GregorianCalendar(2017, 6, 27), "http://storage.googleapis.com/automotive-media/album_art_2.jpg")
        val album3 = Album(3,"B&B", autor4, GregorianCalendar(2017, 6, 27), "http://storage.googleapis.com/automotive-media/album_art_2.jpg")
        val album4 = Album(4,"Blues", autor2, GregorianCalendar(2017, 6, 27), "http://storage.googleapis.com/automotive-media/album_art_2.jpg")

        val album5 = Album(5,"Blues 2", autor3, GregorianCalendar(2017, 6, 27), "http://storage.googleapis.com/automotive-media/album_art_2.jpg")

        val album6 = Album(5,"Graduation Day", autor5, GregorianCalendar(2017, 6, 27), "http://storage.googleapis.com/automotive-media/album_art_2.jpg")
        val album7 = Album(5,"Tremaine", autor6, GregorianCalendar(2017, 6, 27), "http://storage.googleapis.com/automotive-media/album_art_2.jpg")

        val cancion1 = Song(album = album1, id = 1, name = "Jazz in Paris", locationUri = "http://storage.googleapis.com/automotive-media/Jazz_In_Paris.mp3", lyricsPath = null, genere = "dfsdf")
        val cancion2 = Song(album = album1, id = 2, name = "The Messenger", locationUri = "http://storage.googleapis.com/automotive-media/The_Messenger.mp3", lyricsPath = null, genere = null)
        val cancion3 = Song(album = album3, id = 3, name = "Psycho",   locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)
        val cancion4 = Song(album = album2, id = 4, name = "Talkies", locationUri = "http://storage.googleapis.com/automotive-media/Talkies.mp3", lyricsPath = null, genere = null)
        val cancion5 = Song(album = album2, id = 5, name = "On the Bach", locationUri = "http://storage.googleapis.com/automotive-media/On_the_Bach.mp3", lyricsPath = null, genere = null)
        val cancion6 = Song(album = album4, id = 6, name = "The Story Unfolds", locationUri = "http://storage.googleapis.com/automotive-media/The_Story_Unfolds.mp3", lyricsPath = null, genere = null)
        val cancion7 = Song(album = album4, id = 7, name = "Drop and Roll", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)

        val cancion8 = Song(album = album5, id = 8, name = "Drop and Roll 1", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)
        val cancion9 = Song(album = album5, id = 9, name = "Drop and Roll 2", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)
        val cancion10 = Song(album = album5, id = 10, name = "Drop and Roll 3", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)
        val cancion11 = Song(album = album5, id = 11, name = "Drop and Roll 4", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)
        val cancion12 = Song(album = album5, id = 12, name = "Drop and Roll 5", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)
        val cancion13 = Song(album = album5, id = 13, name = "Drop and Roll 6", locationUri = "http://storage.googleapis.com/automotive-media/Drop_and_Roll.mp3", lyricsPath = null, genere = null)

        val list1 = ArrayList<Song>()
        list1.add(cancion1)
        list1.add(cancion2)
        list1.add(cancion3)
        list1.add(cancion4)
        list1.add(cancion5)
        list1.add(cancion6)
        list1.add(cancion7)

        val list2 = ArrayList<Song>()
        list2.add(cancion3)

        val playlist1 = Playlist(1, "Jazz", autor2, "http://storage.googleapis.com/automotive-media/album_art_3.jpg", list1)
        val playlist2 = Playlist(2, "Post Malone", autor3, "http://storage.googleapis.com/automotive-media/album_art_2.jpg", list2)
        val playlist3 = Playlist(3, "Mix Trap", autor1, "http://storage.googleapis.com/automotive-media/album_art_1.jpg", list1)
        val playlist4 = Playlist(4, "Flow", autor3, "http://storage.googleapis.com/automotive-media/album_art_2.jpg", list1)

        userList[autor1.username] = autor1
        userList[autor2.username] = autor2
        userList[autor3.username] = autor3
        userList[autor4.username] = autor4
        userList[autor5.username] = autor5
        userList[autor6.username] = autor6

        songList[cancion1.id] = cancion1
        songList[cancion2.id] = cancion2
        songList[cancion3.id] = cancion3
        songList[cancion4.id] = cancion4
        songList[cancion5.id] = cancion5
        songList[cancion6.id] = cancion6
        songList[cancion7.id] = cancion7
        songList[cancion8.id] = cancion8
        songList[cancion9.id] = cancion9
        songList[cancion10.id] = cancion10
        songList[cancion11.id] = cancion11
        songList[cancion12.id] = cancion12
        songList[cancion13.id] = cancion13

        playlistList[playlist1.id!!] = playlist1
        playlistList[playlist2.id!!] = playlist2
        playlistList[playlist3.id!!] = playlist3
        playlistList[playlist4.id!!] = playlist4


        artistasSeguidos[autor3.username] = ArrayList()
        artistasSeguidos[autor3.username]!!.add(autor1)
        artistasSeguidos[autor3.username]!!.add(autor2)
        artistasSeguidos[autor3.username]!!.add(autor4)

        cancionesFavoritas[autor3.username] = ArrayList()
        cancionesFavoritas[autor3.username]!!.add(cancion3)

        cancionesFavoritas[autor3.username]!!.add(cancion1)
        cancionesFavoritas[autor3.username]!!.add(cancion2)

        cancionesFavoritas[autor3.username]!!.add(cancion4)
        cancionesFavoritas[autor3.username]!!.add(cancion5)
        cancionesFavoritas[autor3.username]!!.add(cancion6)
        cancionesFavoritas[autor3.username]!!.add(cancion7)


        playlistSeguidos[autor3.username] = ArrayList()
        playlistSeguidos[autor3.username]!!.add(playlist1)
        playlistSeguidos[autor3.username]!!.add(playlist2)

        recomendaciones[autor3.username] = ArrayList()
        recomendaciones[autor3.username]!!.add(autor4)
        recomendaciones[autor3.username]!!.add(autor5)
        recomendaciones[autor3.username]!!.add(playlist1)
        recomendaciones[autor3.username]!!.add(playlist2)
        recomendaciones[autor3.username]!!.add(autor2)
        recomendaciones[autor3.username]!!.add(autor1)
        recomendaciones[autor3.username]!!.add(cancion1)
        recomendaciones[autor3.username]!!.add(cancion2)

        trends.add(cancion3)
        trends.add(cancion2)
        trends.add(cancion1)
        trends.add(cancion4)

        generesList.add("Rock")
        generesList.add("Rap")
        generesList.add("Trap")

        generos.add(Pair("Rock", trends))
        generos.add(Pair("Rap", trends))
        generos.add(Pair("Trap", trends))

        albumList.add(album1)
        albumList.add(album2)
        albumList.add(album3)
        albumList.add(album4)
        albumList.add(album5)

    }
}
