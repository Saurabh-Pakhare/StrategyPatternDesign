package com.ee;

/**
 * Created by saurabh on 7/9/16.
 */
enum PlayingStrategy {

    T20 {
        @Override
        public String play() {
            return "Playing Aggressive";
        }

    },

    ONE_DAY {

        @Override
        public String play() {
            return "Playing Aggressive and Defensive as needed";
        }

    },

    TEST {

        @Override
        public String play() {
            return "Playing Defensive";
        }

    };

    abstract public String play();

}
