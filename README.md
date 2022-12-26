# PurpurAway

A PAPI Expansion to get a placeholder out of Purpur's AFK System.

## Requirements

You must have [PlaceholderAPI](https://github.com/PlaceholderAPI/PlaceholderAPI) and Purpur's AFK system must be operational, this means...

> `server.properties`: `player-idle-timeout` must be a non-negative integer greater than 0.
> 
> `purpur.yml`: `kick-if-idle` must be false, found [here](https://purpurmc.org/docs/Configuration/kick-if-idle).

> **Note**
> 
> `kick-if-idle` must be false, otherwise people would just be kicked when AFK, in which case you would not need this.
> 
> You can alter the AFK messages using these [Purpur Config Options](https://purpurmc.org/docs/Configuration/messages).

## Features

`%purpur-away_status%`
> This placeholder can now be used.

`/afk`
> Sets you as AFK if you are opped or have the `purpuraway.afk` permission.