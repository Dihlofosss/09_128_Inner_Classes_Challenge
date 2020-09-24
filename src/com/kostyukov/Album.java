package com.kostyukov;

import java.util.ArrayList;

public class Album
{
	//private ArrayList<Song> songs = new ArrayList<>();
	private SongList songs;
	private String albumName;
	
	public String getAlbumName()
	{
		return albumName;
	}
	
	public ArrayList<Song> getSongs()
	{
		//return songs;
		return songs.songList;
	}
	
	public Album(String albumName)
	{
		this.albumName = albumName;
		songs = new SongList();
	}
	
	public void addSong(String songName, double songDuration)
	{
		//if (getSong(songName) != null){
		//	System.out.println("Song " + songName + " is already in the Album");
		//	return;
		//}
		//addSong(new Song(songName, songDuration));
		
		songs.addSong(songName, songDuration);
	}
	
	public void addSong(Song newSong)
	{
		//songs.add(newSong);
		songs.addSong(newSong);
	}
	
	public Song getSong(int songID)
	{
		//return songs.get(songID);
		return songs.findSong(songID);
	}
	
	public Song getSong(String songName)
	{
		//for (int i = 0; i < songs.size(); i++)
		//{
		//	if (songs.get(i).getTitle().equals(songName))
		//		return songs.get(i);
		//}
		
		return songs.findSong(songName);
	}
	
	private class SongList
	{
		private ArrayList<Song> songList;
		
		public SongList()
		{
			this.songList = new ArrayList<>();
		}
		
		public void addSong(String songName, double songDuration)
		{
			if (findSong(songName) != null){
				System.out.println("Song " + songName + " is already in the Album");
				return;
			}
			addSong(new Song(songName, songDuration));
		}
		
		public void addSong(Song song)
		{
			songList.add(song);
		}
		
		public Song findSong(String song)
		{
			for (int i = 0; i < songList.size(); i++)
			{
				if (songList.get(i).getTitle().equals(song))
					return songList.get(i);
			}
			System.out.println("Song " + song + " is not existing");
			return null;
		}
		
		public Song findSong(int songID)
		{
			return songList.get(songID);
		}
	}
}