package com.meafocus.memoriacartoon02.events;

import com.meafocus.memoriacartoon02.events.engine.FlipDownCardsEvent;
import com.meafocus.memoriacartoon02.events.engine.GameWonEvent;
import com.meafocus.memoriacartoon02.events.engine.HidePairCardsEvent;
import com.meafocus.memoriacartoon02.events.ui.BackGameEvent;
import com.meafocus.memoriacartoon02.events.ui.FlipCardEvent;
import com.meafocus.memoriacartoon02.events.ui.NextGameEvent;
import com.meafocus.memoriacartoon02.events.ui.ResetBackgroundEvent;
import com.meafocus.memoriacartoon02.events.ui.ThemeSelectedEvent;
import com.meafocus.memoriacartoon02.events.ui.DifficultySelectedEvent;
import com.meafocus.memoriacartoon02.events.ui.StartEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();		
	}

}
