package com.shangdong.hotel;

import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Winson on 2018/6/30.
 */
public class Utils {

    public static void recordBootTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String path = Environment.getExternalStorageDirectory().getPath();
                File record = new File(path + "/test.txt");
                try {
                    FileOutputStream out = new FileOutputStream(record);
                    Date date = new Date();
                    out.write(date.toString().getBytes());
                    out.flush();
                    out.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public static void recordMountedTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String path = Environment.getExternalStorageDirectory().getPath();
                File record = new File(path + "/test2.txt");
                try {
                    FileOutputStream out = new FileOutputStream(record);
                    Date date = new Date();
                    out.write(date.toString().getBytes());
                    out.flush();
                    out.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public static void recordUnmountedTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String path = Environment.getExternalStorageDirectory().getPath();
                File record = new File(path + "/test3.txt");
                try {
                    FileOutputStream out = new FileOutputStream(record);
                    Date date = new Date();
                    out.write(date.toString().getBytes());
                    out.flush();
                    out.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
