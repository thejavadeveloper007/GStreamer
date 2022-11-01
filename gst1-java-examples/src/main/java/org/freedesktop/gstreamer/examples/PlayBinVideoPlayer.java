/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2021 Neil C Smith.
 *
 * Copying and distribution of this file, with or without modification,
 * are permitted in any medium without royalty provided the copyright
 * notice and this notice are preserved.  This file is offered as-is,
 * without any warranty.
 *
 */
package org.freedesktop.gstreamer.examples;

import java.awt.BorderLayout;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.Timer;
import org.freedesktop.gstreamer.Bus;
import org.freedesktop.gstreamer.Element;
import org.freedesktop.gstreamer.ElementFactory;
import org.freedesktop.gstreamer.Format;
import org.freedesktop.gstreamer.Gst;
import org.freedesktop.gstreamer.Structure;
import org.freedesktop.gstreamer.elements.PlayBin;
import org.freedesktop.gstreamer.event.SeekFlags;
import org.freedesktop.gstreamer.message.Message;
import org.freedesktop.gstreamer.message.MessageType;

/**
 *
 * A simple video player using PlayBin and Swing.
 *
 * @author Neil C Smith (http://neilcsmith.net)
 */
public class PlayBinVideoPlayer {

    @SuppressWarnings("resource")
	public static void main(String[] args) throws URISyntaxException {
    	String url1 = "srt://hsg.demo.haivision.com:5175";
    	URI uri = new URI(url1);
        //String[] options1 = { "--network-caching","400" };
        Gst.init();
        EventQueue.invokeLater(() -> {

            // Create a Swing video display component
            SimpleVideoComponent vc1 = new SimpleVideoComponent();
           
            // Create a PlayBin element and set the AppSink from the Swing component
            // as the video sink.
            PlayBin playbin1 = new PlayBin("playbin1");
            playbin1.setVideoSink(vc1.getElement());
            
            // Create a level component and set it as the audio-filter property
            // on the playbin - this will post audio level messages to the bus -
            // see below how to display them.
//            Element level = ElementFactory.make("level", "level");
//            playbin1.set("audio-filter", level);

            // Create a GUI
            JFrame window = new JFrame("Video Player");
            
            //1st
            Canvas c1 = new Canvas();
            c1.setBackground(Color.black);
            c1.setVisible(true);
            
            vc1.add(c1);
            window.add(vc1);
            
            //2nd
            SimpleVideoComponent vc2 = new SimpleVideoComponent();
            PlayBin playbin2 = new PlayBin("playbin2");
            playbin2.setVideoSink(vc2.getElement());
            Canvas c2 = new Canvas();
            c2.setBackground(Color.black);
            c2.setVisible(true);
            vc2.add(c2);
            window.add(vc2);
            
            //3rd
            SimpleVideoComponent vc3 = new SimpleVideoComponent();
            PlayBin playbin3 = new PlayBin("playbin3");
            playbin3.setVideoSink(vc3.getElement());
            Canvas c3 = new Canvas();
            c3.setBackground(Color.black);
            c3.setVisible(true);
            vc3.add(c3);
            window.add(vc3);
            
            //4th
            SimpleVideoComponent vc4 = new SimpleVideoComponent();
            PlayBin playbin4 = new PlayBin("playbin4");
            playbin4.setVideoSink(vc4.getElement());
            Canvas c4 = new Canvas();
            c4.setBackground(Color.black);
            c4.setVisible(true);
            vc4.add(c4);
            window.add(vc4);
            
          //5th
            SimpleVideoComponent vc5 = new SimpleVideoComponent();
            PlayBin playbin5 = new PlayBin("playbin5");
            playbin5.setVideoSink(vc5.getElement());
            Canvas c5 = new Canvas();
            c5.setBackground(Color.black);
            c5.setVisible(true);
            vc5.add(c5);
            window.add(vc5);
            
            //6th
            SimpleVideoComponent vc6 = new SimpleVideoComponent();
            PlayBin playbin6 = new PlayBin("playbin6");
            playbin6.setVideoSink(vc6.getElement());
            Canvas c6 = new Canvas();
            c6.setBackground(Color.black);
            c6.setVisible(true);
            vc6.add(c6);
            window.add(vc6);
            
            //7th
            SimpleVideoComponent vc7 = new SimpleVideoComponent();
            PlayBin playbin7 = new PlayBin("playbin7");
            playbin7.setVideoSink(vc7.getElement());
            Canvas c7 = new Canvas();
            c7.setBackground(Color.black);
            c7.setVisible(true);
            vc7.add(c7);
            window.add(vc7);
            
            //8th
            SimpleVideoComponent vc8 = new SimpleVideoComponent();
            PlayBin playbin8 = new PlayBin("playbin8");
            playbin8.setVideoSink(vc8.getElement());
            Canvas c8 = new Canvas();
            c8.setBackground(Color.black);
            c8.setVisible(true);
            vc8.add(c8);
            window.add(vc8);
            
            //9th
            SimpleVideoComponent vc9 = new SimpleVideoComponent();
            PlayBin playbin9 = new PlayBin("playbin9");
            playbin9.setVideoSink(vc9.getElement());
            Canvas c9 = new Canvas();
            c9.setBackground(Color.black);
            c9.setVisible(true);
            vc9.add(c9);
            window.add(vc9);
            
            //10th
            SimpleVideoComponent vc10 = new SimpleVideoComponent();
            PlayBin playbin10 = new PlayBin("playbin10");
            playbin10.setVideoSink(vc10.getElement());
            Canvas c10 = new Canvas();
            c10.setBackground(Color.black);
            c10.setVisible(true);
            vc10.add(c10);
            window.add(vc10);
            
            //11th
            SimpleVideoComponent vc11 = new SimpleVideoComponent();
            PlayBin playbin11 = new PlayBin("playbin11");
            playbin11.setVideoSink(vc11.getElement());
            Canvas c11 = new Canvas();
            c11.setBackground(Color.black);
            c11.setVisible(true);
            vc11.add(c11);
            window.add(vc11);
            
            //12th
            SimpleVideoComponent vc12 = new SimpleVideoComponent();
            PlayBin playbin12 = new PlayBin("playbin12");
            playbin12.setVideoSink(vc12.getElement());
            Canvas c12 = new Canvas();
            c12.setBackground(Color.black);
            c12.setVisible(true);
            vc12.add(c12);
            window.add(vc12);
            
            //13th
            SimpleVideoComponent vc13 = new SimpleVideoComponent();
            PlayBin playbin13 = new PlayBin("playbin13");
            playbin13.setVideoSink(vc13.getElement());
            Canvas c13 = new Canvas();
            c13.setBackground(Color.black);
            c13.setVisible(true);
            vc13.add(c13);
            window.add(vc13);
            
            //14th
            SimpleVideoComponent vc14 = new SimpleVideoComponent();
            PlayBin playbin14 = new PlayBin("playbin14");
            playbin14.setVideoSink(vc14.getElement());
            Canvas c14 = new Canvas();
            c14.setBackground(Color.black);
            c14.setVisible(true);
            vc14.add(c14);
            window.add(vc14);
            
            //15th
            SimpleVideoComponent vc15 = new SimpleVideoComponent();
            PlayBin playbin15 = new PlayBin("playbin15");
            playbin15.setVideoSink(vc15.getElement());
            Canvas c15 = new Canvas();
            c15.setBackground(Color.black);
            c15.setVisible(true);
            vc15.add(c15);
            window.add(vc15);
            
            //16th
            SimpleVideoComponent vc16 = new SimpleVideoComponent();
            PlayBin playbin16 = new PlayBin("playbin16");
            playbin16.setVideoSink(vc16.getElement());
            Canvas c16 = new Canvas();
            c16.setBackground(Color.black);
            c16.setVisible(true);
            vc16.add(c16);
            window.add(vc16);
            
            //Frame properties
            window.setLocation(100,100);
            window.setSize(1650,1080);
            window.setLayout(new GridLayout(4, 4, 5, 5));
           // window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            
          //to play
            playbin1.setURI(uri);
            playbin1.play();
            
            playbin2.setURI(uri);
            playbin2.play();
            
            playbin3.setURI(uri);
            playbin3.play();
            
            playbin4.setURI(uri);
            playbin4.play();
            
            playbin5.setURI(uri);
            playbin5.play();
            
            playbin6.setURI(uri);
            playbin6.play();
            
            playbin7.setURI(uri);
            playbin7.play();
            
            playbin8.setURI(uri);
            playbin8.play();
            
            playbin9.setURI(uri);
            playbin9.play();
            
            playbin10.setURI(uri);
            playbin10.play();
            
            playbin11.setURI(uri);
            playbin11.play();
            
            playbin12.setURI(uri);
            playbin12.play();
            
            playbin13.setURI(uri);
            playbin13.play();
            
            playbin14.setURI(uri);
            playbin14.play();
            
            playbin15.setURI(uri);
            playbin15.play();
            
            playbin16.setURI(uri);
            playbin16.play();
            
            
            
            Box buttons1 = Box.createHorizontalBox();

//            JButton fileButton = new JButton("File...");
//            fileButton.addActionListener(e -> {
//                JFileChooser fileChooser = new JFileChooser();
//                int returnValue = fileChooser.showOpenDialog(window);
//                if (returnValue == JFileChooser.APPROVE_OPTION) {
//                    playbin1.stop();
//                    playbin1.setURI(fileChooser.getSelectedFile().toURI());
//                    playbin1.play();
//                }
//            });
           
         // quick and dirty level display using JProgressBar(common)
            Box levels = Box.createVerticalBox();
            JProgressBar leftLevel = new JProgressBar();
            leftLevel.setMaximumSize(new Dimension(200, 20));
            JProgressBar rightLevel = new JProgressBar();
            rightLevel.setMaximumSize(new Dimension(200, 20));
            levels.add(leftLevel);
            levels.add(rightLevel);
            
            JButton playButton1 = new JButton("Play");
            playButton1.addActionListener(e -> playbin1.play());
            JButton pauseButton1 = new JButton("Pause");
            pauseButton1.addActionListener(e -> playbin1.pause());

            // position slider
            JSlider position1 = new JSlider(0, 1000);
            position1.addChangeListener(e -> {
                if (position1.getValueIsAdjusting()) {
                    long dur = playbin1.queryDuration(Format.TIME);
                    long pos = playbin1.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position1.getValue() / 1000.0;
                        playbin1.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position1.getValueIsAdjusting()) {
                    long dur = playbin1.queryDuration(Format.TIME);
                    long pos = playbin1.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position1.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons1.add(playButton1);
            buttons1.add(pauseButton1);
            buttons1.add(position1);
            buttons1.add(levels);
            vc1.add(buttons1, BorderLayout.SOUTH);

            window.pack();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // listen for level messages on the bus
            playbin1.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin1.getClock().getTime()
                            - playbin1.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin1.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            
            //2nd buttons
            Box buttons2 = Box.createHorizontalBox();
            
            JButton playButton2 = new JButton("Play");
            playButton2.addActionListener(e -> playbin2.play());
            JButton pauseButton2 = new JButton("Pause");
            pauseButton2.addActionListener(e -> playbin2.pause());

            // position slider
            JSlider position2 = new JSlider(0, 1000);
            position2.addChangeListener(e -> {
                if (position2.getValueIsAdjusting()) {
                    long dur = playbin2.queryDuration(Format.TIME);
                    long pos = playbin2.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position2.getValue() / 1000.0;
                        playbin2.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position2.getValueIsAdjusting()) {
                    long dur = playbin2.queryDuration(Format.TIME);
                    long pos = playbin2.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position2.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons2.add(playButton2);
            buttons2.add(pauseButton2);
            buttons2.add(position2);
            buttons2.add(levels);
            vc2.add(buttons2, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin2.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin2.getClock().getTime()
                            - playbin2.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin2.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //3rd
            Box buttons3 = Box.createHorizontalBox();
            
            JButton playButton3 = new JButton("Play");
            playButton3.addActionListener(e -> playbin3.play());
            JButton pauseButton3 = new JButton("Pause");
            pauseButton3.addActionListener(e -> playbin3.pause());

            // position slider
            JSlider position3 = new JSlider(0, 1000);
            position3.addChangeListener(e -> {
                if (position3.getValueIsAdjusting()) {
                    long dur = playbin3.queryDuration(Format.TIME);
                    long pos = playbin3.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position3.getValue() / 1000.0;
                        playbin3.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position3.getValueIsAdjusting()) {
                    long dur = playbin3.queryDuration(Format.TIME);
                    long pos = playbin3.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position3.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons3.add(playButton3);
            buttons3.add(pauseButton3);
            buttons3.add(position3);
            buttons3.add(levels);
            vc3.add(buttons3, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin3.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin3.getClock().getTime()
                            - playbin3.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin3.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //4th
            Box buttons4 = Box.createHorizontalBox();
            
            JButton playButton4 = new JButton("Play");
            playButton2.addActionListener(e -> playbin4.play());
            JButton pauseButton4 = new JButton("Pause");
            pauseButton4.addActionListener(e -> playbin4.pause());

            // position slider
            JSlider position4 = new JSlider(0, 1000);
            position4.addChangeListener(e -> {
                if (position4.getValueIsAdjusting()) {
                    long dur = playbin4.queryDuration(Format.TIME);
                    long pos = playbin4.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position4.getValue() / 1000.0;
                        playbin4.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position4.getValueIsAdjusting()) {
                    long dur = playbin4.queryDuration(Format.TIME);
                    long pos = playbin4.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position4.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons4.add(playButton4);
            buttons4.add(pauseButton4);
            buttons4.add(position4);
            buttons4.add(levels);
            vc4.add(buttons4, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin4.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin4.getClock().getTime()
                            - playbin4.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin4.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //5th
            Box buttons5 = Box.createHorizontalBox();
            
            JButton playButton5 = new JButton("Play");
            playButton5.addActionListener(e -> playbin5.play());
            JButton pauseButton5 = new JButton("Pause");
            pauseButton5.addActionListener(e -> playbin5.pause());

            // position slider
            JSlider position5 = new JSlider(0, 1000);
            position5.addChangeListener(e -> {
                if (position5.getValueIsAdjusting()) {
                    long dur = playbin5.queryDuration(Format.TIME);
                    long pos = playbin5.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position5.getValue() / 1000.0;
                        playbin5.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position5.getValueIsAdjusting()) {
                    long dur = playbin5.queryDuration(Format.TIME);
                    long pos = playbin5.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position5.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons5.add(playButton5);
            buttons5.add(pauseButton5);
            buttons5.add(position5);
            buttons5.add(levels);
            vc5.add(buttons5, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin6.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin5.getClock().getTime()
                            - playbin5.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin5.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //6th
            Box buttons6 = Box.createHorizontalBox();
            
            JButton playButton6 = new JButton("Play");
            playButton6.addActionListener(e -> playbin6.play());
            JButton pauseButton6 = new JButton("Pause");
            pauseButton6.addActionListener(e -> playbin6.pause());

            // position slider
            JSlider position6 = new JSlider(0, 1000);
            position6.addChangeListener(e -> {
                if (position6.getValueIsAdjusting()) {
                    long dur = playbin6.queryDuration(Format.TIME);
                    long pos = playbin6.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position6.getValue() / 1000.0;
                        playbin6.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position6.getValueIsAdjusting()) {
                    long dur = playbin6.queryDuration(Format.TIME);
                    long pos = playbin6.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position6.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons6.add(playButton6);
            buttons6.add(pauseButton6);
            buttons6.add(position6);
            buttons6.add(levels);
            vc6.add(buttons6, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin6.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin6.getClock().getTime()
                            - playbin6.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin6.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //7th
            Box buttons7= Box.createHorizontalBox();
            
            JButton playButton7 = new JButton("Play");
            playButton7.addActionListener(e -> playbin7.play());
            JButton pauseButton7 = new JButton("Pause");
            pauseButton7.addActionListener(e -> playbin7.pause());

            // position slider
            JSlider position7 = new JSlider(0, 1000);
            position7.addChangeListener(e -> {
                if (position7.getValueIsAdjusting()) {
                    long dur = playbin7.queryDuration(Format.TIME);
                    long pos = playbin7.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position7.getValue() / 1000.0;
                        playbin7.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position7.getValueIsAdjusting()) {
                    long dur = playbin7.queryDuration(Format.TIME);
                    long pos = playbin7.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position7.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons7.add(playButton7);
            buttons7.add(pauseButton7);
            buttons7.add(position7);
            buttons2.add(levels);
            vc7.add(buttons7, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin7.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin7.getClock().getTime()
                            - playbin7.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin7.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //8th
            Box buttons8 = Box.createHorizontalBox();
            
            JButton playButton8 = new JButton("Play");
            playButton8.addActionListener(e -> playbin8.play());
            JButton pauseButton8 = new JButton("Pause");
            pauseButton8.addActionListener(e -> playbin8.pause());

            // position slider
            JSlider position8 = new JSlider(0, 1000);
            position8.addChangeListener(e -> {
                if (position8.getValueIsAdjusting()) {
                    long dur = playbin8.queryDuration(Format.TIME);
                    long pos = playbin8.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position8.getValue() / 1000.0;
                        playbin8.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position8.getValueIsAdjusting()) {
                    long dur = playbin8.queryDuration(Format.TIME);
                    long pos = playbin8.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position8.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons8.add(playButton8);
            buttons8.add(pauseButton8);
            buttons8.add(position8);
            buttons2.add(levels);
            vc8.add(buttons8, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin8.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin8.getClock().getTime()
                            - playbin8.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin8.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //9th
            Box buttons9 = Box.createHorizontalBox();
            
            JButton playButton9 = new JButton("Play");
            playButton9.addActionListener(e -> playbin9.play());
            JButton pauseButton9 = new JButton("Pause");
            pauseButton9.addActionListener(e -> playbin9.pause());

            // position slider
            JSlider position9 = new JSlider(0, 1000);
            position9.addChangeListener(e -> {
                if (position9.getValueIsAdjusting()) {
                    long dur = playbin9.queryDuration(Format.TIME);
                    long pos = playbin9.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position9.getValue() / 1000.0;
                        playbin9.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position9.getValueIsAdjusting()) {
                    long dur = playbin9.queryDuration(Format.TIME);
                    long pos = playbin9.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position9.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

       //     buttons1.add(fileButton);
            buttons9.add(playButton9);
            buttons9.add(pauseButton9);
            buttons9.add(position9);
            buttons9.add(levels);
            vc9.add(buttons9, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin9.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin9.getClock().getTime()
                            - playbin9.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 2);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin9.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 20);
                        }
                        if (levels.length >= 2) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            
            //10th
            Box buttons10 = Box.createHorizontalBox();
            
            JButton playButton10 = new JButton("Play");
            playButton10.addActionListener(e -> playbin10.play());
            JButton pauseButton10 = new JButton("Pause");
            pauseButton10.addActionListener(e -> playbin10.pause());

            // position slider
            JSlider position10 = new JSlider(0, 1000);
            position10.addChangeListener(e -> {
                if (position10.getValueIsAdjusting()) {
                    long dur = playbin10.queryDuration(Format.TIME);
                    long pos = playbin10.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position10.getValue() / 1000.0;
                        playbin10.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position10.getValueIsAdjusting()) {
                    long dur = playbin10.queryDuration(Format.TIME);
                    long pos = playbin10.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position10.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons10.add(playButton10);
            buttons10.add(pauseButton10);
            buttons10.add(position10);
            buttons10.add(levels);
            vc10.add(buttons10, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin10.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin10.getClock().getTime()
                            - playbin10.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin10.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //11th
            Box buttons11 = Box.createHorizontalBox();
            
            JButton playButton11 = new JButton("Play");
            playButton11.addActionListener(e -> playbin11.play());
            JButton pauseButton11 = new JButton("Pause");
            pauseButton11.addActionListener(e -> playbin11.pause());

            // position slider
            JSlider position11 = new JSlider(0, 1000);
            position11.addChangeListener(e -> {
                if (position11.getValueIsAdjusting()) {
                    long dur = playbin11.queryDuration(Format.TIME);
                    long pos = playbin11.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position11.getValue() / 1000.0;
                        playbin11.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position11.getValueIsAdjusting()) {
                    long dur = playbin11.queryDuration(Format.TIME);
                    long pos = playbin11.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position11.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons11.add(playButton11);
            buttons11.add(pauseButton11);
            buttons11.add(position11);
            buttons11.add(levels);
            vc11.add(buttons11, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin11.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin11.getClock().getTime()
                            - playbin11.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin11.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //12th
            Box buttons12 = Box.createHorizontalBox();
            
            JButton playButton12 = new JButton("Play");
            playButton12.addActionListener(e -> playbin12.play());
            JButton pauseButton12 = new JButton("Pause");
            pauseButton12.addActionListener(e -> playbin12.pause());

            // position slider
            JSlider position12 = new JSlider(0, 1000);
            position12.addChangeListener(e -> {
                if (position12.getValueIsAdjusting()) {
                    long dur = playbin12.queryDuration(Format.TIME);
                    long pos = playbin12.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position12.getValue() / 1000.0;
                        playbin12.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position12.getValueIsAdjusting()) {
                    long dur = playbin12.queryDuration(Format.TIME);
                    long pos = playbin12.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position12.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons12.add(playButton12);
            buttons12.add(pauseButton12);
            buttons12.add(position12);
            buttons12.add(levels);
            vc12.add(buttons12, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin12.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin12.getClock().getTime()
                            - playbin12.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin12.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            
            //13th
            Box buttons13 = Box.createHorizontalBox();
            
            JButton playButton13 = new JButton("Play");
            playButton13.addActionListener(e -> playbin13.play());
            JButton pauseButton13 = new JButton("Pause");
            pauseButton13.addActionListener(e -> playbin13.pause());

            // position slider
            JSlider position13 = new JSlider(0, 1000);
            position13.addChangeListener(e -> {
                if (position13.getValueIsAdjusting()) {
                    long dur = playbin13.queryDuration(Format.TIME);
                    long pos = playbin13.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position13.getValue() / 1000.0;
                        playbin13.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position13.getValueIsAdjusting()) {
                    long dur = playbin13.queryDuration(Format.TIME);
                    long pos = playbin13.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position13.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons13.add(playButton13);
            buttons13.add(pauseButton13);
            buttons13.add(position13);
            buttons13.add(levels);
            vc13.add(buttons13, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin13.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin13.getClock().getTime()
                            - playbin13.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin13.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //14th
            Box buttons14 = Box.createHorizontalBox();
            
            JButton playButton14 = new JButton("Play");
            playButton14.addActionListener(e -> playbin14.play());
            JButton pauseButton14 = new JButton("Pause");
            pauseButton14.addActionListener(e -> playbin14.pause());

            // position slider
            JSlider position14 = new JSlider(0, 1000);
            position14.addChangeListener(e -> {
                if (position14.getValueIsAdjusting()) {
                    long dur = playbin14.queryDuration(Format.TIME);
                    long pos = playbin14.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position14.getValue() / 1000.0;
                        playbin14.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position14.getValueIsAdjusting()) {
                    long dur = playbin14.queryDuration(Format.TIME);
                    long pos = playbin14.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position14.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons14.add(playButton14);
            buttons14.add(pauseButton14);
            buttons14.add(position14);
            buttons14.add(levels);
            vc14.add(buttons14, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin14.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin14.getClock().getTime()
                            - playbin14.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin14.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //15th
            Box buttons15 = Box.createHorizontalBox();
            
            JButton playButton15 = new JButton("Play");
            playButton15.addActionListener(e -> playbin15.play());
            JButton pauseButton15 = new JButton("Pause");
            pauseButton15.addActionListener(e -> playbin15.pause());

            // position slider
            JSlider position15 = new JSlider(0, 1000);
            position15.addChangeListener(e -> {
                if (position15.getValueIsAdjusting()) {
                    long dur = playbin15.queryDuration(Format.TIME);
                    long pos = playbin15.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position15.getValue() / 1000.0;
                        playbin15.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position15.getValueIsAdjusting()) {
                    long dur = playbin15.queryDuration(Format.TIME);
                    long pos = playbin15.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position15.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons15.add(playButton15);
            buttons15.add(pauseButton15);
            buttons15.add(position15);
            buttons15.add(levels);
            vc15.add(buttons15, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin15.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin15.getClock().getTime()
                            - playbin15.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin15.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
            
            //16th
            Box buttons16 = Box.createHorizontalBox();
            
            JButton playButton16 = new JButton("Play");
            playButton16.addActionListener(e -> playbin16.play());
            JButton pauseButton16 = new JButton("Pause");
            pauseButton16.addActionListener(e -> playbin16.pause());

            // position slider
            JSlider position16 = new JSlider(0, 1000);
            position16.addChangeListener(e -> {
                if (position16.getValueIsAdjusting()) {
                    long dur = playbin16.queryDuration(Format.TIME);
                    long pos = playbin16.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = position16.getValue() / 1000.0;
                        playbin16.seekSimple(Format.TIME,
                                EnumSet.of(SeekFlags.FLUSH, SeekFlags.KEY_UNIT),
                                (long) (relPos * dur));
                    }
                }
            });
            // sync slider position to video when not dragging
            new Timer(50, e -> {
                if (!position16.getValueIsAdjusting()) {
                    long dur = playbin16.queryDuration(Format.TIME);
                    long pos = playbin16.queryPosition(Format.TIME);
                    if (dur > 0) {
                        double relPos = (double) pos / dur;
                        position16.setValue((int) (relPos * 1000));
                    }
                }
            }).start();

//             buttons1.add(fileButton);
            buttons16.add(playButton16);
            buttons16.add(pauseButton16);
            buttons16.add(position16);
            buttons16.add(levels);
            vc16.add(buttons16, BorderLayout.SOUTH);

            // listen for level messages on the bus
            playbin16.getBus().connect("element", new Bus.MESSAGE() {

                @Override
                public void busMessage(Bus arg0, Message message) {
                    if (message.getType() == MessageType.ELEMENT
                            && message.getSource().getName().startsWith("level")) {
                        Structure struct = message.getStructure();
                        // We can get either rms or peak
                        double[] levels = struct.getDoubles("peak");
                        // Calculate the time offset required to get the level
                        // information in sync with the video display
                        long timeDelay = getTimeOffset(struct);
                        Gst.getExecutor().schedule(
                                () -> EventQueue.invokeLater(() -> updateLevelDisplay(levels)),
                                timeDelay, TimeUnit.NANOSECONDS);
                    }
                    message.dispose();
                }

                private long getTimeOffset(Structure struct) {
                    long actualTime = playbin16.getClock().getTime()
                            - playbin16.getBaseTime();
                    long runningTime = (long) struct.getValue("running-time");
                    long duration = (long) struct.getValue("duration");
                    long messageTime = runningTime + (duration / 10);
                    return messageTime - actualTime;
                }

                private void updateLevelDisplay(double[] levels) {
                    if (playbin16.isPlaying() && levels.length > 0) {
                        // convert levels for display
                        for (int i = 0; i < levels.length; i++) {
                            levels[i] = Math.pow(10, levels[i] / 100);
                        }
                        if (levels.length >= 10) {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[1] * 100, 100)));
                        } else {
                            leftLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                            rightLevel.setValue((int) Math.max(0, Math.min(levels[0] * 100, 100)));
                        }
                    } else {
                        leftLevel.setValue(0);
                        rightLevel.setValue(0);
                    }
                }
            });
        });
    }

}
