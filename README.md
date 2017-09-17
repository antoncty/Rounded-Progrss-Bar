# Rounded-Progrss-Bar

Widget is placed app/src/main/java/com/cti/roundedprogressbar/widget (there is Java code of Bar) <br/>
Attributes for this widged app/src/main/res/values/attrs.xml

Add in xml-layout file:
```xml
<com.cti.roundedprogressbar.widget.CustomProgressBar
        android:id="@+id/CustomProgressBar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:colorBar="@color/colorGray"     <!-- Color of back bar line -->
        app:colorBar_progress="@color/colorAccent"  <!-- Color of progress bar line -->
        app:colorBar_text="@color/colorPrimary"   <!-- Color of text -->
        app:smallText="Small text"                <!-- Small text will view in center of bar -->
        />
```   
        
![screenshot_20170917-165015](https://user-images.githubusercontent.com/16565605/30521994-6e989114-9bc9-11e7-8f22-ed1a6f6e6af1.png)

![screenshot_20170917-164956](https://user-images.githubusercontent.com/16565605/30522019-d094f5a6-9bc9-11e7-953e-a9aace307ebb.png)

