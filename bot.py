#!/usr/bin/env python3
import os
import discord
from discord.ext import commands
import subprocess
#from dotenv import load_dotenv
from discord.ext import commands
from discord.utils import get
import discord
import discord
from discord.ext import commands

from discord.voice_client import VoiceClient

import asyncio
from discord import FFmpegPCMAudio

from discord.ext.commands import Bot
from discord.voice_client import VoiceClient
import asyncio

bot = commands.Bot(command_prefix = "/")
# loads the token from the .env file
#load_dotenv()
TOKEN = "NjQwMjU1ODM0NjU5NDg3Nzcw.Xb3Ktg.-dZ2puhGXOcBfEztVzGW8Q8CIZ0"



@bot.event
async def on_ready():
    await bot.change_presence(status=discord.Status.online, activity=discord.Game("Sucking Dick"))
    print(f'{bot.user} has connected to Discord!')

@bot.command(pass_context=True, aliases=['j', 'jo'])
async def join(ctx):
    global voice
    channel = ctx.message.author.voice.channel
    voice = get(bot.voice_clients, guild=ctx.guild)
    if voice and voice.is_connected():
        await voice.move_to(channel)
    else:
        voice = await channel.connect()

    await voice.disconnect()

    if voice and voice.is_connected():
        await voice.move_to(channel)
    else:
        voice = await channel.connect()
        print(f"The bot has connected to {channel}\n")
    await ctx.send(f"Joined {channel}")


@bot.command()
async def ping(ctx):
    await ctx.send(f'`Pong! {round(bot.latency * 1000)} ms`')


bot.run(TOKEN)