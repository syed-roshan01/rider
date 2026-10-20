package l3;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import k4.j;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f11262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f11263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f11265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f11266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f11267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f11247l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f11248m = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f11249n = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f11250o = {8, 8, 8};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f11251p = {8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f11252q = {-1, -40, -1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f11253r = {102, 116, 121, 112};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f11254s = {109, 105, 102, 49};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f11255t = {104, 101, 105, 99};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f11256u = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f11257v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f11258w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f11259x = {101, 88, 73, 102};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f11260y = {73, 72, 68, 82};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f11261z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i10 >= dVarArr6.length) {
                HashMap map = M;
                d[] dVarArr7 = I;
                map.put(Integer.valueOf(dVarArr7[0].f11241a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f11241a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f11241a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f11241a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f11241a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f11241a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i10] = new HashMap();
            K[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                J[i10].put(Integer.valueOf(dVar.f11241a), dVar);
                K[i10].put(dVar.f11242b, dVar);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public g(j jVar) throws IOException {
        d[][] dVarArr = H;
        this.f11265d = new HashMap[dVarArr.length];
        this.f11266e = new HashSet(dVarArr.length);
        this.f11267f = ByteOrder.BIG_ENDIAN;
        boolean z10 = jVar instanceof AssetManager.AssetInputStream;
        boolean z11 = f11247l;
        if (z10) {
            this.f11263b = (AssetManager.AssetInputStream) jVar;
            this.f11262a = null;
        } else if (jVar instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) jVar;
            try {
                h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f11263b = null;
                this.f11262a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z11) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f11263b = null;
                this.f11262a = null;
            }
        } else {
            this.f11263b = null;
            this.f11262a = null;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                try {
                    this.f11265d[i10] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z11) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z11) {
                    return;
                }
            } catch (UnsupportedOperationException e10) {
                e = e10;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z11) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(jVar, 5000);
        int iF = f(bufferedInputStream);
        this.f11264c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.f11264c;
            if (i11 == 4) {
                e(bVar, 0, 0);
            } else if (i11 == 13) {
                h(bVar);
            } else if (i11 == 9) {
                i(bVar);
            } else if (i11 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.f11264c;
            if (i12 == 12) {
                d(fVar);
            } else if (i12 == 7) {
                g(fVar);
            } else if (i12 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.b(this.f11269h);
            u(fVar);
        }
        a();
        if (!z11) {
            return;
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s9 = bVar.readShort();
        boolean z10 = f11247l;
        if (s9 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s9 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s9));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f11265d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(N);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f11267f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f11267f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f11267f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f11267f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            if (!L.contains(str)) {
                return cVarC.f(this.f11267f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarC.f11237a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f11267f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f11245a / eVar.f11246b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f11245a / eVar2.f11246b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f11245a / eVar3.f11246b)));
            }
            try {
                return Double.toString(cVarC.d(this.f11267f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f11247l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            c cVar = (c) this.f11265d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f11265d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f11267f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f11267f));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i10, this.f11267f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i12);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (fVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f11269h = i14;
                    r(0, bArr2);
                }
                if (f11247l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[LOOP:2: B:69:0x013c->B:74:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x018d A[LOOP:0: B:10:0x0034->B:82:0x018d, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(l3.b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.g.e(l3.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x0147 A[LOOP:3: B:111:0x013b->B:116:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0150  */
    /* JADX WARN: Code duplicated, block: B:123:0x015a A[LOOP:4: B:118:0x014b->B:123:0x015a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0160 A[LOOP:2: B:106:0x012f->B:126:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0159 A[EDGE_INSN: B:157:0x0159->B:122:0x0159 BREAK  A[LOOP:3: B:111:0x013b->B:116:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0159 A[EDGE_INSN: B:159:0x0159->B:122:0x0159 BREAK  A[LOOP:3: B:111:0x013b->B:116:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        ?? r10;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        b bVar5;
        int i10;
        byte[] bArr;
        int i11;
        byte[] bArr2;
        int i12;
        byte[] bArr3;
        b bVar6;
        boolean z10;
        short s9;
        boolean z11;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr5 = f11252q;
            if (i13 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i13] != bArr5[i13]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i14 = 0; i14 < bytes.length; i14++) {
                    byte b10 = bArr4[i14];
                    ?? r11 = bytes[i14];
                    try {
                        if (b10 != r11) {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                bVar = new b(bArr4);
                                                try {
                                                    long j11 = bVar.readInt();
                                                    byte[] bArr6 = new byte[4];
                                                    bVar.read(bArr6);
                                                    if (Arrays.equals(bArr6, f11253r)) {
                                                        if (j11 == 1) {
                                                            j11 = bVar.readLong();
                                                            j10 = 16;
                                                            if (j11 < 16) {
                                                            }
                                                        } else {
                                                            j10 = 8;
                                                        }
                                                        long j12 = 5000;
                                                        if (j11 > j12) {
                                                            j11 = j12;
                                                        }
                                                        long j13 = j11 - j10;
                                                        if (j13 >= 8) {
                                                            byte[] bArr7 = new byte[4];
                                                            boolean z12 = false;
                                                            boolean z13 = false;
                                                            for (long j14 = 0; j14 < j13 / 4 && bVar.read(bArr7) == 4; j14++) {
                                                                if (j14 != 1) {
                                                                    if (Arrays.equals(bArr7, f11254s)) {
                                                                        z12 = true;
                                                                    } else if (Arrays.equals(bArr7, f11255t)) {
                                                                        z13 = true;
                                                                    }
                                                                    if (z12 && z13) {
                                                                        bVar.close();
                                                                        return 12;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        bArr = f11258w;
                                                        if (i10 < bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i10] != bArr[i10]) {
                                                            i11 = 0;
                                                            while (true) {
                                                                bArr2 = A;
                                                                if (i11 < bArr2.length) {
                                                                    i12 = 0;
                                                                    while (true) {
                                                                        bArr3 = B;
                                                                        if (i12 < bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                                            break;
                                                                        }
                                                                        i12++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i11] != bArr2[i11]) {
                                                                        break;
                                                                    }
                                                                    i11++;
                                                                }
                                                            }
                                                            return 0;
                                                        }
                                                        i10++;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    if (f11247l) {
                                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                    }
                                                    if (bVar != null) {
                                                    }
                                                    bVar3 = new b(bArr4);
                                                    ByteOrder byteOrderQ = q(bVar3);
                                                    this.f11267f = byteOrderQ;
                                                    bVar3.f11234b = byteOrderQ;
                                                    s9 = bVar3.readShort();
                                                    if (s9 != 20306) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    bVar3.close();
                                                    if (z11) {
                                                        return 7;
                                                    }
                                                    bVar6 = new b(bArr4);
                                                    ByteOrder byteOrderQ2 = q(bVar6);
                                                    this.f11267f = byteOrderQ2;
                                                    bVar6.f11234b = byteOrderQ2;
                                                    if (bVar6.readShort() == 85) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    bVar6.close();
                                                    if (z10) {
                                                        return 10;
                                                    }
                                                    i10 = 0;
                                                    while (true) {
                                                        bArr = f11258w;
                                                        if (i10 < bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i10] != bArr[i10]) {
                                                            i11 = 0;
                                                            while (true) {
                                                                bArr2 = A;
                                                                if (i11 < bArr2.length) {
                                                                    i12 = 0;
                                                                    while (true) {
                                                                        bArr3 = B;
                                                                        if (i12 < bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i12++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i11] != bArr2[i11]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i11++;
                                                                }
                                                            }
                                                            return 0;
                                                        }
                                                        i10++;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                bVar = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                r10 = 0;
                                                if (r10 != 0) {
                                                    r10.close();
                                                }
                                                throw th;
                                            }
                                            ByteOrder byteOrderQ3 = q(bVar6);
                                            this.f11267f = byteOrderQ3;
                                            bVar6.f11234b = byteOrderQ3;
                                            if (bVar6.readShort() == 85) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            bVar6.close();
                                            if (z10) {
                                                return 10;
                                            }
                                        } catch (Exception unused) {
                                            bVar5 = bVar6;
                                            if (bVar5 != null) {
                                                bVar5.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar4 = bVar6;
                                            if (bVar4 != null) {
                                                bVar4.close();
                                            }
                                            throw th;
                                        }
                                        bVar6 = new b(bArr4);
                                    } catch (Exception unused2) {
                                        bVar5 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bVar4 = null;
                                    }
                                    ByteOrder byteOrderQ4 = q(bVar3);
                                    this.f11267f = byteOrderQ4;
                                    bVar3.f11234b = byteOrderQ4;
                                    s9 = bVar3.readShort();
                                    if (s9 != 20306 || s9 == 21330) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    bVar3.close();
                                    if (z11) {
                                        return 7;
                                    }
                                } catch (Exception unused3) {
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar2 = bVar3;
                                    if (bVar2 != null) {
                                        bVar2.close();
                                    }
                                    throw th;
                                }
                                bVar3 = new b(bArr4);
                            } catch (Exception unused4) {
                                bVar3 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar2 = null;
                            }
                            bVar.close();
                            i10 = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r10 = r11;
                    }
                }
                return 9;
            }
            i13++;
        }
    }

    public final void g(f fVar) throws IOException {
        int i10;
        int i11;
        j(fVar);
        HashMap[] mapArr = this.f11265d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f11240d);
            fVar2.f11234b = this.f11267f;
            byte[] bArr = f11256u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f11257v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f11267f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f11267f);
                c cVarC2 = c.c(i15, this.f11267f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (f11247l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f11234b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f11258w;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f11260y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f11261z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f11259x)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + i1.b.f(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f11269h = i11;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z10 = f11247l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f11235c);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f11235c);
        bVar.f11234b = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == G.f11241a) {
                short s9 = bVar.readShort();
                short s10 = bVar.readShort();
                c cVarC = c.c(s9, this.f11267f);
                c cVarC2 = c.c(s10, this.f11267f);
                HashMap[] mapArr = this.f11265d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s9) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f11264c == 8) {
            HashMap[] mapArr = this.f11265d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f11240d);
                fVar2.f11234b = this.f11267f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (f11247l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f11265d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f11240d), (int) cVar.f11239c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (f11247l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f11234b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(A.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f11269h = i12;
                        r(0, bArr3);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + i1.b.f(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f11267f);
        int iE2 = cVar2.e(this.f11267f);
        if (this.f11264c == 7) {
            iE += this.f11270i;
        }
        if (iE > 0 && iE2 > 0 && this.f11263b == null && this.f11262a == null) {
            bVar.skip(iE);
            bVar.read(new byte[iE2]);
        }
        if (f11247l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f11267f) <= 512 && cVar2.e(this.f11267f) <= 512;
    }

    public final void o(b bVar) throws IOException {
        ByteOrder byteOrderQ = q(bVar);
        this.f11267f = byteOrderQ;
        bVar.f11234b = byteOrderQ;
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f11264c;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException(q.g("Invalid first Ifd offset: ", i11));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.a(i12);
        }
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f11265d;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbQ = a7.a.q("The size of tag group[", i10, "]: ");
            sbQ.append(mapArr[i10].size());
            Log.d("ExifInterface", sbQ.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f11267f) + "'");
            }
            i10++;
        }
    }

    public final void r(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0220  */
    /* JADX WARN: Code duplicated, block: B:107:0x022d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0232  */
    /* JADX WARN: Code duplicated, block: B:109:0x023e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0245  */
    /* JADX WARN: Code duplicated, block: B:114:0x0260  */
    /* JADX WARN: Code duplicated, block: B:116:0x026d  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x027c  */
    /* JADX WARN: Code duplicated, block: B:120:0x029b  */
    /* JADX WARN: Code duplicated, block: B:122:0x029f  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:140:0x0329  */
    /* JADX WARN: Code duplicated, block: B:164:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0199  */
    /* JADX WARN: Code duplicated, block: B:82:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0212  */
    /* JADX WARN: Code duplicated, block: B:96:0x0215  */
    /* JADX WARN: Code duplicated, block: B:98:0x0218  */
    /* JADX WARN: Instruction removed from duplicated block: B:119:0x027c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x029f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x0174, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01f7, please report this as an issue */
    public final void s(f fVar, int i10) throws IOException {
        HashMap[] mapArr;
        boolean z10;
        boolean z11;
        short s9;
        HashSet hashSet;
        int i11;
        long j10;
        boolean z12;
        int i12;
        Integer num;
        long j11;
        String str;
        int unsignedShort;
        long j12;
        HashSet hashSet2;
        int i13;
        Integer numValueOf = Integer.valueOf(fVar.f11235c);
        HashSet hashSet3 = this.f11266e;
        hashSet3.add(numValueOf);
        short s10 = fVar.readShort();
        boolean z13 = f11247l;
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s10));
        }
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (true) {
            mapArr = this.f11265d;
            if (s11 >= s10) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i14 = fVar.readInt();
            short s12 = s11;
            long j13 = ((long) fVar.f11235c) + 4;
            d dVar = (d) J[i10].get(Integer.valueOf(unsignedShort2));
            if (z13) {
                Object[] objArr = new Object[5];
                z11 = false;
                objArr[0] = Integer.valueOf(i10);
                z10 = true;
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = dVar != null ? dVar.f11242b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i14);
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            } else {
                z10 = true;
                z11 = false;
            }
            if (dVar == null) {
                if (z13) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                s9 = s10;
                hashSet = hashSet3;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = E;
                    if (unsignedShort3 < iArr.length) {
                        int i15 = dVar.f11243c;
                        s9 = s10;
                        if (i15 == 7 || unsignedShort3 == 7 || i15 == unsignedShort3 || (i12 = dVar.f11244d) == unsignedShort3) {
                            hashSet = hashSet3;
                        } else {
                            hashSet = hashSet3;
                            if (((i15 != 4 && i12 != 4) || unsignedShort3 != 3) && (((i15 != 9 && i12 != 9) || unsignedShort3 != 8) && ((i15 != 12 && i12 != 12) || unsignedShort3 != 11))) {
                                if (z13) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + D[unsignedShort3] + ") is unexpected for tag: " + dVar.f11242b);
                                }
                            }
                        }
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i15;
                        }
                        i11 = unsignedShort2;
                        j10 = ((long) i14) * ((long) iArr[unsignedShort3]);
                        if (j10 < 0 || j10 > 2147483647L) {
                            if (z13) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i14);
                            }
                            z12 = z11;
                        } else {
                            z12 = z10;
                        }
                    }
                    if (z12) {
                        if (j10 > 4) {
                            i13 = fVar.readInt();
                            if (z13) {
                                Log.d("ExifInterface", "seek to data offset: " + i13);
                            }
                            if (this.f11264c == 7) {
                                if ("MakerNote".equals(dVar.f11242b)) {
                                    this.f11270i = i13;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f11242b)) {
                                    this.f11271j = i13;
                                    this.f11272k = i14;
                                    c cVarC = c.c(6, this.f11267f);
                                    c cVarA = c.a(this.f11271j, this.f11267f);
                                    c cVarA2 = c.a(this.f11272k, this.f11267f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.b(i13);
                        } else {
                            j13 = j13;
                            i14 = i14;
                            dVar = dVar;
                        }
                        num = (Integer) M.get(Integer.valueOf(i11));
                        if (z13) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j12 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j12 = -1;
                                }
                                if (z13) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f11242b));
                                }
                                if (j12 > 0) {
                                    hashSet2 = hashSet;
                                    if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                                        fVar.b(j12);
                                        s(fVar, num.intValue());
                                    } else if (z13) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                    }
                                } else {
                                    hashSet2 = hashSet;
                                    if (z13) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                                    }
                                }
                                fVar.b(j13);
                                hashSet = hashSet2;
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j12 = unsignedShort;
                            if (z13) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f11242b));
                            }
                            if (j12 > 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                                    fVar.b(j12);
                                    s(fVar, num.intValue());
                                } else if (z13) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                }
                            } else {
                                hashSet2 = hashSet;
                                if (z13) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                                }
                            }
                            fVar.b(j13);
                            hashSet = hashSet2;
                        } else {
                            d dVar2 = dVar;
                            j11 = j13;
                            int i16 = fVar.f11235c + this.f11269h;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            hashSet = hashSet;
                            c cVar = new c(i16, bArr, unsignedShort3, i14);
                            mapArr[i10].put(dVar2.f11242b, cVar);
                            str = dVar2.f11242b;
                            if ("DNGVersion".equals(str)) {
                                this.f11264c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f11267f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f11267f) == 65535)) {
                                this.f11264c = 8;
                            }
                            if (fVar.f11235c != j11) {
                                fVar.b(j11);
                            }
                        }
                    } else {
                        fVar.b(j13);
                    }
                    s11 = (short) (s12 + 1);
                    s10 = s9;
                    hashSet3 = hashSet;
                }
                s9 = s10;
                hashSet = hashSet3;
                i11 = unsignedShort2;
                if (z13) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                z12 = z11;
                j10 = 0;
                if (z12) {
                    fVar.b(j13);
                } else {
                    if (j10 > 4) {
                        i13 = fVar.readInt();
                        if (z13) {
                            Log.d("ExifInterface", "seek to data offset: " + i13);
                        }
                        if (this.f11264c == 7) {
                            if ("MakerNote".equals(dVar.f11242b)) {
                                this.f11270i = i13;
                            } else if (i10 != 6) {
                            }
                        }
                        fVar.b(i13);
                    } else {
                        j13 = j13;
                        i14 = i14;
                        dVar = dVar;
                    }
                    num = (Integer) M.get(Integer.valueOf(i11));
                    if (z13) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j12 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z13) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f11242b));
                            }
                            if (j12 > 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                                    fVar.b(j12);
                                    s(fVar, num.intValue());
                                } else if (z13) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                }
                            } else {
                                hashSet2 = hashSet;
                                if (z13) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                                }
                            }
                            fVar.b(j13);
                            hashSet = hashSet2;
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j12 = unsignedShort;
                        if (z13) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f11242b));
                        }
                        if (j12 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                                fVar.b(j12);
                                s(fVar, num.intValue());
                            } else if (z13) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                            }
                        } else {
                            hashSet2 = hashSet;
                            if (z13) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                            }
                        }
                        fVar.b(j13);
                        hashSet = hashSet2;
                    } else {
                        d dVar3 = dVar;
                        j11 = j13;
                        int i17 = fVar.f11235c + this.f11269h;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        hashSet = hashSet;
                        c cVar2 = new c(i17, bArr2, unsignedShort3, i14);
                        mapArr[i10].put(dVar3.f11242b, cVar2);
                        str = dVar3.f11242b;
                        if ("DNGVersion".equals(str)) {
                            this.f11264c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f11264c = 8;
                        if (fVar.f11235c != j11) {
                            fVar.b(j11);
                        }
                    }
                }
                s11 = (short) (s12 + 1);
                s10 = s9;
                hashSet3 = hashSet;
            }
            i11 = unsignedShort2;
            z12 = z11;
            j10 = 0;
            if (z12) {
                fVar.b(j13);
            } else {
                if (j10 > 4) {
                    i13 = fVar.readInt();
                    if (z13) {
                        Log.d("ExifInterface", "seek to data offset: " + i13);
                    }
                    if (this.f11264c == 7) {
                        if ("MakerNote".equals(dVar.f11242b)) {
                            this.f11270i = i13;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.b(i13);
                } else {
                    j13 = j13;
                    i14 = i14;
                    dVar = dVar;
                }
                num = (Integer) M.get(Integer.valueOf(i11));
                if (z13) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j12 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z13) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f11242b));
                        }
                        if (j12 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                                fVar.b(j12);
                                s(fVar, num.intValue());
                            } else if (z13) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                            }
                        } else {
                            hashSet2 = hashSet;
                            if (z13) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                            }
                        }
                        fVar.b(j13);
                        hashSet = hashSet2;
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j12 = unsignedShort;
                    if (z13) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f11242b));
                    }
                    if (j12 > 0) {
                        hashSet2 = hashSet;
                        if (!hashSet2.contains(Integer.valueOf((int) j12))) {
                            fVar.b(j12);
                            s(fVar, num.intValue());
                        } else if (z13) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                        }
                    } else {
                        hashSet2 = hashSet;
                        if (z13) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                        }
                    }
                    fVar.b(j13);
                    hashSet = hashSet2;
                } else {
                    d dVar4 = dVar;
                    j11 = j13;
                    int i18 = fVar.f11235c + this.f11269h;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    hashSet = hashSet;
                    c cVar3 = new c(i18, bArr3, unsignedShort3, i14);
                    mapArr[i10].put(dVar4.f11242b, cVar3);
                    str = dVar4.f11242b;
                    if ("DNGVersion".equals(str)) {
                        this.f11264c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f11264c = 8;
                    if (fVar.f11235c != j11) {
                        fVar.b(j11);
                    }
                }
            }
            s11 = (short) (s12 + 1);
            s10 = s9;
            hashSet3 = hashSet;
        }
        HashSet hashSet4 = hashSet3;
        int i19 = fVar.readInt();
        if (z13) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i19)));
        }
        long j14 = i19;
        if (j14 <= 0) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i19);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(i19))) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i19);
                return;
            }
            return;
        }
        fVar.b(j14);
        if (mapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(String str, int i10, String str2) {
        HashMap[] mapArr = this.f11265d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void u(b bVar) throws IOException {
        c cVar;
        int iE;
        HashMap map = this.f11265d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f11267f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f11267f);
            int[] iArr2 = f11250o;
            if (Arrays.equals(iArr2, iArr) || (this.f11264c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f11267f)) == 1 && Arrays.equals(iArr, f11251p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrI = i1.b.i(cVar4.g(this.f11267f));
                long[] jArrI2 = i1.b.i(cVar5.g(this.f11267f));
                if (jArrI == null || jArrI.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrI2 == null || jArrI2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrI.length != jArrI2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrI2) {
                    j10 += j11;
                }
                byte[] bArr = new byte[(int) j10];
                this.f11268g = true;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < jArrI.length; i12++) {
                    int i13 = (int) jArrI[i12];
                    int i14 = (int) jArrI2[i12];
                    if (i12 < jArrI.length - 1 && i13 + i14 != jArrI[i12 + 1]) {
                        this.f11268g = false;
                    }
                    int i15 = i13 - i10;
                    if (i15 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i15;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                        return;
                    }
                    int i16 = i10 + i15;
                    byte[] bArr2 = new byte[i14];
                    if (bVar.read(bArr2) != i14) {
                        Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                        return;
                    }
                    i10 = i16 + i14;
                    System.arraycopy(bArr2, 0, bArr, i11, i14);
                    i11 += i14;
                }
                if (this.f11268g) {
                    long j13 = jArrI[0];
                    return;
                }
                return;
            }
        }
        if (f11247l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i10, int i11) {
        HashMap[] mapArr = this.f11265d;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f11247l;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f11267f);
        int iE2 = cVar2.e(this.f11267f);
        int iE3 = cVar3.e(this.f11267f);
        int iE4 = cVar4.e(this.f11267f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void w(f fVar, int i10) throws IOException {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f11265d;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f11237a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f11267f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f11267f);
                cVarC2 = c.b(eVarArr[1], this.f11267f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f11267f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f11267f);
                cVarC2 = c.c(iArr[1], this.f11267f);
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f11267f);
            int iE2 = cVar4.e(this.f11267f);
            int iE3 = cVar5.e(this.f11267f);
            int iE4 = cVar3.e(this.f11267f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f11267f);
            c cVarC4 = c.c(iE3 - iE4, this.f11267f);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f11267f);
            int iE6 = cVar8.e(this.f11267f);
            fVar.b(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            e(new b(bArr), iE5, i10);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f11265d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
