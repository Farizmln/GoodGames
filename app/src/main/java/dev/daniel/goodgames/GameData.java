package dev.daniel.goodgames;

import java.util.ArrayList;

public class GameData {

    private static String[] title = {
            "Apex Legends",
            "Black Desert Online",
            "Borderlands 2",
            "Borderlands 3",
            "Counter Strike: Global Offensive",
            "Devil May Cry 5",
            "DOOM Eternal",
            "Dying Light",
            "Grand Theft Auto IV",
            "Grand Theft Auto V",
            "Metro Exodus",
            "Monster Hunter: World",
            "Payday 2",
            "Red Dead Redemption 2",
            "Resident Evil 2",
            "Resident Evil 3",
            "Subnautica",
            "The Last of Us",
            "World of Warcraft",
            "World War Z"
    };

    private static String[] release = {
            "4 February 2019",
            "24 May 2017",
            "20 September 2012",
            "13 September 2019",
            "21 August 2012",
            "8 March 2019",
            "20 March 2020",
            "26 January 2015",
            "29 April 2008",
            "17 September 2013",
            "14 February 2019",
            "26 January 2018",
            "13 August 2013",
            "26 October 2018",
            "25 January 2019",
            "3 April 2020",
            "23 January 2018",
            "14 June 2013",
            "23 November 2004",
            "16 April 2019"
    };

    private static String[] developer = {
            "Respawn Entertainment",
            "Pearl Abyss",
            "Gearbox Software",
            "Gearbox Software",
            "Valve and Hidden Path Entertainment",
            "CAPCOM",
            "id Software",
            "Techland",
            "Rockstar North",
            "Rockstar North",
            "4A Games",
            "CAPCOM",
            "OVERKILL Software",
            "Rockstar Games",
            "CAPCOM",
            "CAPCOM",
            "Unknown Worlds Entertainment",
            "Naughty Dog",
            "Blizzard Entertainment",
            "Saber Interactive"
    };

    private static String[] publisher = {
            "Electronic Arts",
            "Kakao Games",
            "2K Games",
            "2K Games",
            "Valve",
            "CAPCOM",
            "Bethesda Softworks",
            "Techland Publishing",
            "Rockstar Games",
            "Rockstar Games",
            "Deep Silver",
            "CAPCOM",
            "505 Games",
            "Rockstar Games",
            "CAPCOM",
            "CAPCOM",
            "Unknown Worlds Entertainment",
            "Sony Computer Entertainment",
            "Blizzard Entertainment",
            "Mad Dog Games"
    };

    private static String[] genre = {
            "Battle Royale, First-Person Shooter (FPS)",
            "Massively Multiplayer Online Role-Playing Game (MMORPG)",
            "Action Role-Playing, First-Person Shooter (FPS)",
            "Action Role-Playing, First-Person Shooter (FPS)",
            "First-Person Shooter (FPS)",
            "Action-Adventure, Hack and Slash",
            "First-Person Shooter (FPS)",
            "Action-Adventure, Survival Horror",
            "Action-Adventure",
            "Action-Adventure",
            "First-Person Shooter (FPS), Stealth, Survival Horror",
            "Action Role-Playing",
            "First-Person Shooter (FPS), Stealth",
            "Action-Adventure",
            "Survival Horror, Third-Person Shooter (TPS)",
            "Survival Horror, Third-Person Shooter (TPS)",
            "Action-Adventure, Survival",
            "Action-Adventure, Stealth, Survival Horror, Third-Person Shooter (TPS)",
            "Massively Multiplayer Online Role-Playing Game (MMORPG)",
            "Third-Person Shooter (TPS)"
    };

    private static String[] description = {
            "Apex Legends is an online multiplayer battle royale game featuring squads of three players using pre-made characters (called \"Legends\"), similar to those of hero shooters. Each match generally features twenty teams of three-player squads. Players can join friends in a squad or can be matched randomly with other players. Prior to the match, each player on the squad selects one of the 12 playable characters (as of Season 4), with the exception that no character may be selected more than once by a squad. Each character in the squad has a unique design, personality, and abilities that provide different playstyles to the team. All teams are then placed on an aircraft that passes over the game map. One player in each squad is the jumpmaster, selecting when the squad should skydive out of the aircraft and where to land with the concurrence of the other squad members. However, players are free to deviate from the squad's path. Each player must keep moving to avoid being caught outside the play area. The final team alive wins the round.",
            "Black Desert Online is a sandbox-oriented fantasy massively multiplayer online role-playing game (MMORPG) using action based combat which requiring manual aiming and free movement similar to those found in third-person shooters. The game offers housing, fishing, farming, and trading, as well as large player versus player siege events, and castle battles. It is well regarded for its advanced and in-depth character customization. An active combat system requires precise manual aiming, dodging and using combos, unlike the tab-targeting system seen in most MMORPGs. Players are also able to engage in mounted combat. Skills can be activated through use of combos for attacking, dodging or blocking. Mounts are acquired by taming in the wild and players are able to breed special mounts by mating certain types, require feeding and care, cannot be stored in the inventory, and may be killed. he game includes a number of features to assist with immersion and the sandbox aspect. One is the dynamic, worldwide weather system includes large-scale events such as typhoons and will influence gameplay.",
            "Borderlands 2 is an action role-playing game played from a first-person perspective. It is the second game in the Borderlands series and the sequel to 2009's Borderlands. The gameplay revolves around the completion of missions and the collection of randomly generated loot (such as weapons, shields, skins, and other items) with various rarities, statistics, and elemental effects. Four playable character classes are available in the base game, each with their own unique abilities and skill trees: Axton, \"the Commando\", can summon a turret to provide offensive support. Maya, \"the Siren\", can \"phaselock\" enemies by trapping them in a sphere of energy for a few seconds. Zer0, \"the Assassin\", can temporarily become invisible and spawn a hologram decoy to distract enemies; an attack delivered in this state provides bonus damage. Salvador, \"the Gunzerker\", can use his titular ability to temporarily dual-wield weapons.",
            "Borderlands 3 is an action role-playing first-person shooter video game. It is the sequel to 2012's Borderlands 2, and the fourth main entry in the Borderlands series. Players, either playing alone or in parties of up to four people, make a character from one of the four classes available, and take on various missions given out by non-playable characters (NPCs) and at bounty boards to gain experience, in-game monetary rewards, and reward items. Players can also gain these items by defeating enemies throughout the game. As the player gains level, they gain skill points to allocate across a skill tree. The game introduces four new playable characters: Amara, a \"Siren\" who summons ethereal fists; Moze, a young \"Gunner\" who rides the mecha Iron Bear; Zane, an \"Operative\" with a variety of gadgets; and FL4K, a robot \"Beastmaster\" who summons creatures to aid in fights. Unlike previous Borderlands games where each character had only one unique skill that operates on a cooldown, each character in the new game can unlock three unique skills, though only one (or in Zane's case, two) can be equipped at a time, greatly expanding the number of potential character builds a player can make.",
            "Counter-Strike: Global Offensive (CS:GO) is a multiplayer first-person shooter video game. It is the fourth game in the Counter-Strike series. The game pits two teams against each other: the Terrorists and the Counter-Terrorists. Both sides are tasked with eliminating the other while also completing separate objectives. The Terrorists, depending on the game mode, must either plant the bomb or defend the hostages, while the Counter-Terrorists must either prevent the bomb from being planted, defuse the bomb, or rescue the hostages. There are nine game modes, all of which have distinct characteristics specific to that mode. Matchmaking is supported for all online game modes and is managed through the Steam software. These matches run Valve Anti-Cheat to prevent cheating. In Competitive mode, players are encouraged to act more cautiously in Global Offensive than in most other multiplayer games due to the inability to respawn once killed. When playing Competitive, each player has a specific rank based on their skill level and is paired up with other players around the same ranking.",
            "Devil May Cry 5 is a hack and slash video game, it is the sixth installment in the franchise and the fifth installment of the mainline Devil May Cry series. The gameplay features the return of Dante and Nero as playable characters, along with a new character, named \"V\". The gameplay is similar to that of the other titles in the Devil May Cry series, focusing on fast-paced \"stylish action\". The player fights off hordes of demons with a variety of attacks and weapons. They receive a style-rating for combat based on a number of factors, such as move variety, the length of a combo and dodging attacks. The game's music changes based on the player's performance in combat. Every time the player interacts with the mechanic Nico or finds a statue, he can buy new abilities for each character. While there are three playable characters, the game forces the player to use only one per mission. Like previous games, this title has a Bloody Palace mode where the player can face multiple types of demons in a single area.",
            "Doom Eternal is a first person shooter video game, it is the fifth main game in the Doom series and a direct sequel to 2016's Doom. Players once again take on the role of the Doom Slayer, an ancient warrior who battles the demonic forces of Hell, from a first-person perspective. The game continues its predecessor's emphasis on \"push-forward\" combat, encouraging the player to aggressively engage enemies in order to acquire health, ammo, and armor. The player has access to various firearms, such as the Combat Shotgun, Super Shotgun, Heavy Cannon, Rocket Launcher, Plasma Rifle, BFG 9000, and Ballista. Melee weapons such as a chainsaw, the \"Crucible Blade\" energy sword and a retractable arm-blade called the \"Doomblade\" can also be used. The arm-blade provides the opportunity for a larger variety of quick and violent \"glory kill\" executions, which drop extra health. The Super Shotgun is now equipped with the \"Meat Hook\", a ranged accessory which grabs on to enemies and slingshots the player towards them, functioning as a grappling hook, useful both in combat scenarios and environmental navigation. The Doom Slayer's armor now includes a shoulder-mounted Equipment Launcher with the ability to lob grenades and ice bombs. Additionally the Flame Belch is a flame thrower, which causes the enemies set on fire with it to drop armor pickups. Finally, killing enemies with the chainsaw will drop ammunition.",
            "Dying Light is a first-person zombie apocalypse-themed game set in an open world. Players traverse an expansive urban environment overrun by a vicious epidemic, scavenging the world for supplies and crafting weapons to defend against the growing infected population with a heavy focus on parkour mechanics, allowing players to perform actions such as climbing ledges, leaping off from edges, sliding, jumping from roofs to roofs and zip-lining. Parkour mechanics also apply to combat. Players can perform actions such as drop-kicking when engaging in combat with enemies. A grappling hook is also featured in the game, allowing players to climb up buildings and travel between places quickly. The game is mostly melee-based with the majority of fighting using melee weapons. The melee-weapons have a limited lifespan and will be degraded and eventually broken if the player uses them for combat for a long time. Players can repair a weapon a limited number of times.",
            "Grand Theft Auto IV is an action-adventure game played from a third-person perspective.  It is the eleventh title in the Grand Theft Auto series, and the first main entry since 2004's Grand Theft Auto: San Andreas. Set within the fictional Liberty City (based on New York City), the single-player story follows a war veteran, Niko Bellic, and his attempts to escape his past while under pressure from loan sharks and mob bosses. The open world design lets players freely roam Liberty City, consisting of three main islands. The game is played from a third-person perspective and its world is navigated on-foot or by vehicle. Throughout the single-player mode, players play as Niko Bellic. Players complete missions—linear scenarios with set objectives—to progress through the story. It is possible to have several active missions running at one time, as some missions require players to wait for further instructions or events. Outside of missions, players can freely roam the game's open world, and have the ability to complete optional side missions.",
            "Grand Theft Auto V is an action-adventure game played from either a third-person or first-person perspective. It is the first main entry in the Grand Theft Auto series since 2008's Grand Theft Auto IV. Set within the fictional state of San Andreas, based on Southern California, the single-player story follows three criminals and their efforts to commit heists while under pressure from a government agency and powerful crime figures. The open world design lets players freely roam San Andreas open countryside and the fictional city of Los Santos, based on Los Angeles. The game is played from either a third-person or first-person perspective, and its world is navigated on foot or by vehicle. Players control the three lead protagonists throughout single-player and switch among them, both during and outside missions. The story is centred on the heist sequences, and many missions involve shooting and driving gameplay. A \"wanted\" system governs the aggression of law enforcement response to players who commit crimes.",
            "Metro Exodus is a first-person shooter game with survival horror and stealth elements. It is the third installment in the Metro video game series based on Dmitry Glukhovsky's novels, following the events of Metro 2033 and Metro: Last Light. Set in the post-apocalyptic wasteland of the former Russian Federation and Republic of Kazakhstan, the player must cope with the new hazards and engage in combat against mutated creatures as well as hostile humans. The player wields an arsenal of hand-made weaponry which can be customised through scavenging materials and a crafting system. The game features a mixture of linear levels and sandbox environments. It also includes a dynamic weather system, a day-night cycle, and environments that change along with the seasons as the story progresses. It is set over the course of one whole in-game year.",
            "Monster Hunter: World is an action role-playing game played from a third-person perspective. Similar to previous games in the series, the player takes the role of a player-created character who travels to the \"New World\", an unpopulated landmass filled with monsters, to join the Research Commission that studies the land from their central command base of Astera.  In the game, the player takes the role of a Hunter, tasked to hunt down and either kill or trap monsters that roam in one of several environmental spaces. If successful, the player is rewarded through loot consisting of parts from the monster and other elements that are used to craft weapons and armor, amongst other equipment. The game's core loop has the player crafting appropriate gear to be able to hunt down more difficult monsters, which in turn provide parts that lead to more powerful gear. Players may hunt alone or in a group of up to four players via the game's online multiplayer.",
            "Payday 2 is a cooperative first-person shooter video game and a sequel to 2011's Payday: The Heist. Two years after the events of the previous game, the Payday gang comes to the Washington metropolitan area to perform another heisting spree. The player takes control of one of the gang's twenty one members and can perform heists alone, or with up to three teammates. The player can participate in a variety of heists, including but not limited to robberies of banks, shops and armored cars, and producing and distributing narcotics. The game differs on the previous by allowing much more customization of the player (aesthetically and gameplay-wise), somewhat improved graphical interface and experience, more variety and playability in levels, and has reworked stealth mechanics. There are heists such as bank robberies, drug trafficking runs, rigging an election, or stealing smuggled nuclear warheads. Some of the heists put a large emphasis on stealth, often leading to bonus experience points and money on completion, and certain heists can only be done in stealth.",
            "Red Dead Redemption 2 is a Western-themed action-adventure game. The game is the third entry in the Red Dead series and is a prequel to the 2010 game Red Dead Redemption. The story is set in 1899 in a fictionalized representation of the Western, Midwestern and Southern United States and follows outlaw Arthur Morgan, a member of the Van der Linde gang. Arthur must deal with the decline of the Wild West whilst attempting to survive against government forces, rival gangs, and other adversaries. The story also follows fellow gang member John Marston, the protagonist of Red Dead Redemption. The game is presented through both first and third-person perspectives, and the player may freely roam in its interactive open world. Gameplay elements include shootouts, heists, hunting, horseback riding, interacting with non-player characters (NPCs), and maintaining the character's honor rating through moral choices and deeds. A bounty system similar to the \"wanted\" system from the Grand Theft Auto franchise governs the response of law enforcement and bounty hunters to crimes committed by the player.",
            "Resident Evil 2 is a remake survival horror of the 1998 game of the same name. Unlike the original, which uses tank controls and fixed camera angles, the re-imagining features \"over-the-shoulder\" third-person shooter gameplay similar to Resident Evil 4. As with the original game, the remake of Resident Evil 2 offers the option to play through the main campaign with one of two protagonists, the rookie cop Leon S. Kennedy or the college student Claire Redfield. Depending on the player's choice, the main story will be experienced with variations in subplots, accessible areas, and obtainable items. The game is set in Raccoon City in September 1998, two months after the events of Resident Evil. Most of the citizens have been turned into mindless creatures, referred to by survivors as zombies, due to an outbreak of a viral bioweapon known as the T-Virus, manufactured by Umbrella Corporation.",
            "Resident Evil 3 is a remake survival horror of the 1999 game of the same name. It is the third installment in the Resident Evil series and takes place in two parts, before and after the events of Resident Evil 2. The story follows Jill Valentine and her efforts to escape from a city infected with a biological weapon. Jill Valentine is one of the last remaining people in Raccoon City to witness the atrocities Umbrella performed. To stop her, Umbrella unleashes their ultimate secret weapon; Nemesis. The player can use a variety of firearms to defeat enemies, ranging from pistols to a grenade launcher. Aside from enemies, parts of the environment, such as explosive barrels, can be shot at, causing them to explode and damage nearby enemies. The game also introduces the ability for players to dodge attacks or perform a quick 180-degree turn to evade enemies.",
            "Subnautica is a survival, adventure game set in an open world environment and played from a first-person perspective. The player controls the lone survivor of a waylaid spacecraft called the Aurora, now stranded on a remote ocean planet named simply \"4546B\". The main objective of the player is to explore the ocean and survive its dangers, while at the same time completing tasks that function to advance the plot. Subnautica allows the player to collect resources, construct tools, bases, and submersibles, and interact with the planet's wildlife. The majority of the game is set underwater, with two explorable islands, and a simulated day-and-night cycle that affects visibility.",
            "The Last of Us is an action-adventure survival horror game played from a third-person perspective. Players control Joel, a smuggler tasked with escorting a teenage girl, Ellie, across a post-apocalyptic United States. Players use firearms and improvised weapons, and can use stealth to defend against hostile humans and cannibalistic creatures infected by a mutated strain of the Cordyceps fungus. In combat, the player can use long-range weapons, such as rifles, shotguns, and bows, and short-range weapons such as handguns and short-barreled shotguns. The player is able to scavenge limited-use melee weapons, such as pipes and baseball bats, and throw bottles and bricks to distract, stun, or attack enemies. The player can upgrade weapons at workbenches using collected items. Equipment such as health kits, shivs, and Molotov cocktails can be found or crafted using collected items. Attributes such as the health meter and crafting speed can be upgraded by collecting pills and medicinal plants. Health can be recharged through the use of health kits.",
            "World of Warcraft (WoW) is a massively multiplayer online role-playing game. It is the fourth released game set in the Warcraft fantasy universe. World of Warcraft takes place within the Warcraft world of Azeroth, approximately four years after the events at the conclusion of Blizzard's previous Warcraft release, Warcraft III: The Frozen Throne. Since launch, World of Warcraft has had eight major expansion packs produced for it: The Burning Crusade, Wrath of the Lich King, Cataclysm, Mists of Pandaria, Warlords of Draenor, Legion, Battle for Azeroth and Shadowlands. As with other MMORPGs, players control a character avatar within a game world in third- or first-person view, exploring the landscape, fighting various monsters, completing quests, and interacting with non-player characters (NPCs) or other players. To create a new character, in keeping with the storyline of previous Warcraft games, players must choose between the opposing factions of the Alliance or the Horde; Pandaren, which were added in Mists of Pandaria, do not commit to a faction until after the starting zone is completed.",
            "World War Z is a cooperative third-person shooter video game in which four players fight against massive hordes of zombies in four locations: Moscow, New York, Jerusalem, and Tokyo. Players can choose from six classes, including the Gunslinger, the Hellraiser, who specializes in using explosives, the Fixer, the Medic, the Slasher (who uses meelee weaponry), and the Exterminator, who specializes in crowd control. New perks and weapons can be unlocked for each of the classes as players progress in the game. The game can support up to 1,000 enemies appearing on-screen simultaneously, and they can climb onto each other to reach players on a higher level. Players can collect different items in the battlefield, but their locations are procedurally generated. In addition to fighting zombies, players also need to complete different objectives, such as escorting survivors, in each location."
    };

    private static int[] image = {
            R.drawable.apex_legends,
            R.drawable.black_desert_online,
            R.drawable.borderlands_2,
            R.drawable.borderlands_3,
            R.drawable.cs_go,
            R.drawable.devil_may_cry_5,
            R.drawable.doom_eternal,
            R.drawable.dying_light,
            R.drawable.gta_iv,
            R.drawable.gta_v,
            R.drawable.metro_exodus,
            R.drawable.monster_hunter_world,
            R.drawable.payday_2,
            R.drawable.red_dead_redemption_2,
            R.drawable.resident_evil_2,
            R.drawable.resident_evil_3,
            R.drawable.subnautica,
            R.drawable.the_last_of_us,
            R.drawable.world_of_warcraft,
            R.drawable.world_war_z
    };

    private static int[][] imageScreenShot = {
            {R.drawable.al_ss_1, R.drawable.al_ss_2, R.drawable.al_ss_3, R.drawable.al_ss_4},
            {R.drawable.bdo_ss_1, R.drawable.bdo_ss_2, R.drawable.bdo_ss_3},
            {R.drawable.bl2_ss_1, R.drawable.bl2_ss_2, R.drawable.bl2_ss_3},
            {R.drawable.bl3_ss_1, R.drawable.bl3_ss_2, R.drawable.bl3_ss_3},
            {R.drawable.csgo_ss_1, R.drawable.csgo_ss_2, R.drawable.csgo_ss_3},
            {R.drawable.dmc5_ss_1, R.drawable.dmc5_ss_2, R.drawable.dmc5_ss_3},
            {R.drawable.de_ss_1, R.drawable.de_ss_2, R.drawable.de_ss_3},
            {R.drawable.dl_ss_1, R.drawable.dl_ss_2, R.drawable.dl_ss_3},
            {R.drawable.gtaiv_ss_1, R.drawable.gtaiv_ss_2, R.drawable.gtaiv_ss_3},
            {R.drawable.gtav_ss_1, R.drawable.gtav_ss_2, R.drawable.gtav_ss_3, R.drawable.gtav_ss_4},
            {R.drawable.me_ss_1, R.drawable.me_ss_2, R.drawable.me_ss_3},
            {R.drawable.mhw_ss_1, R.drawable.mhw_ss_2, R.drawable.mhw_ss_3},
            {R.drawable.pd2_ss_1, R.drawable.pd2_ss_2, R.drawable.pd2_ss_3},
            {R.drawable.rdr2_ss_1, R.drawable.rdr2_ss_2, R.drawable.rdr2_ss_3},
            {R.drawable.re2_ss_1, R.drawable.re2_ss_2, R.drawable.re2_ss_3},
            {R.drawable.re3_ss_1, R.drawable.re3_ss_2, R.drawable.re3_ss_3},
            {R.drawable.sub_ss_1, R.drawable.sub_ss_2, R.drawable.sub_ss_3},
            {R.drawable.tlou_ss_1, R.drawable.tlou_ss_2, R.drawable.tlou_ss_3},
            {R.drawable.wow_ss_1, R.drawable.wow_ss_2, R.drawable.wow_ss_3},
            {R.drawable.wwz_ss_1, R.drawable.wwz_ss_2, R.drawable.wwz_ss_3}
    };

    private static String[] link = {
            "https://www.origin.com/sgp/en-us/store/apex/apex",
            "https://store.steampowered.com/app/836620/Black_Desert/",
            "https://store.steampowered.com/app/49520/Borderlands_2/",
            "https://store.steampowered.com/app/397540/Borderlands_3/",
            "https://store.steampowered.com/app/730/CounterStrike_Global_Offensive/",
            "https://store.steampowered.com/app/601150/Devil_May_Cry_5/",
            "https://store.steampowered.com/app/782330/DOOM_Eternal/",
            "https://store.steampowered.com/app/239140/Dying_Light/",
            "https://store.steampowered.com/app/12210/Grand_Theft_Auto_IV_The_Complete_Edition/",
            "https://store.steampowered.com/app/271590/Grand_Theft_Auto_V/",
            "https://store.steampowered.com/app/412020/Metro_Exodus/",
            "https://store.steampowered.com/app/582010/MONSTER_HUNTER_WORLD/",
            "https://store.steampowered.com/app/218620/PAYDAY_2/",
            "https://store.steampowered.com/app/1174180/Red_Dead_Redemption_2/",
            "https://store.steampowered.com/app/883710/RESIDENT_EVIL_2__BIOHAZARD_RE2/",
            "https://store.steampowered.com/app/952060/RESIDENT_EVIL_3/",
            "https://store.steampowered.com/app/264710/Subnautica/",
            "https://www.playstation.com/en-us/games/the-last-of-us-remastered-ps4/",
            "https://worldofwarcraft.com/en-us/start",
            "https://www.epicgames.com/store/en-US/product/world-war-z/home"
    };

    static ArrayList<Game> getGameData() {
        ArrayList<Game> listGame = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            Game game = new Game();
            game.setTitle(title[i]);
            game.setRelease(release[i]);
            game.setDeveloper(developer[i]);
            game.setPublisher(publisher[i]);
            game.setGenre(genre[i]);
            game.setDescription(description[i]);
            game.setImage(image[i]);
            game.setScreenshot(imageScreenShot[i]);
            game.setLink(link[i]);
            listGame.add(game);
        }
        return listGame;
    }
}
