package com.programmingcentre.iirc;

/*
 * @author Giftiger Wunsch [Rob Moore]
 * @date 2012-09-30
 *
 * Represents identity information for a user on a particular IRC server.
 *
 */

class IRCIdentity
{
private String username;
private String nickname;
private byte[] password;

public IRCIdentity(String us,String nck,byte[] pwd)
 {
 username=us;
 nickname=nck;
 password=pwd;
 }
public String getUsername()
 {
 return username;
 }
public String getNick()
 {
 return nickname;
 }
public byte[] getPassword()
 {
 return password;
 }
}