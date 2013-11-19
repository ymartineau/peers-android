package net.sourceforge.peers.android;

import java.net.SocketException;

import net.sourceforge.peers.Config;
import net.sourceforge.peers.Logger;
import net.sourceforge.peers.media.AbstractSoundManager;
import net.sourceforge.peers.sip.core.useragent.SipListener;
import net.sourceforge.peers.sip.core.useragent.UserAgent;
import net.sourceforge.peers.sip.transport.SipRequest;
import net.sourceforge.peers.sip.transport.SipResponse;

public class EventManager implements SipListener {

	private UserAgent userAgent;
	private Config config;
	private AbstractSoundManager soundManager;
	private Logger logger;
	
	public EventManager() {
		config = new AndroidConfig();
		soundManager = new AndroidSoundManager();
		logger = new AndroidLogger();
		try {
			userAgent = new UserAgent(this, config, logger, soundManager);
		} catch (SocketException e) {
			logger.error("SocketException", e);
		}
	}
	
	@Override
	public void calleePickup(SipResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void error(SipResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void incomingCall(SipRequest arg0, SipResponse arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void registerFailed(SipResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void registerSuccessful(SipResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void registering(SipRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remoteHangup(SipRequest arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ringing(SipResponse arg0) {
		// TODO Auto-generated method stub
		
	}
}
