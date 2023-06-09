package com.pasta.mushtutors.manager;

import com.pasta.mushtutors.utils.util.DisplayUtil;
import com.pasta.mushtutors.utils.util.NoStackTraceThrowable;
import com.pasta.mushtutors.utils.util.SystemUtil;
import com.pasta.mushtutors.utils.util.URLReader;

import java.util.ArrayList;
import java.util.List;

public class HWIDManager {

    /**
     * Your pastebin URL goes inside the empty string below.
     * It should be a raw pastebin link, for example: pastebin.com/raw/pasteid
     */

    public static final String pastebinURL = "https://pastebin.com/raw/5nPFcWtU";

    public static List<String> hwids = new ArrayList<>();

    public static void hwidCheck() {
        hwids = URLReader.readURL();
        boolean isHwidPresent = hwids.contains(SystemUtil.getSystemInfo());
        if (!isHwidPresent) {
            DisplayUtil.Display();
            throw new NoStackTraceThrowable("");
        }
    }
}
