package net.sourceforge.peers.android;

import java.net.InetAddress;

import android.util.Log;

import net.sourceforge.peers.Config;
import net.sourceforge.peers.media.MediaMode;
import net.sourceforge.peers.sip.syntaxencoding.SipURI;

public class AndroidConfig implements Config {

	@Override
	public String getDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InetAddress getLocalInetAddress() {
		try {
			return InetAddress.getLocalHost();
		} catch (Exception e) {
			Log.e(AndroidLogger.TAG, e.getMessage(), e);
		}
		return null;
	}

	@Override
	public String getMediaFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MediaMode getMediaMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SipURI getOutboundProxy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InetAddress getPublicInetAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRtpPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSipPort() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUserPart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMediaDebug() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDomain(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLocalInetAddress(InetAddress arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMediaDebug(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMediaFile(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMediaMode(MediaMode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOutboundProxy(SipURI arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPassword(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPublicInetAddress(InetAddress arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRtpPort(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSipPort(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUserPart(String arg0) {
		// TODO Auto-generated method stub

	}

}
