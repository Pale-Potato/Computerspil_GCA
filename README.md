# Computerspil Management System

**Gruppemedlemmer:** Alberte, Mads, Jacob og Thomas.

## Vores projekt

Vores computerspilsystem består af tre klasser: `Game`, `Player` og `GameSystem`. `Game` gemmer information om spil, såsom ID, titel, genre og pris. `Player` gemmer information om spillere, såsom ID, navn, alder og score. `GameSystem` holder styr på spillene og spillerne.

I `GameSystem` kan man tilføje spil og spillere, vise alle spil og spillere samt søge efter et bestemt spil eller en spiller via deres ID. Man kan også opdatere en spillers score.

Vi har desuden lavet et leaderboard, hvor spillerne sorteres efter score ved hjælp af Bubble Sort. Leaderboardet viser spillerne fra den højeste til den laveste score.

Vi har ikke implementeret `calculateTotalRevenue()` eller `findTopScoringPlayer()` fra den oprindelige opgave. I stedet har vi fokuseret på at lave et leaderboard, der giver et samlet overblik over spillernes placeringer.

## Fejl

I vores `displayAllGames()` og `displayAllPlayers()` fik vi fejl, når løkkerne mødte en tom plads i arrayet. Vi brugte først en for-each-løkke, men ændrede den til en almindelig for-løkke, hvor vi bruger `gameCount` og `playerCount` til kun at gennemløbe de pladser, der indeholder spil eller spillere.

## Tests

Vores `main()`-metode tester og viser resultaterne fra alle vores metoder for at kontrollere, at de fungerer som forventet. Vi bruger testdata med flere spil og spillere til at teste tilføjelse, søgning, visning, opdatering af scores og leaderboardet.

