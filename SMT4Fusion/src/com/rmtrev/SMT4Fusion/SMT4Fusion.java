package com.rmtrev.SMT4Fusion;

import java.util.HashMap;

public class SMT4Fusion
{
	private static HashMap<UPair, String> fusionResults;
	private static final String[] races = {
		"Deity",
		"Amatsu",
		"Megami",
		"Nymph",
		"Fury",
		"Kunitsukami",
		"Kishin",
		"Zealot",
		"Lady",
		"Reaper",
		"Vile",
		"Tyrant",
		"Genma",
		"Yoma",
		"Fairy",
		"Night",
		"Herald",
		"Divine",
		"Fallen",
		"Avian",
		"Flight",
		"Raptor",
		"Jirae",
		"Brute",
		"Femme",
		"Jaki",
		"Dragon",
		"Snake",
		"Drake",
		"Avatar",
		"Holy",
		"Food",
		"Beast",
		"Wilder",
		"Tree",
		"Wood",
		"Vermin",
		"Ghost",
		"Foul",
		"Spirit",
		"Undead",
		"Element",
		"Fiend",
		"Famed",
		"Enigma",
		"Mitama",
		"Entity",
		"Godly",
		"Chaos King"
	};
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		fusionResults = GridBuilder.buildMap();
	}
	
	

}
