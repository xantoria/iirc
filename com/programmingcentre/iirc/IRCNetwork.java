package com.programmingcentre.iirc;

/*
 * @author Giftiger Wunsch [Rob Moore]
 * @date 2012-09-30
 *
 * Represents an IRC network.
 *
 */

import java.util.List;
import java.net.Socket;
import java.util.Vector;

class IRCNetwork
{
private String name;
private List<String> hosts;

private IRCIdentity user_id;

public IRCNetwork(String n,List<String> h)
 {
 if(h==null)
  throw new IllegalArgumentException("The network must have at least one host.");
 
 name=(n!=null?n:"Unnamed network");
 hosts=h;
 }

}