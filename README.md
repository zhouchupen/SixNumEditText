# SixNumEditText

Android仿微信六位数字输入框

![](http://upload-images.jianshu.io/upload_images/2746415-065c610b8bd24d41.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


## Installing

Users of your library will need add the jitpack.io repository:

```gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

and:

```gradle
dependencies {
    compile 'com.github.zhouchupen:SixNumEditText:v1.0'
}
```

Note: do not add the jitpack.io repository under `buildscript` 

## Adding a sample app 

If you add a sample app to the same repo then your app needs to depend on the library. To do this in your app/build.gradle add a dependency in the form:

```gradle
dependencies {
    compile project(':library')
}
```

where 'library' is the name of your library module.

## Using

You may need this to use the edittext.  Put this into your xml file:
```xml
<com.scnu.zhou.widget.SixNumEditText
     android:id="@+id/sixNumEditText"
     android:layout_width="match_parent"
     android:layout_height="wrap_content">

</com.scnu.zhou.widget.SixNumEditText>
```
If you want to input a number, take this:
```java
sixNumEditText.input(number);
```
And if you want to backspace, take this:
```java
sixNumEditText.backspace();
```
You also be able to know when is finished input:
```java
sixNumEditText.setOnCompleteInputListener(new SixNumEditText.OnCompleteInputListener() {
        @Override
        public void onCompleteInput() {
            // finished input
        }
});
```
