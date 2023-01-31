package com.meafocus.memoriacartoon02.events;

import com.meafocus.memoriacartoon02.events.engine.FlipDownCardsEvent;
import com.meafocus.memoriacartoon02.events.engine.GameWonEvent;
import com.meafocus.memoriacartoon02.events.engine.HidePairCardsEvent;
import com.meafocus.memoriacartoon02.events.ui.BackGameEvent;
import com.meafocus.memoriacartoon02.events.ui.DifficultySelectedEvent;
import com.meafocus.memoriacartoon02.events.ui.FlipCardEvent;
import com.meafocus.memoriacartoon02.events.ui.NextGameEvent;
import com.meafocus.memoriacartoon02.events.ui.ResetBackgroundEvent;
import com.meafocus.memoriacartoon02.events.ui.StartEvent;
import com.meafocus.memoriacartoon02.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
