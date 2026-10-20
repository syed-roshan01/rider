.class public final Lcom/auto/accept/service/RideAcceptorService;
.super Landroid/accessibilityservice/AccessibilityService;

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# static fields
.field public static final $stable:I = 0x8

.field public static final ACTION_FARE_DETECTED:Ljava/lang/String;

.field public static final ACTION_SERVICE_STATUS:Ljava/lang/String;

.field public static final Companion:Lb5/k;

.field public static final EXTRA_ACCEPTED:Ljava/lang/String;

.field public static final EXTRA_FARE_AMOUNT:Ljava/lang/String;

.field public static final EXTRA_IS_ACTIVE:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;

.field private static final short:[S


# instance fields
.field private cachedOlaAddresses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private cachedOlaDropDist:D

.field private cachedOlaFare:D

.field private cachedOlaPickupDist:D

.field private cachedOlaTip:D

.field private cachedPlanExpiry:J

.field private distanceFilterEnabled:Z

.field private volatile encryptedPrefs:Landroid/content/SharedPreferences;

.field private final evaluatedOrders:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private globalAcceptCooldown:J

.field private volatile isTapBurstRunning:Z

.field private lastBroadcastTime:J

.field private lastHistoryLogTime:J

.field private lastHistoryOrderId:Ljava/lang/String;

.field private lastOlaCacheTime:J

.field private lastPlanExpiryCheckTime:J

.field private lastPopupOrderId:Ljava/lang/String;

.field private lastPopupTime:J

.field private lastScanTime:J

.field private lastUberBlindFireTime:J

.field private locationFilterEnabled:Z

.field private locationFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<+",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private maxDropKm:F

.field private volatile maxFare:I

.field private maxPickupKm:F

.field private minDropKm:F

.field private volatile minFare:I

.field private minPickupKm:F

.field private final numberPattern:Ljava/util/regex/Pattern;

.field private perAppSettings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private rideHistoryManager:Lz4/g;

.field private volatile serviceEnabled:Z

.field private volatile sharedPrefs:Landroid/content/SharedPreferences;

.field private wakeLock:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x8dd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->short:[S

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۠ۢۢۦ:I

    xor-int/lit16 v2, v2, 0xbf

    const/16 v3, 0x52b

    invoke-static {v0, v1, v2, v3}, Ls/ۣۡۡۧ;->ۣۣ۟ۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->ACTION_FARE_DETECTED:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x1d

    sget v2, Lh5/ۧ۟ۨۧ;->ۨۨ۟ۢ:I

    xor-int/lit16 v2, v2, -0xf4

    const/16 v3, 0x3d1

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->ۣۣۧ۟([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->ACTION_SERVICE_STATUS:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x3b

    sget v2, Lz2/ۢۨۨۦ;->۟ۡ۟ۦ:I

    xor-int/lit16 v2, v2, -0x2ef

    const/16 v3, 0x3c3

    invoke-static {v0, v1, v2, v3}, Lc1/ۣۡۢۦ;->۟ۢۦۨ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->EXTRA_ACCEPTED:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x43

    sget v2, Lw5/ۢۤۢ۠;->۟ۥۤۧ۠:I

    xor-int/lit16 v2, v2, 0x13e

    const/16 v3, 0x531

    invoke-static {v0, v1, v2, v3}, Lt9/ۧۦۥ۟;->۟ۡۤۡۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->EXTRA_FARE_AMOUNT:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x4e

    sget v2, Lz2/ۢۨۨۦ;->۟ۡ۟ۦ:I

    xor-int/lit16 v2, v2, -0x2f0

    const/16 v3, 0x665

    invoke-static {v0, v1, v2, v3}, Lq6/۟ۥۦۡ۟;->۟۠ۦۣۦ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->EXTRA_IS_ACTIVE:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x57

    sget v2, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۧۢ۟ۦ:I

    xor-int/lit16 v2, v2, 0x31c

    const/16 v3, 0x6ae

    invoke-static {v0, v1, v2, v3}, Ll9/۟ۦۥۣۢ;->۟۟ۧۤ([SIII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->TAG:Ljava/lang/String;

    new-instance v0, Lb5/k;

    invoke-direct {v0}, Lb5/k;-><init>()V

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->Companion:Lb5/k;

    return-void

    :array_0
    .array-data 2
        0x548s
        0x544s
        0x546s
        0x505s
        0x54as
        0x55es
        0x55fs
        0x544s
        0x505s
        0x54as
        0x548s
        0x548s
        0x54es
        0x55bs
        0x55fs
        0x505s
        0x56ds
        0x56as
        0x579s
        0x56es
        0x574s
        0x56fs
        0x56es
        0x57fs
        0x56es
        0x568s
        0x57fs
        0x56es
        0x56fs
        0x3b2s
        0x3bes
        0x3bcs
        0x3ffs
        0x3b0s
        0x3a4s
        0x3a5s
        0x3bes
        0x3ffs
        0x3b0s
        0x3b2s
        0x3b2s
        0x3b4s
        0x3a1s
        0x3a5s
        0x3ffs
        0x382s
        0x394s
        0x383s
        0x387s
        0x398s
        0x392s
        0x394s
        0x38es
        0x382s
        0x385s
        0x390s
        0x385s
        0x384s
        0x382s
        0x3a2s
        0x3a0s
        0x3a0s
        0x3a6s
        0x3b3s
        0x3b7s
        0x3a6s
        0x3a7s
        0x557s
        0x550s
        0x543s
        0x554s
        0x56es
        0x550s
        0x55cs
        0x55es
        0x544s
        0x55fs
        0x545s
        0x60cs
        0x616s
        0x63as
        0x604s
        0x606s
        0x611s
        0x60cs
        0x613s
        0x600s
        0x6fcs
        0x6c7s
        0x6cas
        0x6cbs
        0x6efs
        0x6cds
        0x6cds
        0x6cbs
        0x6des
        0x6das
        0x6c1s
        0x6dcs
        0x87ds
        0x809s
        0x831s
        0x87es
        0x809s
        0x87bs
        0x86as
        0x809s
        0x831s
        0x87fs
        0x87cs
        0x256s
        0x25as
        0x258s
        0x21bs
        0x254s
        0x240s
        0x241s
        0x25as
        0x21bs
        0x254s
        0x256s
        0x256s
        0x250s
        0x245s
        0x241s
        0x21bs
        0x273s
        0x274s
        0x267s
        0x270s
        0x26as
        0x271s
        0x270s
        0x261s
        0x270s
        0x276s
        0x261s
        0x270s
        0x271s
        0x935s
        0x932s
        0x921s
        0x936s
        0x90cs
        0x932s
        0x93es
        0x93cs
        0x926s
        0x93ds
        0x927s
        0x101s
        0x103s
        0x103s
        0x105s
        0x110s
        0x114s
        0x105s
        0x104s
        0x710s
        0x733s
        0x73es
        0x57bs
        0x740s
        0x77bs
        0x776s
        0x777s
        0x753s
        0x771s
        0x771s
        0x777s
        0x762s
        0x766s
        0x77ds
        0x760s
        -0x2fafs
        -0x283es
        0x84ds
        0x83es
        0x805s
        0x804s
        0x817s
        0x818s
        0x806s
        0x818s
        0x84ds
        0x83es
        0x819s
        0x81fs
        0x804s
        0x806s
        0x808s
        0x84ds
        0x80bs
        0x802s
        0x81fs
        0x84ds
        0x1c7s
        0x186s
        0x193s
        0x1c7s
        0x2fds
        0x2f1s
        0xbe6s
        0xbees
        0xba8s
        0xba9s
        0xba2s
        0xba3s
        0xbe6s
        0xba4s
        0xba9s
        0xbb3s
        0xba8s
        0xba2s
        0xbb5s
        0xbfcs
        0xbe6s
        0xb9fs
        0x2189s
        -0x395s
        0x244s
        0x22bs
        0x208s
        0x205s
        0x244s
        0x210s
        0x205s
        0x214s
        0x244s
        0x206s
        0x211s
        0x216s
        0x217s
        0x210s
        0x244s
        0x205s
        0x208s
        0x216s
        0x201s
        0x205s
        0x200s
        0x21ds
        0x244s
        0x20ds
        0x20as
        0x244s
        0x202s
        0x208s
        0x20ds
        0x203s
        0x20cs
        0x210s
        0x248s
        0x244s
        0x217s
        0x20fs
        0x20ds
        0x214s
        0x214s
        0x20ds
        0x20as
        0x203s
        0x244s
        0x20bs
        0x212s
        0x201s
        0x216s
        0x208s
        0x205s
        0x214s
        0x214s
        0x20ds
        0x20as
        0x203s
        0x244s
        0x206s
        0x211s
        0x216s
        0x217s
        0x210s
        0xb4fs
        0xb78s
        0xb7fs
        0xb68s
        0x21es
        0x23cs
        0x23cs
        0x23as
        0x22cs
        0x22cs
        0x236s
        0x23ds
        0x236s
        0x233s
        0x236s
        0x22bs
        0x226s
        0x27fs
        0x23cs
        0x233s
        0x236s
        0x23cs
        0x234s
        0x27fs
        0x239s
        0x23es
        0x233s
        0x233s
        0x23ds
        0x23es
        0x23cs
        0x234s
        0x27fs
        0x23as
        0x227s
        0x23cs
        0x23as
        0x22fs
        0x22bs
        0x236s
        0x230s
        0x231s
        0x265s
        0x27fs
        0x25ces
        -0x29fs
        0x34es
        0x321s
        0x302s
        0x30fs
        0x34es
        0x31cs
        0x307s
        0x30as
        0x30bs
        0x34es
        0x30as
        0x30bs
        0x31as
        0x30bs
        0x30ds
        0x31as
        0x30bs
        0x30as
        0x34es
        0x30cs
        0x31bs
        0x31as
        0x34es
        0x33ds
        0x306s
        0x307s
        0x314s
        0x31bs
        0x305s
        0x31bs
        0x34es
        0x307s
        0x31ds
        0x34es
        0x300s
        0x301s
        0x31as
        0x34es
        0x30fs
        0x318s
        0x30fs
        0x307s
        0x302s
        0x30fs
        0x30cs
        0x302s
        0x30bs
        0x34es
        0x237as
        0x34es
        0x30ds
        0x30fs
        0x300s
        0x300s
        0x301s
        0x31as
        0x34es
        0x31as
        0x30fs
        0x31es
        0x34es
        0x346s
        0x30fs
        0x30ds
        0x30ds
        0x30bs
        0x31ds
        0x31ds
        0x307s
        0x30cs
        0x307s
        0x302s
        0x307s
        0x31as
        0x317s
        0x34es
        0x30ds
        0x302s
        0x307s
        0x30ds
        0x305s
        0x34es
        0x307s
        0x31ds
        0x34es
        0x30cs
        0x302s
        0x301s
        0x30ds
        0x305s
        0x30bs
        0x30as
        0x34es
        0x30cs
        0x317s
        0x34es
        0x321s
        0x302s
        0x30fs
        0x347s
        0x242cs
        0x2a3s
        0x2abs
        0x2a8s
        0x223as
        0x2cf9s
        0xbdcs
        0x980s
        0x9e1s
        0x9e3s
        0x9e3s
        0x9e5s
        0x9f0s
        0x9f4s
        0x9e5s
        0x9e4s
        0x99as
        0x980s
        0x790s
        0x7ccs
        0x790s
        0xb24s
        0xb3fs
        0xb32s
        0xb33s
        0xb09s
        0xb37s
        0xb3as
        0xb33s
        0xb24s
        0xb22s
        0xb09s
        0xb33s
        0xb38s
        0xb37s
        0xb34s
        0xb3as
        0xb33s
        0xb32s
        0x13es
        0x122s
        0x123s
        0x139s
        0x16es
        0x17as
        -0x2f93s
        -0x2aacs
        0x870s
        0xc39s
        0xc6ds
        0xc71s
        0xc7cs
        0xc69s
        0xc7bs
        0xc72s
        0xc6fs
        0xc70s
        0x929s
        0x912s
        0x91fs
        0x91es
        0x93as
        0x918s
        0x918s
        0x91es
        0x90bs
        0x90fs
        0x914s
        0x909s
        0x440s
        0x412s
        0x405s
        0x414s
        0x412s
        0x419s
        0x440s
        0x414s
        0x401s
        0x410s
        0x440s
        0x401s
        0x414s
        0x440s
        0x275s
        0x279s
        0xaf6s
        0xafes
        0xafds
        0x5b2s
        0x5acs
        0x5f6s
        0x311s
        0x341s
        0x35as
        0x35bs
        0x350s
        0x372s
        0x350s
        0x35bs
        0x945s
        0xb3ds
        0xb20s
        0xb20s
        0xb3bs
        0xb23s
        0xb38s
        0xb1bs
        0xb38s
        0xb20s
        0xb32s
        0xb25s
        0xb14s
        0xb36s
        0xb24s
        0xb32s
        0xb7fs
        0xb79s
        0xb79s
        0xb79s
        0xb7es
        0xb45s
        0x757s
        0x723s
        0x71bs
        0x754s
        0x723s
        0x751s
        0x740s
        0x723s
        0x71bs
        0x755s
        0x756s
        0x757s
        0x714s
        0x712s
        0x703s
        0x712s
        0x756s
        0x52fs
        0x3e1s
        0x3fcs
        0x3fcs
        0x3e7s
        0x8b6s
        0x8ads
        0x88es
        0x8ads
        0x8b5s
        0x8a7s
        0x8b0s
        0x881s
        0x8a3s
        0x8b1s
        0x8a7s
        0x8eas
        0x8ecs
        0x8ecs
        0x8ecs
        0x8ebs
        0xb93s
        0xb84s
        0xb8bs
        0xb84s
        0xb82s
        0xb95s
        0xba5s
        0xbb4s
        0xba6s
        0xba6s
        0x319s
        0x301s
        0x303s
        0x31as
        0x9b8s
        0x9b9s
        0x9bfs
        0x9b0s
        0x9b5s
        0x9b2s
        0x9b9s
        0xca0s
        0xca2s
        0xcb3s
        0xc97s
        0xca6s
        0xca4s
        0xcacs
        0xca6s
        0xca0s
        0xca2s
        0xc89s
        0xca6s
        0xcaas
        0xca2s
        0xcefs
        0xce9s
        0xce9s
        0xce9s
        0xcees
        0x7aas
        0x7b7s
        0x7b7s
        0x7acs
        0xa5es
        0xa45s
        0xa66s
        0xa45s
        0xa5ds
        0xa4fs
        0xa58s
        0xa69s
        0xa4bs
        0xa59s
        0xa4fs
        0xa02s
        0xa04s
        0xa04s
        0xa04s
        0xa03s
        0xc4fs
        0xc59s
        0xc5fs
        0xc63s
        0xc4cs
        0xc50s
        0xc5ds
        0xc52s
        0xc63s
        0xc59s
        0xc44s
        0xc4cs
        0xc55s
        0xc4es
        0xc45s
        0xc63s
        0xc51s
        0xc4fs
        0x9ebs
        0x9fds
        0x9eas
        0x9ees
        0x9f1s
        0x9fbs
        0x9fds
        0x9c7s
        0x9fds
        0x9f6s
        0x9f9s
        0x9fas
        0x9f4s
        0x9fds
        0x9fcs
        0xad7s
        0xaccs
        0xaefs
        0xaccs
        0xad4s
        0xac6s
        0xad1s
        0xae0s
        0xac2s
        0xad0s
        0xac6s
        0xa8bs
        0xa8ds
        0xa8ds
        0xa8ds
        0xa8as
        0xb93s
        0xb8es
        0xb8es
        0xb95s
        0x924s
        0x935s
        0x935s
        0x90bs
        0x924s
        0x928s
        0x920s
        0x963s
        0x960s
        0x96cs
        0x96es
        0x97bs
        0x966s
        0x960s
        0x961s
        0xb01s
        0xb3as
        0xb3fs
        0xb3as
        0xb3bs
        0xb23s
        0xb3as
        0x677s
        0x27c5s
        0x677s
        0x72cs
        0x928s
        0x95bs
        0x963s
        0x961s
        0x978s
        0x932s
        0x928s
        0x2a55s
        -0x849s
        0x998s
        0x28es
        0x2b5s
        0x2b8s
        0x2b9s
        0x29ds
        0x2bfs
        0x2bfs
        0x2b9s
        0x2acs
        0x2a8s
        0x2b3s
        0x2aes
        0x319s
        0x32fs
        0x329s
        0x923s
        0x92fs
        0x284s
        0x282s
        0x2cfs
        0x280s
        0x29as
        0x29bs
        0x29cs
        0x286s
        0x28bs
        0x28as
        0x2cfs
        0x2b4s
        0x2ecs
        0x2f5s
        0x2ffs
        0x2f7s
        0x2e9s
        0x2ecs
        0x2bcs
        0x386s
        0x390s
        0x38ds
        0x392s
        0x3c2s
        0x652s
        0x64fs
        0x64fs
        0x654s
        0x8d8s
        0x8c3s
        0x8e0s
        0x8c3s
        0x8dbs
        0x8c9s
        0x8des
        0x8efs
        0x8cds
        0x8dfs
        0x8c9s
        0x884s
        0x882s
        0x882s
        0x882s
        0x885s
        0xa9bs
        0xa81s
        0xab3s
        0xa91s
        0xa91s
        0xa97s
        0xa82s
        0xa86s
        0x97cs
        0x972s
        0x96es
        0x960s
        0x978s
        0x965s
        0x973s
        0xb85s
        0xb86s
        0xb8as
        0xb88s
        0xb9ds
        0xb80s
        0xb86s
        0xb87s
        0xbc9s
        0xb84s
        0xb88s
        0xb9ds
        0xb8as
        0xb81s
        0xb8cs
        0xb9as
        0xbc9s
        0xb88s
        0xb9fs
        0xb86s
        0xb80s
        0xb8ds
        0xb8cs
        0xb8ds
        0xbc9s
        0xb88s
        0xb9bs
        0xb8cs
        0xb88s
        0xbc9s
        0xbces
        0xae0s
        0x283s
        0x2f0s
        0x2c8s
        0x2cas
        0x2d3s
        0x299s
        0x283s
        0x2cfs
        0x2ccs
        0x2c0s
        0x2c2s
        0x2d7s
        0x2cas
        0x2ccs
        0x2cds
        0x283s
        0x2c7s
        0x2ccs
        0x2c6s
        0x2d0s
        0x2cds
        0x284s
        0x2d7s
        0x283s
        0x2ces
        0x2c2s
        0x2d7s
        0x2c0s
        0x2cbs
        0x283s
        0x2c2s
        0x2cds
        0x2das
        0x283s
        0x2e4s
        0x2ccs
        0x28es
        0x2f7s
        0x2ccs
        0x283s
        0x2c2s
        0x2d1s
        0x2c6s
        0x2c2s
        0x2ca9s
        0xad0s
        0xa9fs
        0xa85s
        0xa84s
        0xa83s
        0xa99s
        0xa94s
        0xa95s
        0xad0s
        0x2a49s
        0x24fs
        0x22dbs
        0x570s
        0x52cs
        0x570s
        0x834s
        0x864s
        0x87ds
        0x860s
        0x820s
        0x57bs
        0x558s
        0x555s
        0x10cs
        0x13bs
        0x13cs
        0x12bs
        0x50cs
        0x579s
        0x501s
        0x574s
        0x521s
        0x50as
        0x504s
        0x946s
        0x94as
        0x94bs
        0x943s
        0x94cs
        0x957s
        0x948s
        0x28ds
        0x28fs
        0x28fs
        0x289s
        0x29cs
        0x298s
        0x111s
        0x10as
        0x129s
        0x10as
        0x112s
        0x100s
        0x117s
        0x126s
        0x104s
        0x116s
        0x100s
        0x14ds
        0x14bs
        0x14bs
        0x14bs
        0x14cs
        0x260s
        0x27ds
        0x27ds
        0x266s
        0xc12s
        0xc0bs
        0xc01s
        0xc09s
        0xc17s
        0xc12s
        0x9d2s
        0x9c7s
        0x9d0s
        0x9d0s
        0x9dbs
        0x5a0s
        0x5b6s
        0x5abs
        0x5b4s
        0xa68s
        0xa7fs
        0xa7es
        0x2fes
        0x2ffs
        0x2e9s
        0x2ees
        0x2f3s
        0x2f4s
        0x2fbs
        0x2ees
        0x2f3s
        0x2f5s
        0x2f4s
        0x7ces
        0x7dfs
        0x7cds
        0x7cds
        0xb14s
        0xb19s
        0xb03s
        0xb1ds
        0xb19s
        0xb03s
        0xb03s
        0xb02s
        0xb0ds
        0xb0es
        0xb12s
        0xb04s
        0x268ds
        0x230s
        0x107s
        0x106s
        0x100s
        0x10fs
        0x10as
        0x10ds
        0x106s
        0x3b1s
        0x3a6s
        0x3a9s
        0x3a6s
        0x3a0s
        0x3b7s
        0x949s
        0x951s
        0x953s
        0x94as
        0x28eas
        0x6bbs
        0xc79s
        0x2bds
        0x2bbs
        0x321s
        0x36cs
        0xc6es
        0xc78s
        0xc6es
        0xc76s
        0x781s
        0x7bfs
        0x7c3s
        0x7bfs
        0x7cfs
        0x1bs
        0x1cs
        0x9s
        0x5es
        0xbs
        0x2es
        0x21s
        0x59bs
        0x5ees
        0x596s
        0x5e3s
        0x5b6s
        0x593s
        0x59cs
        0x4aas
        0x482s
        0x4e7s
        0x48as
        0x493s
        0x4aes
        0xa5es
        0xa5as
        0xa5ds
        0x3d3s
        0x3d1s
        0x3c3s
        0x3d8s
        0xc39s
        0xc28s
        0xc30s
        0xa5fs
        0xa5es
        0xa5cs
        0xa59s
        0xa5es
        0xa55s
        0x596s
        0x592s
        0x595s
        0x592s
        0x66bs
        0x669s
        0x672s
        0x676s
        0x67es
        0xc3ds
        0xc2bs
        0xc2as
        0xc2fs
        0xc20s
        0xb02s
        0xb1fs
        0xb18s
        0xb01s
        0xb14s
        0xb03s
        0x729s
        0x72as
        0x722s
        0x736s
        0xa31s
        0xa3cs
        0xa26s
        0xa36s
        0xa3as
        0xa20s
        0xa3bs
        0xa21s
        0xa98s
        0xa85s
        0xa8ds
        0xa94s
        0xa8fs
        0xa98s
        0x981s
        0x987s
        0x990s
        0x981s
        0x991s
        0x980s
        0x99bs
        0xbabs
        0xbbcs
        0xbb7s
        0xbbcs
        0xbaes
        0x4bbs
        0x4bes
        0x4a6s
        0x4acs
        0x604s
        0x60ds
        0x60ds
        0x60es
        0x619s
        0x214s
        0x219s
        0x218s
        0x203s
        0x205s
        0x5ads
        0x5b9s
        0x5aes
        0x5aes
        0xbe1s
        0xbe7s
        0xbfcs
        0xbf4s
        0xbf9s
        0xa23s
        0xa3fs
        0xa32s
        0xa3ds
        0xab1s
        0xab9s
        0xaf6s
        0xaa2s
        0xab9s
        0xac3s
        0xac2s
        0xa8cs
        0xac8s
        0xad9s
        0xad8s
        0xad5s
        0x473s
        0x47as
        0x47as
        0x43cs
        0x478s
        0x469s
        0x468s
        0x465s
        0xa05s
        0xa0as
        0xa1ds
        0xa02s
        0xa0cs
        0xa0as
        0xa1fs
        0xa0es
        0x919s
        0x916s
        0x913s
        0x91fs
        0x914s
        0x90es
        0x95as
        0x916s
        0x915s
        0x919s
        0x91bs
        0x90es
        0x91fs
        0x91es
        0xb43s
        0xb41s
        0xb4es
        0xb43s
        0xb45s
        0xb4cs
        0xae9s
        0xae4s
        0xaeds
        0xaf1s
        0x999s
        0x99as
        0x997s
        0x33bs
        0x328s
        0x33ds
        0x320s
        0x327s
        0x32es
        0x470s
        0x474s
        0x467s
        0x47bs
        0x47cs
        0x47bs
        0x472s
        0xca1s
        0xca6s
        0xcabs
        0xcads
        0xca6s
        0xcbcs
        0xca1s
        0xcbes
        0xcads
        0x3ffs
        0x3f9s
        0x3fes
        0x3ebs
        0x3e9s
        0x78as
        0x78bs
        0x782s
        0x787s
        0x798s
        0x78bs
        0x79cs
        0x797s
        0xbf3s
        0xbffs
        0xbfcs
        0xbfcs
        0xbf5s
        0xbf3s
        0xbe4s
        0x224s
        0x222s
        0x239s
        0x220s
        0x302s
        0x300s
        0x300s
        0x306s
        0x313s
        0x317s
        0x2c6s
        0x2e4s
        0x2e4s
        0x2e2s
        0x2f7s
        0x2f3s
        0xb7cs
        0xb7es
        0xb7es
        0xb78s
        0xb6ds
        0xb69s
        0x4ffs
        0x4f3s
        0x4f2s
        0x4fas
        0x4f5s
        0x4ees
        0x4f1s
        0x116s
        0x13as
        0x13bs
        0x133s
        0x13cs
        0x127s
        0x138s
        0x597s
        0x5e2s
        0x59as
        0x5efs
        0x5bas
        0x591s
        0x59fs
        0xc8fs
        0x5bas
        0x59fs
        0x5e8s
        0x5ads
        0x3a3s
        0x398s
        0x395s
        0x394s
        0x3b0s
        0x392s
        0x392s
        0x394s
        0x381s
        0x385s
        0x39es
        0x383s
        -0x2cc3s
        -0x2b52s
        0xb21s
        0xb4es
        0xb6ds
        0xb60s
        0xb3bs
        0xb21s
        0xb47s
        0xb6es
        0xb74s
        0xb6fs
        0xb65s
        0xb21s
        0xb60s
        0xb62s
        0xb62s
        0xb64s
        0xb71s
        0xb75s
        0xb21s
        0xb77s
        0xb68s
        0xb60s
        0xb21s
        0xb67s
        0xb68s
        0xb6fs
        0xb65s
        0xb43s
        0xb78s
        0xb55s
        0xb64s
        0xb79s
        0xb75s
        0xb29s
        0xb26s
        0x322s
        0x32cs
        0x435s
        0xc9fs
        0xc61s
        0xcf5s
        0xcd6s
        0xcdbs
        0x653s
        0x65fs
        0x65es
        0x656s
        0x659s
        0x642s
        0x65ds
        0xc2cs
        0xc59s
        0xc21s
        0xc54s
        0xc01s
        0xc2as
        0xc24s
        0x7ecs
        0x7f7s
        0x7d4s
        0x7f7s
        0x7efs
        0x7fds
        0x7eas
        0x7dbs
        0x7f9s
        0x7ebs
        0x7fds
        0x7b0s
        0x7b6s
        0x7b6s
        0x7b6s
        0x7b1s
        0x622s
        0x63fs
        0x63fs
        0x624s
        0x2dcs
        0x2des
        0x2des
        0x2d8s
        0x2cds
        0x2c9s
        0x2c72s
        0x63cs
        0x675s
        0x1f1s
        0x1f7s
        0x53fs
        0x529s
        0x53fs
        0x527s
        0x2b8s
        0x2afs
        0x2a0s
        0x2afs
        0x2a9s
        0x2bes
        0x5cds
        0x5d0s
        0x5d7s
        0x5ces
        0x5dbs
        0x5ccs
        0x383s
        0x380s
        0x388s
        0x39cs
        0xa01s
        0xa05s
        0xa02s
        0xa1fs
        0x36bs
        0x369s
        0x37bs
        0x360s
        0x4afs
        0x4bes
        0x4a6s
        0x811s
        0x810s
        0x812s
        0x817s
        0x810s
        0x81bs
        0x2d6s
        0x2dbs
        0x2c1s
        0x2d1s
        0x2dds
        0x2c7s
        0x2dcs
        0x2c6s
        0x5bbs
        0x588s
        0x599s
        0x580s
        0x58ds
        0x586s
        0x782s
        0x79fs
        0x79fs
        0x784s
        0x199s
        0x182s
        0x1a1s
        0x182s
        0x19as
        0x188s
        0x19fs
        0x1aes
        0x18cs
        0x19es
        0x188s
        0x1c5s
        0x1c3s
        0x1c3s
        0x1c3s
        0x1c4s
        0x2980s
        0x6d7s
        0x3eds
        0x3e1s
        0x3f4s
        0x3e3s
        0x3e8s
        0x478s
        0x474s
        0x475s
        0x47ds
        0x472s
        0x469s
        0x476s
        0x80ds
        0x80fs
        0x80fs
        0x809s
        0x81cs
        0x818s
        0xbads
        0xbafs
        0xbafs
        0xba9s
        0xbbcs
        0xbb8s
        0xbecs
        0xbbes
        0xba5s
        0xba8s
        0xba9s
        0x5f5s
        0x5f1s
        0x5f6s
        0x827s
        0x821s
        0x3a4s
        0x3b1s
        0x3a8s
        0x5a7s
        0x5a5s
        0x5b7s
        0x5acs
        0x324s
        0x326s
        0x335s
        0x323s
        0xb76s
        0xb61s
        0xb66s
        0xb71s
        0x6afs
        0x6b2s
        0x6a9s
        0x6a6s
        0x6bfs
        0x6b9s
        0x6a3s
        0x6bcs
        0x6afs
        0x256s
        0x261s
        0x266s
        0x271s
        0x13ds
        0x106s
        0x10bs
        0x10as
        0x12es
        0x10cs
        0x10cs
        0x10as
        0x11fs
        0x11bs
        0x100s
        0x11ds
        -0x259as
        -0x220bs
        0x27as
        0x218s
        0x236s
        0x233s
        0x234s
        0x23es
        0x27as
        0x21cs
        0x233s
        0x228s
        0x233s
        0x234s
        0x23ds
        0x27as
        0x20fs
        0x238s
        0x23fs
        0x228s
        0x27as
        0x209s
        0x232s
        0x233s
        0x220s
        0x22fs
        0x231s
        0x22fs
        0x27as
        0x20es
        0x23bs
        0x22as
        0x229s
        0x27as
        0x272s
        0x229s
        0x23fs
        0x22bs
        0x22fs
        0x23fs
        0x234s
        0x22es
        0x233s
        0x23bs
        0x236s
        0x276s
        0x27as
        0x234s
        0x235s
        0x27as
        0x228s
        0x23fs
        0x23bs
        0x23es
        0x23bs
        0x238s
        0x236s
        0x23fs
        0x27as
        0x238s
        0x22fs
        0x22es
        0x22es
        0x235s
        0x234s
        0x27as
        0x23cs
        0x235s
        0x22fs
        0x234s
        0x23es
        0x273s
        0x459s
        0x44es
        0x449s
        0x45es
        0x473s
        0x44es
        0x440s
        0x445s
        0x442s
        0x448s
        0x473s
        0xb7fs
        0xb48s
        0xb4fs
        0xb58s
        0x40cs
        0x41as
        0x40ds
        0x409s
        0x416s
        0x41cs
        0x41as
        0x420s
        0x41as
        0x411s
        0x41es
        0x41ds
        0x413s
        0x41as
        0x41bs
        0x1d7s
        0x1d3s
        0x1d4s
        0x1e5s
        0x1dcs
        0x1dbs
        0x1c8s
        0x1dfs
        0x1a4s
        0x1a1s
        0x51ds
        0x511s
        0x508s
        0x52fs
        0x516s
        0x511s
        0x502s
        0x515s
        0x7eds
        0x7e8s
        0x7e8s
        0x9f4s
        0x9e2s
        0x9e4s
        0x9d8s
        0x9e3s
        0x9ees
        0x9f4s
        0x9f3s
        0x9e6s
        0x9e9s
        0x9e4s
        0x9e2s
        0x9d8s
        0x9e1s
        0x9ees
        0x9ebs
        0x9f3s
        0x9e2s
        0x9f5s
        0x9d8s
        0x9e2s
        0x9e9s
        0x9e6s
        0x9e5s
        0x9ebs
        0x9e2s
        0x9e3s
        0x2bcs
        0x2aas
        0x2acs
        0x290s
        0x2a2s
        0x2a6s
        0x2a1s
        0x290s
        0x2bfs
        0x2a6s
        0x2acs
        0x2a4s
        0x2bas
        0x2bfs
        0x290s
        0x2a4s
        0x2a2s
        0x5e7s
        0x5f1s
        0x5f7s
        0x5cbs
        0x5f9s
        0x5f5s
        0x5ecs
        0x5cbs
        0x5e4s
        0x5fds
        0x5f7s
        0x5ffs
        0x5e1s
        0x5e4s
        0x5cbs
        0x5ffs
        0x5f9s
        0x44cs
        0x45as
        0x45cs
        0x460s
        0x452s
        0x456s
        0x451s
        0x460s
        0x45bs
        0x44ds
        0x450s
        0x44fs
        0x460s
        0x454s
        0x452s
        0xbffs
        0xbe9s
        0xbefs
        0xbd3s
        0xbe1s
        0xbeds
        0xbf4s
        0xbd3s
        0xbe8s
        0xbfes
        0xbe3s
        0xbfcs
        0xbd3s
        0xbe7s
        0xbe1s
        0x411s
        0x407s
        0x401s
        0x43ds
        0x40es
        0x40ds
        0x401s
        0x403s
        0x416s
        0x40bs
        0x40ds
        0x40cs
        0x43ds
        0x404s
        0x40bs
        0x40es
        0x416s
        0x407s
        0x410s
        0x43ds
        0x407s
        0x40cs
        0x403s
        0x400s
        0x40es
        0x407s
        0x406s
        0xb2es
        0xb38s
        0xb3es
        0xb02s
        0xb31s
        0xb32s
        0xb3es
        0xb3cs
        0xb29s
        0xb34s
        0xb32s
        0xb33s
        0xb02s
        0xb3bs
        0xb34s
        0xb31s
        0xb29s
        0xb38s
        0xb2fs
        0xb2es
        0x1bcs
        0x1ads
        0x1ads
        0x182s
        0x1b8s
        0x1b3s
        0x1bcs
        0x1bfs
        0x1b1s
        0x1b8s
        0x1b9s
        0x182s
        0x252ds
        0x208s
        0x26ds
        0x266s
        0x269s
        0x26as
        0x264s
        0x26ds
        0x26cs
        0x215s
        0x292s
        0x2ces
        0x292s
        0x2e0s
        0x2f3s
        0x2fcs
        0x2f5s
        0x2f7s
        0x28fs
        0x220bs
        0xa1fs
        0x2a8bs
        0xc8bs
        0xcd7s
        0xc8bs
        0xceas
        0xcdbs
        0xcdbs
        0xcd8s
        0xc96s
        0x480s
        0x4bbs
        0x4b6s
        0x4b7s
        0x493s
        0x4b1s
        0x4b1s
        0x4b7s
        0x4a2s
        0x4a6s
        0x4bds
        0x4a0s
        0x7b2s
        0x781s
        0x792s
        0x799s
        0x783s
        0x7d7s
        0x792s
        0x785s
        0x785s
        0x798s
        0x785s
        0x7cds
        0x7d7s
        0x22cs
        0x217s
        0x21as
        0x21bs
        0x23fs
        0x21ds
        0x21ds
        0x21bs
        0x20es
        0x20as
        0x211s
        0x20cs
        0x863s
        0x86fs
        0x86ds
        0x82es
        0x861s
        0x875s
        0x874s
        0x86fs
        0x82es
        0x861s
        0x863s
        0x863s
        0x865s
        0x870s
        0x874s
        0x82es
        0x853s
        0x845s
        0x852s
        0x856s
        0x849s
        0x843s
        0x845s
        0x85fs
        0x853s
        0x854s
        0x841s
        0x854s
        0x855s
        0x853s
        0x6d5s
        0x6cfs
        0x6e3s
        0x6dds
        0x6dfs
        0x6c8s
        0x6d5s
        0x6cas
        0x6d9s
        0x6b7s
        0x68cs
        0x681s
        0x680s
        0x6a4s
        0x686s
        0x686s
        0x680s
        0x695s
        0x691s
        0x68as
        0x697s
        -0x2eeds
        -0x2801s
        0x90es
        0x97ds
        0x94bs
        0x95cs
        0x958s
        0x947s
        0x94ds
        0x94bs
        0x90es
        0x96as
        0x94bs
        0x95ds
        0x95as
        0x95cs
        0x941s
        0x957s
        0x94bs
        0x94as
        0x892s
        0x8a9s
        0x8a4s
        0x8a5s
        0x881s
        0x8a3s
        0x8a3s
        0x8a5s
        0x8b0s
        0x8b4s
        0x8afs
        0x8b2s
        0x2233s
        -0x564s
        0x4b3s
        0x4c0s
        0x4f6s
        0x4e1s
        0x4e5s
        0x4fas
        0x4f0s
        0x4f6s
        0x4b3s
        0x4das
        0x4fds
        0x4e7s
        0x4f6s
        0x4e1s
        0x4e1s
        0x4e6s
        0x4e3s
        0x4e7s
        0x4f6s
        0x4f7s
        0xa31s
        0xa0as
        0xa07s
        0xa06s
        0xa22s
        0xa00s
        0xa00s
        0xa06s
        0xa13s
        0xa17s
        0xa0cs
        0xa11s
        0x1e3s
        0x1c8s
        0x1c5s
        0x1d4s
        0x1dfs
        0x1d6s
        0x1d2s
        0x1c3s
        0x1c2s
        0x186s
        0x1d6s
        0x1d4s
        0x1c3s
        0x1c0s
        0x1d5s
        0x186s
        0x1d3s
        0x1c8s
        0x1c7s
        0x1d0s
        0x1c7s
        0x1cfs
        0x1cas
        0x1c7s
        0x1c4s
        0x1cas
        0x1c3s
        0x18as
        0x186s
        0x1c0s
        0x1c7s
        0x1cas
        0x1cas
        0x1cfs
        0x1c8s
        0x1c1s
        0x186s
        0x1c4s
        0x1c7s
        0x1c5s
        0x1cds
        0x186s
        0x1d2s
        0x1c9s
        0x186s
        0x1d5s
        0x1c3s
        0x1c5s
        0x1d3s
        0x1d4s
        0x1c3s
        0x186s
        0x1d6s
        0x1d4s
        0x1cfs
        0x1d0s
        0x1c7s
        0x1d2s
        0x1c3s
        0x186s
        0x1d6s
        0x1d4s
        0x1c3s
        0x1c0s
        0x1d5s
        0x19cs
        0x186s
        0xae5s
        0xaees
        0xae3s
        0xaf2s
        0xaf9s
        0xaf0s
        0xaf4s
        0xae5s
        0xae4s
        0xadfs
        0xae1s
        0xaf0s
        0xaf0s
        0xadfs
        0xae4s
        0xae1s
        0xaf4s
        0xae1s
        0xadfs
        0xaf3s
        0xae5s
        0xae3s
        0xaf5s
        0xaf2s
        0xae5s
        0x779s
        0x75es
        0x753s
        0x753s
        0x75ds
        0x75es
        0x75cs
        0x754s
        0x71fs
        0x74fs
        0x74ds
        0x75as
        0x759s
        0x74cs
        0x71fs
        0x75es
        0x753s
        0x74cs
        0x750s
        0x71fs
        0x74as
        0x751s
        0x75es
        0x749s
        0x75es
        0x756s
        0x753s
        0x75es
        0x75ds
        0x753s
        0x75as
        0x705s
        0x71fs
        0x8d9s
        0x8c6s
        0x8des
        0x8ccs
        0x8dbs
        0x655s
        0x64es
        0x657s
        0x657s
        0x61bs
        0x658s
        0x65as
        0x655s
        0x655s
        0x654s
        0x64fs
        0x61bs
        0x659s
        0x65es
        0x61bs
        0x658s
        0x65as
        0x648s
        0x64fs
        0x61bs
        0x64fs
        0x654s
        0x61bs
        0x655s
        0x654s
        0x655s
        0x616s
        0x655s
        0x64es
        0x657s
        0x657s
        0x61bs
        0x64fs
        0x642s
        0x64bs
        0x65es
        0x61bs
        0x65as
        0x655s
        0x65fs
        0x649s
        0x654s
        0x652s
        0x65fs
        0x615s
        0x654s
        0x648s
        0x615s
        0x66bs
        0x654s
        0x64cs
        0x65es
        0x649s
        0x676s
        0x65as
        0x655s
        0x65as
        0x65cs
        0x65es
        0x649s
        0x6a5s
        0x69es
        0x693s
        0x692s
        0x6b6s
        0x694s
        0x694s
        0x692s
        0x687s
        0x683s
        0x698s
        0x685s
        0x6cds
        0x6cds
        0x6a0s
        0x696s
        0x69cs
        0x692s
        0x6bbs
        0x698s
        0x694s
        0x69cs
        -0x2e5es
        -0x28e1s
        0x9bfs
        0x9ccs
        0x9fas
        0x9eds
        0x9e9s
        0x9f6s
        0x9fcs
        0x9fas
        0x9bfs
        0x9dcs
        0x9f0s
        0x9f1s
        0x9f1s
        0x9fas
        0x9fcs
        0x9ebs
        0x9fas
        0x9fbs
        0x98bs
        0x987s
        0x985s
        0x9c6s
        0x989s
        0x99ds
        0x99cs
        0x987s
        0x9c6s
        0x989s
        0x98bs
        0x98bs
        0x98ds
        0x998s
        0x99cs
        0x9c6s
        0x9bbs
        0x9ads
        0x9bas
        0x9bes
        0x9a1s
        0x9abs
        0x9ads
        0x9b7s
        0x9bbs
        0x9bcs
        0x9a9s
        0x9bcs
        0x9bds
        0x9bbs
        0x630s
        0x62as
        0x606s
        0x638s
        0x63as
        0x62ds
        0x630s
        0x62fs
        0x63cs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 4

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService;-><init>()V

    const/16 v0, 0x32

    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minFare:I

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxFare:I

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->evaluatedOrders:Ljava/util/LinkedHashMap;

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastPopupOrderId:Ljava/lang/String;

    iput-wide v2, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaPickupDist:D

    iput-wide v2, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaDropDist:D

    invoke-static {}, Lq0/ۥۣۡۧ;->ۥ۠۠ۢ()Lr8/r;

    move-result-object v1

    iput-object v1, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaAddresses:Ljava/util/List;

    const/high16 v2, 0x42480000    # 50.0f

    iput v2, p0, Lcom/auto/accept/service/RideAcceptorService;->maxPickupKm:F

    const/high16 v2, 0x42c80000    # 100.0f

    iput v2, p0, Lcom/auto/accept/service/RideAcceptorService;->maxDropKm:F

    iput-object v1, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilters:Ljava/util/List;

    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v1

    iput-object v1, p0, Lcom/auto/accept/service/RideAcceptorService;->perAppSettings:Ljava/util/Map;

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastHistoryOrderId:Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x63

    sget v2, Lq6/ۡۨۧۨ;->ۣۣ۟۠ۨ:I

    xor-int/lit16 v2, v2, 0x21b

    const/16 v3, 0x855

    invoke-static {v0, v1, v2, v3}, La0/ۣ۟ۤۨۧ;->۟ۧ۟ۥۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->۠۠ۡۨ(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->numberPattern:Ljava/util/regex/Pattern;

    invoke-static {}, Lia/۟۠ۡۦ۟;->ۦ۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "zAs5WANAdrYy"

    invoke-static {v0}, Li4/ۨ۟ۨ;->ۣۥۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static synthetic a(II)V
    .locals 0

    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->ۥۣۨۥ(II)V

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->ۤۦۨۤ()V

    return-void
.end method

.method private final broadcastFareDetected(IZ)V
    .locals 10
    sput p1, Lcom/auto/accept/service/RideAcceptorService;->lastFare:I

    const-wide/16 v8, 0x14

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟۠۟ۨ(Ljava/lang/Object;)J

    move-result-wide v4

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    add-long v0, v2, v8

    sub-long/2addr v0, v4

    sub-long/2addr v0, v8

    const-wide/16 v6, 0x7d0

    cmp-long v0, v0, v6

    if-gez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    iput-wide v2, p0, Lcom/auto/accept/service/RideAcceptorService;->lastBroadcastTime:J

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x6e

    sget v3, Lp0/۟ۢۤۧ;->۟ۢ۠ۦۦ:I

    xor-int/lit16 v3, v3, -0x348

    const/16 v4, 0x235

    invoke-static {v1, v2, v3, v4}, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۣ۟۠ۨۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x8b

    sget v3, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۧۥۡ۠:I

    xor-int/lit16 v3, v3, -0x93

    const/16 v4, 0x953

    invoke-static {v1, v2, v3, v4}, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟ۥۥۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->۟ۥۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/Intent;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x96

    sget v3, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    xor-int/lit16 v3, v3, 0x14a

    const/16 v4, 0x160

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->۟ۥۧۨ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lh4/ۣ۟ۢۢۡ;->۟ۥ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/Intent;

    invoke-static {p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Li/ۢۥۣ۟;->۟ۥۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public static synthetic c(IILcom/auto/accept/service/RideAcceptorService;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->ۦ۟ۨۧ(IILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Landroid/media/ToneGenerator;)V
    .locals 0

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۠ۢۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lc9/c;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->۟ۦۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private final executeAccept(Landroid/view/accessibility/AccessibilityNodeInfo;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 20
    sget-boolean v0, Lcom/auto/accept/service/RideAcceptorService;->detectOnly:Z

    if-eqz v0, :live

    const-string v0, "RideToggle"

    const-string v1, "DETECT-ONLY: would have accepted - no tap performed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :live
    # ---- FILTER ENFORCEMENT: never accept outside configured rules ----
    sget-boolean v0, Lcom/auto/accept/service/RideAcceptorService;->distanceFilterOn:Z

    if-eqz v0, :farecheck

    sget-wide v0, Lcom/auto/accept/service/RideAcceptorService;->maxPickup:D

    cmpl-double v0, p2, v0

    if-lez v0, :rejected

    sget-wide v0, Lcom/auto/accept/service/RideAcceptorService;->maxDrop:D

    cmpl-double v0, p4, v0

    if-lez v0, :rejected

    :farecheck
    sget-boolean v0, Lcom/auto/accept/service/RideAcceptorService;->fareFilterOn:Z

    if-eqz v0, :filtersok

    sget v0, Lcom/auto/accept/service/RideAcceptorService;->lastFare:I

    int-to-double v0, v0

    sget-wide v2, Lcom/auto/accept/service/RideAcceptorService;->minFare:D

    cmpg-double v2, v0, v2

    if-gez v2, :rejected

    sget-wide v2, Lcom/auto/accept/service/RideAcceptorService;->maxFare:D

    cmpl-double v0, v0, v2

    if-lez v0, :rejected

    :filtersok
    const-string v0, "RideToggle"

    const-string v1, "FILTERS: passed - proceeding to accept"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :acceptgo

    :rejected
    const-string v0, "RideToggle"

    const-string v1, "FILTERS: REJECTED offer - outside configured rules"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :acceptgo

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/auto/accept/service/RideAcceptorService;->globalAcceptCooldown:J

    move-object/from16 v0, p9

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/auto/accept/service/RideAcceptorService;->lastPopupOrderId:Ljava/lang/String;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/auto/accept/service/RideAcceptorService;->lastPopupTime:J

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    move-object/from16 v0, p1

    invoke-static {v0, v5}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣۡۡۡ(Ljava/lang/Object;)I

    move-result v12

    invoke-static {v5}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v13

    invoke-static {}, Lm5/ۣۢ۟ۧ;->ۨ۠ۡۡ()Z

    move-result v14

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x9e

    sget v4, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۨۢۦ:I

    xor-int/lit16 v4, v4, 0x2f3

    const/16 v6, 0x75f

    invoke-static {v2, v3, v4, v6}, Lr2/۠ۦۡۤ;->ۣۣۡۥ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0xa1

    const/4 v4, 0x1

    const/16 v6, 0x552

    invoke-static {v2, v3, v4, v6}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->ۧۤۨۡ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0xa2

    sget v4, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۡۤۢۢ:I

    xor-int/lit16 v4, v4, -0x2d2

    const/16 v6, 0x712

    invoke-static {v2, v3, v4, v6}, Lf/۟ۤۧ۠ۡ;->ۨۥۨۦ([SIII)Ljava/lang/String;

    move-result-object v9

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v14, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lx8/ۢۨۥۨ;->ۣ۟ۢ۟۟()Lg9/c;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lh8/۟ۨۧ;->۟ۡ۠ۧۡ()Lg9/a;

    move-result-object v2

    invoke-static {v2}, Lja/ۥۣۨ۠;->ۣ۟ۢۧۤ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v2}, Lja/ۥۣۨ۠;->ۣ۟ۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/lit8 v4, v12, -0x1c

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x1c

    add-int/lit8 v4, v13, -0xf

    add-int/2addr v2, v4

    add-int/lit8 v4, v2, 0xf

    invoke-static {v5}, Lcom/google/firebase/dynamicloading/ۣ۟۠ۨۢ;->ۥۤۨۧ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v5}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟۠ۦۢ۠(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v5}, Lr2/۠ۦۡۤ;->۟ۤۢ۠ۦ(Ljava/lang/Object;)I

    move-result v7

    invoke-static {v5}, Lf1/ۥۦ۟ۥ;->ۨۢۥ۟(Ljava/lang/Object;)I

    move-result v5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v15

    const/16 v16, 0xae

    sget v17, Lm9/۟ۤۢۦ۠;->ۥۣۤ۠:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x12f

    move/from16 v17, v0

    const/16 v18, 0x86d

    invoke-static/range {v15 .. v18}, Lb8/ۣ۟ۨۢۥ;->ۣۤۥۦ([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p6

    invoke-static {v11, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v15

    const/16 v16, 0xc4

    sget v17, Lk4/۟۠ۦ۟ۤ;->ۨۦۢ۠:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, -0x341

    move/from16 v17, v0

    const/16 v18, 0x1e7

    invoke-static/range {v15 .. v18}, Lb7/۟۟ۤۤۤ;->ۣ۟۠ۤ۟([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-static {v11, v15}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11, v3}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v15

    const/16 v16, 0xc8

    sget v17, Landroid/os/ۣۣ۟ۤۨ;->ۨ۠ۨ۠:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x31b

    move/from16 v17, v0

    const/16 v18, 0x2d1

    invoke-static/range {v15 .. v18}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۧۤۦ۠([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-static {v11, v15}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11, v4}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v15

    const/16 v16, 0xca

    sget v17, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۢۢۧۢ:I

    xor-int/lit8 v17, v17, -0x39

    const/16 v18, 0xbc6

    invoke-static/range {v15 .. v18}, Lcom/google/firebase/installations/۠ۤۢ۟;->ۣ۟ۤۥۦ([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-static {v11, v15}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11, v2}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v15, 0xd9

    const/16 v16, 0x1

    const/16 v17, 0xbb3

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v2, v15, v0, v1}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->۟ۡ۟ۨۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11, v6}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v11, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11, v7}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v11, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11, v5}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v11, v10}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-object/from16 v0, p6

    invoke-static {v0, v8}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v5, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۠۟ۡۤ(Ljava/lang/Object;)Z

    move-result v5

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-nez v5, :cond_2

    const v2, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/auto/accept/service/RideAcceptorService;->isTapBurstRunning:Z

    new-instance v2, Ljava/lang/Thread;

    new-instance v5, Lla/d;

    move-object/from16 v0, p0

    invoke-direct {v5, v3, v4, v0}, Lla/d;-><init>(IILcom/auto/accept/service/RideAcceptorService;)V

    invoke-direct {v2, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v2}, Lfa/ۣ۟ۥۤ;->ۢۦۧۦ(Ljava/lang/Object;)V

    move-object v2, v8

    :goto_3
    const v3, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    move-object/from16 v0, p6

    invoke-static {v0, v2}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc2fa

    :goto_5
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :sswitch_a
    if-nez v3, :cond_4

    const v2, 0xc5e2

    goto :goto_5

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_4

    :sswitch_c
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0xda

    sget v4, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->۟ۢ۠ۨ۠:I

    xor-int/lit8 v4, v4, -0xa

    const/16 v5, 0x264

    invoke-static {v2, v3, v4, v5}, Li/ۣۢۦ۠;->ۧۢۥۥ([SIII)Ljava/lang/String;

    const v2, 0xbefb

    :goto_6
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    move-object v2, v8

    goto :goto_3

    :sswitch_e
    const v2, 0xbf1a

    goto :goto_6

    :sswitch_f
    invoke-static {v3, v4}, Lo2/۟ۤۨۡۥ;->۟ۧۡۦ۠(II)V

    const/4 v2, 0x3

    new-array v15, v2, [J

    const/4 v2, 0x0

    const-wide/16 v6, 0x5a

    aput-wide v6, v15, v2

    const/4 v2, 0x1

    const-wide/16 v6, 0xb4

    aput-wide v6, v15, v2

    const/4 v2, 0x2

    const-wide/16 v6, 0x12c

    aput-wide v6, v15, v2

    const/4 v2, 0x0

    move v11, v2

    :goto_7
    const v2, 0xc202

    :goto_8
    const v5, 0xc213

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :sswitch_10
    const/4 v2, 0x3

    if-ge v11, v2, :cond_3

    const v2, 0xc25f

    goto :goto_8

    :cond_3
    :sswitch_11
    const v2, 0xc240

    goto :goto_8

    :sswitch_12
    aget-wide v6, v15, v11

    new-instance v16, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v2

    move-object/from16 v0, v16

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lb5/i;

    move-object/from16 v5, p6

    invoke-direct/range {v2 .. v7}, Lb5/i;-><init>(IILjava/lang/String;J)V

    move-object/from16 v0, v16

    invoke-static {v0, v2, v6, v7}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    sget v2, Le0/ۦۣ۟۠;->ۤۥ۟ۢ:I

    xor-int/lit16 v2, v2, -0x357

    add-int/2addr v2, v11

    const v5, 0xc27e

    :goto_9
    const v6, 0xc28f

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_7

    goto :goto_9

    :sswitch_13
    move v11, v2

    goto :goto_7

    :sswitch_14
    const v5, 0xc29d

    goto :goto_9

    :cond_4
    :sswitch_15
    const v2, 0xc5c3

    goto/16 :goto_5

    :sswitch_16
    :try_start_0
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x118

    sget v4, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۨ۟ۨۧ:I

    xor-int/lit16 v4, v4, -0x148

    const/16 v5, 0xb1a

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/iid/ۣۨۥۣ;->ۣۣۣۡ([SIII)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p6

    invoke-static {v0, v2}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    if-eqz v3, :cond_5

    const v2, 0xc65e

    goto :goto_a

    :cond_5
    :sswitch_18
    const v2, 0xc63f

    goto :goto_a

    :sswitch_19
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    int-to-float v2, v12

    int-to-float v4, v13

    invoke-static {v3, v2, v4}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->۟۟ۧ۟ۥ(Ljava/lang/Object;FF)V

    new-instance v8, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {v8}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    new-instance v2, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v4, -0x2e7

    sget v6, Lz2/ۢۨۨۦ;->۟ۡ۟ۦ:I

    int-to-long v6, v6

    xor-long/2addr v4, v6

    const-wide/16 v6, 0x22b

    sget v11, Ld1/۟۟ۥۡۡ;->ۣ۟ۤ۟۟:I

    int-to-long v12, v11

    xor-long/2addr v6, v12

    invoke-direct/range {v2 .. v7}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJ)V

    invoke-static {v8, v2}, Lp0/۟ۧۧۧ۟;->۟ۢۦۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object v2

    invoke-static {v2}, Lc4/ۡ۟۠ۥ;->ۣ۟۟ۢۢ(Ljava/lang/Object;)Landroid/accessibilityservice/GestureDescription;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3, v4}, Ll2/ۦۣ۠ۥ;->ۣۣ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_9

    goto :goto_b

    :sswitch_1a
    sget v2, Ln7/۟ۡۢۦ;->ۧ۟ۢۨ:I

    xor-int/lit8 v2, v2, -0x20

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lu4/ۧۦۦۧ;->ۡۥۧۥ(Ljava/lang/Object;I)Z

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lu4/ۧۦۦۧ;->ۡۥۧۥ(Ljava/lang/Object;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0xca00

    :goto_c
    const v3, 0xca11

    xor-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_c

    :goto_d
    :pswitch_1
    :sswitch_1b
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x1aa

    const/4 v4, 0x1

    const/16 v5, 0x495

    invoke-static {v2, v3, v4, v5}, Lm1/۟ۧۥ۟ۨ;->ۣۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v3

    const v2, 0xcdff

    :goto_e
    const v4, 0xce10

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_e

    :cond_6
    :sswitch_1c
    const v2, 0xce3d

    goto :goto_e

    :sswitch_1d
    const v2, 0xc69c

    goto :goto_b

    :catch_0
    move-exception v2

    const v3, 0xc984

    :goto_f
    const v4, 0xc995

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_b

    goto :goto_f

    :sswitch_1e
    const v3, 0xc9a3

    goto :goto_f

    :pswitch_2
    const v2, 0xca1f

    goto :goto_c

    :sswitch_1f
    invoke-static {v2}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v4, 0x11c

    sget v5, Lja/ۥۣۨ۠;->۟۟ۧۡ۟:I

    xor-int/lit16 v5, v5, 0x155

    const/16 v6, 0x25f

    invoke-static {v3, v4, v5, v6}, Lk3/۟ۧ۠۠ۦ;->ۤۦ۠ۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2, v9}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0xca7c

    :goto_10
    const v3, 0xca8d

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_c

    goto :goto_10

    :sswitch_20
    const v2, 0xcd26

    goto :goto_10

    :sswitch_21
    const v2, 0xcd83

    :goto_11
    const v3, 0xcd94

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_d

    goto :goto_11

    :sswitch_22
    if-nez v14, :cond_7

    const v2, 0xcde0

    goto :goto_11

    :cond_7
    :sswitch_23
    const v2, 0xcdc1

    goto :goto_11

    :sswitch_24
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x144

    sget v4, Lq1/۠۠ۤ;->ۣۣ۟ۡۤ:I

    xor-int/lit8 v4, v4, -0x54

    const/16 v5, 0x36e

    invoke-static {v2, v3, v4, v5}, Lo8/۟ۢۧۢۤ;->ۣۣۧ۠([SIII)Ljava/lang/String;

    goto :goto_d

    :sswitch_25
    const-wide/16 v4, 0x0

    cmpl-double v2, p4, v4

    if-lez v2, :cond_6

    const v2, 0xd0e7

    goto :goto_e

    :sswitch_26
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, p2

    invoke-static {v2, v0, v1}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v4, 0x1ab

    sget v5, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۦۥۥۨ:I

    xor-int/lit16 v5, v5, 0x31d

    const/16 v6, 0x283

    invoke-static {v3, v4, v5, v6}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۣ۠۠۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-wide/from16 v0, p4

    invoke-static {v2, v0, v1}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    invoke-static {v2, v10}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :sswitch_27
    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v2, 0xd106

    :goto_12
    const v4, 0xd117

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_e

    goto :goto_12

    :sswitch_28
    const v2, 0xd125

    goto :goto_12

    :sswitch_29
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, p2

    invoke-static {v2, v0, v1}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    const v3, 0xd182

    :goto_13
    const v4, 0xd193

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_f

    goto :goto_13

    :sswitch_2a
    const v3, 0xd1a1

    goto :goto_13

    :sswitch_2b
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x1af

    sget v5, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥ۟ۧ:I

    xor-int/lit16 v5, v5, -0x299

    const/16 v6, 0xbfc

    invoke-static {v2, v4, v5, v6}, Le1/۟ۢ۟ۤۡ;->ۦۣ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x1b1

    sget v6, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۦۣۢۨ:I

    xor-int/lit8 v6, v6, 0x6e

    const/16 v7, 0x9a0

    invoke-static {v4, v5, v6, v7}, Lr6/ۥۡۥۥ;->۠۟۟ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x1bc

    sget v7, Lj4/ۣۧۤ;->ۦۡۦۡ:I

    xor-int/lit16 v7, v7, -0x315

    const/16 v8, 0x7b0

    invoke-static {v5, v6, v7, v8}, Lr5/۟ۤۨۥۡ;->۟۟ۥۢۤ([SIII)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p6

    invoke-static {v2, v0, v4, v3, v5}, Lt8/ۦۣ۠;->ۦۣۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p7

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    const-wide/high16 v2, 0x4018000000000000L    # 6.0

    add-double v2, v2, p2

    add-double v2, v2, p4

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    sub-double/2addr v2, v4

    double-to-int v5, v2

    const/4 v6, 0x1

    move-object/from16 v2, p0

    move-object/from16 v3, p9

    move-object/from16 v4, p6

    move-object/from16 v7, p8

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    :try_start_1
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۣۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v3

    const v2, 0xd1fe

    :goto_14
    const v4, 0xd20f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_10

    goto :goto_14

    :sswitch_2c
    if-eqz v3, :cond_8

    const v2, 0xd4e6

    goto :goto_14

    :cond_8
    :sswitch_2d
    const v2, 0xd4c7

    goto :goto_14

    :sswitch_2e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x1bf

    sget v6, Lcom/google/firebase/remoteconfig/interop/ۨۨۢ۠;->۟۟ۢ۠۠:I

    xor-int/lit16 v6, v6, 0x139

    const/16 v7, 0xb56

    invoke-static {v2, v4, v6, v7}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->ۧۨۧۧ([SIII)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    const/4 v4, 0x1

    :try_start_2
    invoke-static {v3, v2, v4}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v3

    const v2, 0xd505

    :goto_15
    const v4, 0xd516

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_11

    goto :goto_15

    :sswitch_2f
    if-eqz v3, :cond_9

    const v2, 0xd562

    goto :goto_15

    :cond_9
    :sswitch_30
    const v2, 0xd543

    goto :goto_15

    :sswitch_31
    const v2, 0xd581

    :goto_16
    const v3, 0xd592

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_12

    goto :goto_16

    :sswitch_32
    const v2, 0xd5a0

    goto :goto_16

    :catch_1
    move-exception v2

    const v2, 0xd888

    :goto_17
    const v3, 0xd899

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_13

    goto :goto_17

    :sswitch_33
    const v2, 0xd8a7

    goto :goto_17

    :sswitch_34
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lb5/j;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lb5/j;-><init>(I)V

    invoke-static {v2, v3}, Ld1/ۣۧۡۡ;->۟ۥ۟۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :sswitch_35
    const/4 v2, 0x1

    move-object/from16 v0, p0

    invoke-static {v0, v5, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۢۦ۠(Ljava/lang/Object;IZ)V

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

    move-result v3

    const v2, 0xd904

    :goto_18
    const v4, 0xd915

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_14

    goto :goto_18

    :sswitch_36
    if-gtz v3, :cond_a

    const v2, 0xd961

    goto :goto_18

    :cond_a
    :sswitch_37
    const v2, 0xd942

    goto :goto_18

    :sswitch_38
    const-string v2, "Wg3zuFVe6Jarw8y"

    invoke-static {v2}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣۣۣۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_39
    return-void

    :catch_2
    move-exception v2

    const v2, 0xd980

    :goto_19
    const v3, 0xd991

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_15

    goto :goto_19

    :sswitch_3a
    const v2, 0xdc2a

    goto :goto_19

    :sswitch_3b
    move-object v2, v8

    goto/16 :goto_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_f
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x1f1 -> :sswitch_a
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_21
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_a
    .sparse-switch
        0xe -> :sswitch_1c
        0x2d -> :sswitch_29
        0x3ef -> :sswitch_25
        0x1ef7 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_20
        0x7ab -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_22
        0x36 -> :sswitch_23
        0x55 -> :sswitch_1b
        0x74 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x11 -> :sswitch_28
        0x32 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2a
        0x32 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x3f1 -> :sswitch_2c
        0x6a7 -> :sswitch_2d
        0x6c8 -> :sswitch_34
        0x6e9 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_2f
        0x32 -> :sswitch_30
        0x55 -> :sswitch_35
        0x74 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_32
        0x32 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_33
        0x3e -> :sswitch_35
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_36
        0x36 -> :sswitch_37
        0x57 -> :sswitch_39
        0x74 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3a
        0x5bb -> :sswitch_35
    .end sparse-switch
.end method

.method private static final executeAccept$lambda$24(IILcom/auto/accept/service/RideAcceptorService;)V
    .locals 6

    const/4 v5, 0x5

    const/4 v1, 0x0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x1d1

    sget v3, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->۟ۥۡۥۣ:I

    xor-int/lit16 v3, v3, -0x1de

    const/16 v4, 0x14a

    invoke-static {v0, v2, v3, v4}, Lm7/ۧۢ۟;->ۧۨۨۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x5

    :try_start_0
    new-array v3, v0, [I

    sget v0, Ls7/۟ۢ۟ۤۧ;->۟ۦۤۥۥ:I

    xor-int/lit16 v0, v0, -0x197

    const/16 v2, 0x6e

    aput v2, v3, v0

    sget v0, Lu1/ۢۥ۠ۤ;->۠ۨ۟ۤ:I

    xor-int/lit16 v0, v0, 0x20c

    const/16 v2, 0x6e

    aput v2, v3, v0

    sget v0, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->ۢۦۣۥ:I

    xor-int/lit16 v0, v0, -0x8d

    const/16 v2, 0x78

    aput v2, v3, v0

    sget v0, Lg/۟۠ۡۨۨ;->ۣ۠۟۟:I

    xor-int/lit16 v0, v0, -0x3d1

    const/16 v2, 0x78

    aput v2, v3, v0

    sget v0, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟۠ۨۧۥ:I

    xor-int/lit16 v0, v0, -0x302

    const/16 v2, 0x82

    aput v2, v3, v0

    move v0, v1

    :sswitch_0
    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_2
    if-ge v0, v5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_3
    aget v2, v3, v0

    invoke-static {p0, p1, v2}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->۟ۥۨ۟ۢ(III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v2, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۨ۠۠۠:I

    xor-int/lit16 v2, v2, -0x19e

    add-int/2addr v0, v2

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v2, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v2, 0xbe22

    goto :goto_2

    :sswitch_6
    iput-boolean v1, p2, Lcom/auto/accept/service/RideAcceptorService;->isTapBurstRunning:Z

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_7
    return-void

    :sswitch_8
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_9
    iput-boolean v1, p2, Lcom/auto/accept/service/RideAcceptorService;->isTapBurstRunning:Z

    throw v0

    :catch_0
    move-exception v0

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_a
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_6
        0x1f7 -> :sswitch_a
    .end sparse-switch
.end method

.method private static final executeAccept$lambda$25(IILjava/lang/String;J)V
    .locals 5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x1d7

    sget v2, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->ۣ۟ۧۤۨ:I

    xor-int/lit16 v2, v2, 0x1d2

    const/16 v3, 0x850

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣ۟ۧ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x1da

    sget v3, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣۤۢ۟:I

    xor-int/lit16 v3, v3, -0xd2

    const/16 v4, 0xc1d

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۢۢۢۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_0
    invoke-static {p0, p1}, Lo2/۟ۤۨۡۥ;->۟ۧۡۦ۠(II)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x1e3

    sget v3, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۣ۟ۧ۟ۢ:I

    xor-int/lit8 v3, v3, 0x6e

    const/16 v4, 0x97b

    invoke-static {v1, v2, v3, v4}, Lh8/۟ۤۨۨۦ;->۟۟ۤۨ۟([SIII)Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x1ef

    sget v3, Lj3/۟ۧۧۦۤ;->ۣۣ۠۠:I

    xor-int/lit16 v3, v3, 0x17d

    const/16 v4, 0x460

    invoke-static {v0, v2, v3, v4}, Ll8/ۣ۟ۧۢ۠;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, p0}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x1fd

    sget v3, Ld5/ۣۦۢۢ;->ۣۣ۟ۢۢ:I

    xor-int/lit16 v3, v3, -0x223

    const/16 v4, 0x259

    invoke-static {v0, v2, v3, v4}, Ls/ۧۥ۟۟;->ۣ۟ۧۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, p1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x1ff

    sget v3, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۦۣۤۤ:I

    xor-int/lit16 v3, v3, 0x9a

    const/16 v4, 0xad6

    invoke-static {v0, v2, v3, v4}, Lh6/ۧۧۤ۟;->۟ۥۣۨ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1, p3, p4}, Ll0/ۤ۠ۧ;->۟ۢۧ۠۠(Ljava/lang/Object;J)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x202

    sget v3, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۠ۧ۠ۤ:I

    xor-int/lit16 v3, v3, 0x310

    const/16 v4, 0x5df

    invoke-static {v0, v2, v3, v4}, Lm1/۟ۧۥ۟ۨ;->ۣۡۨۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x66f

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch
.end method

.method private static final executeAccept$lambda$27()V
    .locals 8

    :try_start_0
    new-instance v0, Landroid/media/ToneGenerator;

    sget v1, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->۠۠ۢ۟:I

    xor-int/lit8 v1, v1, -0x3d

    sget v2, Lq5/۟ۥۣۢۨ;->ۦۣۤ:I

    xor-int/lit8 v2, v2, -0x6b

    invoke-direct {v0, v1, v2}, Landroid/media/ToneGenerator;-><init>(II)V

    sget v1, Lr2/ۧۧۢۢ;->ۥۦۦ:I

    xor-int/lit16 v1, v1, 0x285

    sget v2, Lm7/ۡۢۦۢ;->ۣ۠۠۠:I

    xor-int/lit16 v2, v2, 0x1fd

    invoke-static {v0, v1, v2}, Lia/۟۠ۡۦ۟;->۟۟ۢۡ(Ljava/lang/Object;II)Z

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Landroidx/activity/d;

    sget v3, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I

    xor-int/lit16 v3, v3, -0x2eb

    invoke-direct {v2, v0, v3}, Landroidx/activity/d;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v4, -0xc0

    sget v0, Lv5/ۥۧ۟ۦ;->۠۟ۨۢ:I

    int-to-long v6, v0

    xor-long/2addr v4, v6

    invoke-static {v1, v2, v4, v5}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_0
    invoke-static {}, Lb1/۟ۥۥ۟ۢ;->ۦۤۧۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    const-string v0, "OhwnKbyknEGqIQSaYAYN1MYQ1Lg9"

    invoke-static {v0}, Lq0/ۥۣۡۧ;->ۣ۟۟ۢۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_4
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final executeAccept$lambda$27$lambda$26(Landroid/media/ToneGenerator;)V
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e1\u06df\u06e6"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const-string v1, "\u06df\u06df\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۣ۟۠ۡ۟(Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e5\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v4, v6, -0xa1

    const-string v1, "\u06e5\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v2}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06df\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    const/16 v1, 0x205

    const/16 v2, 0x335

    invoke-static {v0, v1, v4, v2}, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣۣ۠ۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e4\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_4
    sget v5, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۣ۟ۤۡۧ:I

    const-string v1, "\u06e5\u06e6\u06e4"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_2
        0x1aa705 -> :sswitch_4
        0x1aa7bf -> :sswitch_5
        0x1ab609 -> :sswitch_0
        0x1abdc7 -> :sswitch_3
        0x1abe63 -> :sswitch_1
    .end sparse-switch
.end method

.method private final extractAllNumbers(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lq0/ۥۣۡۧ;->ۥ۠۠ۢ()Lr8/r;

    move-result-object v0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    :try_start_0
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x20d

    const/4 v3, 0x1

    const/16 v4, 0x969

    invoke-static {v1, v2, v3, v4}, Li4/ۨ۟ۨ;->ۣۨۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->۟ۧۤۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۦۨۦ(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->۟ۢۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/regex/Matcher;

    move-result-object v3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :sswitch_8
    invoke-static {v3}, Lu/ۣۤۧ۠;->ۦۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v2, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v4, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_b
    const/4 v2, 0x1

    invoke-static {v3, v2}, Lm1/ۣۡ۠ۧ;->ۣۢۡۦ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v4

    const v2, 0xbefb

    :goto_4
    const v5, 0xbf0c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_c
    const v2, 0xbf39

    goto :goto_4

    :sswitch_d
    if-eqz v4, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_e
    invoke-static {v4}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۥۧۤ۠(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v4

    const v2, 0xc202

    :goto_5
    const v5, 0xc213

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v4, :cond_4

    const v2, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_10
    const v2, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v4

    invoke-static {v4, v5}, Lt2/۟ۦۢۡۧ;->ۣ۟ۡۡۧ(D)Ljava/lang/Double;

    move-result-object v2

    invoke-static {v1, v2}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v2, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_6

    :sswitch_12
    const v2, 0xc29d

    goto :goto_6

    :catch_0
    move-exception v1

    const v1, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_13
    const v1, 0xc5a4

    goto :goto_7

    :sswitch_14
    move-object v0, v1

    :sswitch_15
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_15
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_15
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_14
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_8
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_15
    .end sparse-switch
.end method

.method private final extractDistance(Ljava/lang/String;)D
    .locals 9

    const-wide/16 v2, 0x0

    :try_start_0
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x20e

    sget v5, Lm7/ۡۢۦۢ;->ۣ۠۠۠:I

    xor-int/lit16 v5, v5, 0x2d9

    const/16 v6, 0xb6f

    invoke-static {v1, v4, v5, v6}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->۟۠ۡۡۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x212

    sget v5, Lg7/۠ۤۧ;->۟ۤۧۦ:I

    xor-int/lit8 v5, v5, 0x3f

    const/16 v6, 0xb57

    invoke-static {v1, v4, v5, v6}, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۤۥ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x222

    const/4 v5, 0x1

    const/16 v6, 0xb65

    invoke-static {v1, v4, v5, v6}, Lm7/ۡۢۦۢ;->ۥ۟ۨ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v4}, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->۟ۧۤۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x223

    sget v5, Lh3/۟ۡۥ۠۠;->ۨۡ۟۟:I

    xor-int/lit16 v5, v5, 0x3af

    const/16 v6, 0x77f

    invoke-static {v1, v4, v5, v6}, Landroid/support/v4/app/ۥۣۡ;->ۣ۠ۧۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->۠۠ۡۨ(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/firebase/inject/ۣۣ۟۠ۧ;->۟ۢۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-static {v5}, Lu/ۣۤۧ۠;->ۦۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lm1/ۣۡ۠ۧ;->ۣۢۡۦ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v1}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۥۧۤ۠(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v1}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->۟۠۠ۢۢ(Ljava/lang/Object;)D

    move-result-wide v0

    const v4, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    sget v4, Lfa/ۣ۟ۥۤ;->ۣۢۡۥ:I

    xor-int/lit16 v4, v4, -0x1c2

    invoke-static {v5, v4}, Lm1/ۣۡ۠ۧ;->ۣۢۡۦ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x234

    const/4 v7, 0x1

    const/16 v8, 0x542

    invoke-static {v5, v6, v7, v8}, Lh5/۟ۦۣۣ;->۟ۤ۠۟ۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_a
    const v2, 0xbf39

    goto :goto_5

    :sswitch_b
    const v4, 0xbe9e

    goto :goto_3

    :sswitch_c
    move-wide v0, v2

    goto :goto_4

    :sswitch_d
    if-eqz v3, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_e
    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const v2, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v2, 0xc221

    goto :goto_6

    :catch_0
    move-exception v0

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_10
    move-wide v0, v2

    :goto_8
    :sswitch_11
    return-wide v0

    :sswitch_12
    const v0, 0xc29d

    goto :goto_7

    :sswitch_13
    move-wide v0, v2

    goto :goto_8

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_13
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_c
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_10
        0xf1 -> :sswitch_12
    .end sparse-switch
.end method

.method public static synthetic f(IILjava/lang/String;J)V
    .locals 1

    invoke-static {p0, p1, p2, p3, p4}, Lcom/auto/accept/service/RideAcceptorService;->ۦۦۥ۠(IILjava/lang/Object;J)V

    return-void
.end method

.method private final fetchIterableNodes(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/accessibility/AccessibilityNodeInfo;",
            "Ljava/util/List",
            "<",
            "Landroid/view/accessibility/AccessibilityNodeInfo;",
            ">;)V"
        }
    .end annotation

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lp7/ۣۣۦۤ;->ۣۢۤۨ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-static {p1, v1}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ld1/ۣۧۡۡ;->۟ۤۦۣۤ(Ljava/lang/Object;)I

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-lez v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v1}, Ls0/ۢۨۦ۟;->۟ۥۢۧۢ(Ljava/lang/Object;)I

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-lez v1, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    invoke-static {p2, p1}, Ll9/۟ۦۥۣۢ;->۟ۢ۟ۡۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_e
    invoke-static {p1}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟ۡ۟ۧ۠(Ljava/lang/Object;)I

    move-result v2

    const/4 v0, 0x0

    :sswitch_f
    const v1, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-ge v0, v2, :cond_4

    const v1, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_5

    :sswitch_12
    invoke-static {p1, v0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۢ۟ۥ۟(Ljava/lang/Object;I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-static {p0, v1, p2}, Lcom/auto/accept/service/RideAcceptorService;->ۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Lea/۟ۦۢۦۤ;->ۢۢۨۥ:I

    xor-int/lit16 v1, v1, -0x14c

    add-int/2addr v0, v1

    const v1, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :sswitch_13
    const v1, 0xc29d

    goto :goto_6

    :sswitch_14
    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۡۡ()I

    move-result v1

    const v0, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    if-gtz v1, :cond_5

    const v0, 0xc5e2

    goto :goto_7

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_17
    const-string v0, "Vhv0BiKWd65Tk0WjdXA"

    invoke-static {v0}, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->۟ۢۡۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_18
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_14
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_14
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_17
    .end sparse-switch
.end method

.method private final findClickableAncestor(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 2

    :sswitch_0
    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {p1}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->۟ۢۨ۠ۢ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {p1}, Lp4/ۣ۟۟ۢۥ;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v0, 0xbe22

    goto :goto_2

    :sswitch_8
    const/4 p1, 0x0

    :sswitch_9
    return-object p1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb97b -> :sswitch_0
    .end sparse-switch
.end method

.method private final findRejectButton(Ljava/util/List;Landroid/graphics/Rect;)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Landroid/view/accessibility/AccessibilityNodeInfo;",
            ">;",
            "Landroid/graphics/Rect;",
            ")",
            "Landroid/view/accessibility/AccessibilityNodeInfo;"
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v6

    :sswitch_0
    invoke-static {v6}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v6}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v0, v5}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm4/۟ۧۤ۠;->۟ۥۣۣۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v4, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x748

    :goto_2
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-nez v1, :cond_2

    const v4, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v4, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {v0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    const v1, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v1, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v4, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v4, 0xbefb

    :goto_4
    const v7, 0xbf0c

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_d
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v7

    const/16 v8, 0x235

    sget v9, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    xor-int/lit16 v9, v9, 0xe0

    const/16 v10, 0x3b3

    invoke-static {v7, v8, v9, v10}, Lv0/۟ۦۣ۟ۤ;->۟۟ۦ۟ۨ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x239

    sget v8, Lo8/۟ۢۧۢۤ;->ۤۡۢۥ:I

    xor-int/lit16 v8, v8, -0x3b6

    const/16 v9, 0x8c2

    invoke-static {v1, v4, v8, v9}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->۟ۤ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {p2}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v4

    const v1, 0xc202

    :goto_6
    const v8, 0xc213

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const/16 v1, 0x3c

    if-ge v4, v1, :cond_4

    const v1, 0xc25f

    goto :goto_6

    :sswitch_f
    const v4, 0xbf1a

    goto :goto_4

    :sswitch_10
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_4
    :sswitch_11
    const v1, 0xc240

    goto :goto_6

    :sswitch_12
    const v1, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    move v1, v2

    :goto_8
    invoke-static {v5}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣۡۡۡ(Ljava/lang/Object;)I

    move-result v5

    invoke-static {p2}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣۡۡۡ(Ljava/lang/Object;)I

    move-result v8

    const v4, 0xc2fa

    :goto_9
    const v9, 0xc30b

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    if-ge v5, v8, :cond_5

    const v4, 0xc5e2

    goto :goto_9

    :sswitch_15
    const v1, 0xc29d

    goto :goto_7

    :sswitch_16
    move v1, v3

    goto :goto_8

    :cond_5
    :sswitch_17
    const v4, 0xc5c3

    goto :goto_9

    :sswitch_18
    const v4, 0xc601

    :goto_a
    const v5, 0xc612

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    const v4, 0xc620

    goto :goto_a

    :sswitch_1a
    move v4, v2

    :goto_b
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v8, 0x249

    sget v9, Lcom/auto/accept/service/۟۠ۧۧۢ;->ۡۨ۟ۨ:I

    xor-int/lit8 v9, v9, 0x77

    const/16 v10, 0xbe1

    invoke-static {v5, v8, v9, v10}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->۟ۢۥ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v8

    const v5, 0xc67d

    :goto_c
    const v9, 0xc68e

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_9

    goto :goto_c

    :cond_6
    :sswitch_1b
    const v5, 0xc6bb

    goto :goto_c

    :sswitch_1c
    move v4, v3

    goto :goto_b

    :sswitch_1d
    if-nez v8, :cond_6

    const v5, 0xc965

    goto :goto_c

    :sswitch_1e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v8, 0x24f

    sget v9, Lh6/ۧۧۤ۟;->۠۟ۤۨ:I

    xor-int/lit16 v9, v9, -0x19e

    const/16 v10, 0xbd5

    invoke-static {v5, v8, v9, v10}, Landroidx/compose/foundation/text/modifiers/۠۠ۧ;->ۣۣ۟ۨ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v8

    const v5, 0xc984

    :goto_d
    const v9, 0xc995

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_a

    goto :goto_d

    :sswitch_1f
    if-nez v8, :cond_7

    const v5, 0xc9e1

    goto :goto_d

    :cond_7
    :sswitch_20
    const v5, 0xc9c2

    goto :goto_d

    :sswitch_21
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v8, 0x253

    sget v9, Le8/۟۠ۦ۟ۢ;->ۥۢۨ:I

    xor-int/lit16 v9, v9, 0x39a

    const/16 v10, 0x36a

    invoke-static {v5, v8, v9, v10}, Lf4/ۡۤۡ;->ۢۧۢۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v8

    const v5, 0xca00

    :goto_e
    const v9, 0xca11

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_b

    goto :goto_e

    :cond_8
    :sswitch_22
    const v5, 0xca3e

    goto :goto_e

    :sswitch_23
    if-nez v8, :cond_8

    const v5, 0xca5d

    goto :goto_e

    :sswitch_24
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v8, 0x257

    sget v9, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۣ۟ۧۤۡ:I

    xor-int/lit16 v9, v9, -0x22d

    const/16 v10, 0x9dc

    invoke-static {v5, v8, v9, v10}, Lc3/۟ۡۧۢۥ;->۟ۡۦۦۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v5, 0xca7c

    :goto_f
    const v8, 0xca8d

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_c

    goto :goto_f

    :sswitch_25
    if-eqz v7, :cond_9

    const v5, 0xcd64

    goto :goto_f

    :cond_9
    :sswitch_26
    const v5, 0xcd45

    goto :goto_f

    :sswitch_27
    const v1, 0xcd83

    :goto_10
    const v2, 0xcd94

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_d

    goto :goto_10

    :sswitch_28
    const v1, 0xcda2

    goto :goto_10

    :sswitch_29
    const v5, 0xcdff

    :goto_11
    const v7, 0xce10

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_e

    goto :goto_11

    :cond_a
    :sswitch_2a
    const v5, 0xce3d

    goto :goto_11

    :sswitch_2b
    if-eqz v1, :cond_a

    const v5, 0xd0e7

    goto :goto_11

    :sswitch_2c
    const v1, 0xd106

    :goto_12
    const v5, 0xd117

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_f

    goto :goto_12

    :sswitch_2d
    if-eqz v4, :cond_b

    const v1, 0xd163

    goto :goto_12

    :cond_b
    :sswitch_2e
    const v1, 0xd144

    goto :goto_12

    :sswitch_2f
    invoke-static {v0}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->۟ۢۨ۠ۢ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xd182

    :goto_13
    const v5, 0xd193

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_10

    goto :goto_13

    :sswitch_30
    if-nez v4, :cond_c

    const v1, 0xd1df

    goto :goto_13

    :cond_c
    :sswitch_31
    const v1, 0xd1c0

    goto :goto_13

    :sswitch_32
    invoke-static {v0}, Lp4/ۣ۟۟ۢۥ;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    const v1, 0xd1fe

    :goto_14
    const v5, 0xd20f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_11

    goto :goto_14

    :sswitch_33
    if-eqz v4, :cond_d

    const v1, 0xd4e6

    goto :goto_14

    :cond_d
    :sswitch_34
    const v1, 0xd4c7

    goto :goto_14

    :sswitch_35
    invoke-static {v4}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->۟ۢۨ۠ۢ(Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xd505

    :goto_15
    const v5, 0xd516

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_12

    goto :goto_15

    :sswitch_36
    if-ne v4, v2, :cond_e

    const v1, 0xd562

    goto :goto_15

    :cond_e
    :sswitch_37
    const v1, 0xd543

    goto :goto_15

    :sswitch_38
    invoke-static {p0, v0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    const v2, 0xd581

    :goto_16
    const v3, 0xd592

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_13

    goto :goto_16

    :sswitch_39
    if-nez v1, :cond_f

    const v2, 0xd869

    goto :goto_16

    :cond_f
    :sswitch_3a
    const v2, 0xd5bf

    goto :goto_16

    :sswitch_3b
    const v1, 0xd888

    :goto_17
    const v2, 0xd899

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_14

    goto :goto_17

    :sswitch_3c
    const v1, 0xd8a7

    goto :goto_17

    :sswitch_3d
    move-object v0, v1

    :goto_18
    :sswitch_3e
    return-object v0

    :sswitch_3f
    invoke-static {p0, v0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    const v2, 0xd904

    :goto_19
    const v3, 0xd915

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_15

    goto :goto_19

    :sswitch_40
    if-nez v1, :cond_10

    const v2, 0xd961

    goto :goto_19

    :cond_10
    :sswitch_41
    const v2, 0xd942

    goto :goto_19

    :sswitch_42
    const v1, 0xd980

    :goto_1a
    const v2, 0xd991

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_16

    goto :goto_1a

    :sswitch_43
    const v1, 0xdc2a

    goto :goto_1a

    :sswitch_44
    const/4 v0, 0x0

    goto :goto_18

    :sswitch_45
    move-object v0, v1

    goto :goto_18

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_44
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_10
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_3f
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_3f
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_3f
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_0
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_0
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
        0x4c -> :sswitch_32
        0x53 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_0
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_37
        0x55 -> :sswitch_0
        0x74 -> :sswitch_38
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_39
        0x2d -> :sswitch_3d
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3c
        0x3e -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_40
        0x36 -> :sswitch_41
        0x57 -> :sswitch_45
        0x74 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_43
        0x5bb -> :sswitch_3e
    .end sparse-switch
.end method

.method private final findTrackedApp(Ljava/lang/String;)Lcom/auto/accept/data/model/SupportedApp;
    .locals 9

    const/4 v3, 0x0

    invoke-static {p1}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x25e

    sget v4, Ld1/ۣۧۡۡ;->ۧ۠ۦۣ:I

    xor-int/lit16 v4, v4, 0xdf

    const/16 v5, 0xcc7

    invoke-static {v1, v2, v4, v5}, Ld/۟ۤ۠ۡۨ;->ۦ۠ۥۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v1

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x271

    sget v5, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۦۥۥۨ:I

    xor-int/lit16 v5, v5, 0x31d

    const/16 v6, 0x7f8

    invoke-static {v2, v4, v5, v6}, Lm0/۟ۤۡۤۤ;->۟ۥ۟ۧۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x275

    sget v5, Lr5/ۣۢ۟ۦ;->ۨۦ۟ۢ:I

    xor-int/lit8 v5, v5, 0x6a

    const/16 v6, 0xa2a

    invoke-static {v1, v2, v5, v6}, Lt9/ۧۦۥ۟;->۟ۡۤۡۦ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    move-object v0, v3

    :goto_3
    return-object v0

    :sswitch_8
    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟۠ۡ۠()Lcom/auto/accept/data/model/SupportedApp$Companion;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۡۡۤۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v6

    :sswitch_9
    invoke-static {v6}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_4

    :sswitch_b
    if-eqz v1, :cond_2

    const v0, 0xbedc

    goto :goto_4

    :sswitch_c
    invoke-static {v6}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Lcom/auto/accept/data/model/SupportedApp;

    invoke-static {v0}, Landroidx/fragment/app/ۣۣۣۨ;->۟۠ۧۡۢ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v7, v0, Ljava/util/Collection;

    const v2, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_5

    :sswitch_e
    if-eqz v7, :cond_3

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_f
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v7

    const v2, 0xc202

    :goto_6
    const v8, 0xc213

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v7, :cond_4

    const v2, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v2, 0xc240

    goto :goto_6

    :sswitch_12
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    const v0, 0xc29d

    goto :goto_7

    :sswitch_14
    invoke-static {v0}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :sswitch_15
    invoke-static {v2}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v7

    const v0, 0xc2fa

    :goto_8
    const v8, 0xc30b

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    if-eqz v7, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_18
    invoke-static {v2}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v7

    invoke-static {v7, v4}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v7}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v7, 0x0

    invoke-static {p1, v0, v7}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v0, 0xc601

    :goto_9
    const v8, 0xc612

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    if-eqz v7, :cond_6

    const v0, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1a
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1b
    move-object v0, v1

    :goto_a
    check-cast v0, Lcom/auto/accept/data/model/SupportedApp;

    goto/16 :goto_3

    :sswitch_1c
    move-object v0, v3

    goto :goto_a

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_1c
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_14
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_9
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_9
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_15
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch
.end method

.method private final handleEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 12

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v6

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۤۢۤ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const-wide/16 v0, -0x1b5

    sget v2, La8/ۣۡۨ۠;->ۣ۟ۧۢ۟:I

    int-to-long v2, v2

    xor-long/2addr v0, v2

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    const-wide/16 v2, 0x1b

    add-long/2addr v2, v6

    sub-long/2addr v2, v4

    const-wide/16 v8, 0x1b

    sub-long/2addr v2, v8

    const-wide/16 v8, 0x7530

    cmp-long v2, v2, v8

    if-lez v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    :try_start_0
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۧۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v3

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x285

    sget v5, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۣ۟ۤۡ۠:I

    xor-int/lit16 v5, v5, -0x39b

    const/16 v8, 0xc3c

    invoke-static {v2, v4, v5, v8}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->۠ۡۤ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2, v0, v1}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۦ۟ۥ۟(Ljava/lang/Object;Ljava/lang/Object;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    const/16 v4, 0x748

    :goto_2
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v4, 0xbe22

    goto :goto_2

    :sswitch_7
    move-wide v2, v0

    :sswitch_8
    iput-wide v2, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedPlanExpiry:J

    iput-wide v6, p0, Lcom/auto/accept/service/RideAcceptorService;->lastPlanExpiryCheckTime:J

    :sswitch_9
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۢۤ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const/4 v3, 0x0

    const v2, 0xbe7f

    :goto_3
    const v8, 0xbe90

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v2, 0xbebd

    goto :goto_3

    :sswitch_b
    cmp-long v2, v4, v0

    if-lez v2, :cond_2

    const v2, 0xbedc

    goto :goto_3

    :sswitch_c
    const v2, 0xbefb

    :goto_4
    const v8, 0xbf0c

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_4

    :sswitch_e
    cmp-long v2, v4, v6

    if-gtz v2, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_f
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۣۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-eqz v1, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_5

    :sswitch_12
    invoke-static {v1}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_14
    if-eqz v1, :cond_5

    const v0, 0xc2db

    goto :goto_6

    :sswitch_15
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x297

    sget v3, Lu3/ۣۡۡۢ;->ۨۧۤۢ:I

    xor-int/lit16 v3, v3, 0x1b1

    const/16 v4, 0x998

    invoke-static {v0, v2, v3, v4}, Lf1/ۥۦ۟ۥ;->۟ۡۧۧ۠([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lz0/ۣ۟۠ۤ۟;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const v0, 0xc2fa

    :goto_7
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_16
    if-eqz v1, :cond_6

    const v0, 0xc5e2

    goto :goto_7

    :cond_6
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_18
    invoke-static {v1}, Lk2/۟ۢۦۤۤ;->ۧۧۥ۟(Ljava/lang/Object;)V

    :sswitch_19
    const/4 v0, 0x0

    nop

    :goto_8
    :sswitch_1a
    return-void

    :sswitch_1b
    invoke-static {p1}, Lz3/ۦۤۡۤ;->۟۟ۦۤ(Ljava/lang/Object;)I

    move-result v4

    const v2, 0xc601

    :goto_9
    const v5, 0xc612

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_1c
    const/16 v2, 0x40

    if-ne v4, v2, :cond_7

    const v2, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1d
    const v2, 0xc63f

    goto :goto_9

    :sswitch_1e
    const v2, 0xc67d

    :goto_a
    const v4, 0xc68e

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1f
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦۣۨۦ(Ljava/lang/Object;)J

    move-result-wide v4

    const v2, 0xc984

    :goto_c
    const v8, 0xc995

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_a

    goto :goto_c

    :sswitch_20
    const-wide/16 v8, 0x1c

    sub-long v8, v6, v8

    sub-long/2addr v8, v4

    const-wide/16 v10, 0x1c

    add-long/2addr v8, v10

    cmp-long v2, v8, v0

    if-gez v2, :cond_8

    const v2, 0xc9e1

    goto :goto_c

    :sswitch_21
    const v2, 0xc69c

    goto :goto_a

    :sswitch_22
    const-wide/16 v0, 0x3

    goto :goto_b

    :cond_8
    :sswitch_23
    const v2, 0xc9c2

    goto :goto_c

    :sswitch_24
    iput-wide v6, p0, Lcom/auto/accept/service/RideAcceptorService;->lastScanTime:J

    invoke-static {p1}, Lf1/ۥۦ۟ۥ;->ۤۥۧۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    const v1, 0xca00

    :goto_d
    const v2, 0xca11

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_b

    goto :goto_d

    :cond_9
    :sswitch_25
    const v1, 0xca3e

    goto :goto_d

    :sswitch_26
    if-nez v0, :cond_9

    const v1, 0xca5d

    goto :goto_d

    :sswitch_27
    invoke-static {p0}, Ls/ۣۡۡۧ;->۟۠ۢۤ۟(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :sswitch_28
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x2a6

    sget v5, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۣ۟ۤۡۧ:I

    xor-int/lit16 v5, v5, -0xb9

    const/16 v6, 0xaa3

    invoke-static {v1, v4, v5, v6}, Lq7/۟ۢۡ۟۟;->ۦۣۣ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v4, 0x2b6

    sget v6, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۢۢۧۢ:I

    xor-int/lit8 v6, v6, -0x34

    const/16 v7, 0xbc1

    invoke-static {v1, v4, v6, v7}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->۟ۦ۟۠۟([SIII)Ljava/lang/String;

    move-result-object v6

    const v1, 0xca7c

    :goto_e
    const v4, 0xca8d

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_c

    goto :goto_e

    :sswitch_29
    if-eqz v0, :cond_a

    const v1, 0xcd64

    goto :goto_e

    :cond_a
    :sswitch_2a
    const v1, 0xcd45

    goto :goto_e

    :sswitch_2b
    invoke-static {v0}, Li4/ۨ۟ۨ;->ۣۡۨۦ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    const v1, 0xcd83

    :goto_f
    const v7, 0xcd94

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_d

    goto :goto_f

    :sswitch_2c
    if-eqz v4, :cond_b

    const v1, 0xcde0

    goto :goto_f

    :cond_b
    :sswitch_2d
    const v1, 0xcdc1

    goto :goto_f

    :sswitch_2e
    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v1, 0xcdff

    :goto_10
    const v7, 0xce10

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_e

    goto :goto_10

    :cond_c
    :sswitch_2f
    const v1, 0xce3d

    goto :goto_10

    :sswitch_30
    if-eqz v4, :cond_c

    const v1, 0xd0e7

    goto :goto_10

    :sswitch_31
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1, v6}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4, v1}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0xd106

    :goto_11
    const v7, 0xd117

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_f

    goto :goto_11

    :sswitch_32
    const v4, 0xd125

    goto :goto_11

    :sswitch_33
    move-object v1, v2

    :sswitch_34
    invoke-static {p0, v1}, Lcom/auto/accept/service/RideAcceptorService;->ۦۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Lcom/auto/accept/data/model/SupportedApp;

    move-result-object v7

    const v1, 0xd182

    :goto_12
    const v4, 0xd193

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_10

    goto :goto_12

    :sswitch_35
    if-eqz v7, :cond_d

    const v1, 0xd1df

    goto :goto_12

    :cond_d
    :sswitch_36
    const v1, 0xd1c0

    goto :goto_12

    :sswitch_37
    move-object v1, v0

    :goto_13
    invoke-static {v1}, Lp4/ۣ۟۟ۢۥ;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v4

    const v2, 0xd1fe

    :goto_14
    const v5, 0xd20f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_11

    goto :goto_14

    :sswitch_38
    if-eqz v4, :cond_e

    const v2, 0xd4e6

    goto :goto_14

    :cond_e
    :sswitch_39
    const v2, 0xd4c7

    goto :goto_14

    :sswitch_3a
    const v2, 0xd505

    :goto_15
    const v4, 0xd516

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_12

    goto :goto_15

    :sswitch_3b
    const/4 v2, 0x3

    if-ge v3, v2, :cond_f

    const v2, 0xd562

    goto :goto_15

    :cond_f
    :sswitch_3c
    const v2, 0xd543

    goto :goto_15

    :sswitch_3d
    invoke-static {v1}, Lp4/ۣ۟۟ۢۥ;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    invoke-static {v1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xd581

    :goto_16
    const v6, 0xd592

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_13

    goto :goto_16

    :sswitch_3e
    if-nez v5, :cond_10

    const v4, 0xd869

    goto :goto_16

    :cond_10
    :sswitch_3f
    const v4, 0xd5bf

    goto :goto_16

    :sswitch_40
    invoke-static {v1}, Lr5/ۣۢ۟ۦ;->۟ۥ۠۠ۥ(Ljava/lang/Object;)V

    :sswitch_41
    sget v1, Laa/۟ۦۣۢۨ;->۠ۡۥ۠:I

    xor-int/lit16 v1, v1, 0x3a3

    add-int/2addr v3, v1

    const v1, 0xd888

    :goto_17
    const v4, 0xd899

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_14

    goto :goto_17

    :sswitch_42
    const v1, 0xd8a7

    goto :goto_17

    :sswitch_43
    move-object v1, v2

    goto :goto_13

    :sswitch_44
    invoke-static {p0, v1, v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xd904

    :goto_18
    const v4, 0xd915

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_15

    goto :goto_18

    :sswitch_45
    if-nez v3, :cond_11

    const v2, 0xd961

    goto :goto_18

    :cond_11
    :sswitch_46
    const v2, 0xd942

    goto :goto_18

    :sswitch_47
    invoke-static {v1}, Lr5/ۣۢ۟ۦ;->۟ۥ۠۠ۥ(Ljava/lang/Object;)V

    :sswitch_48
    invoke-static {v0}, Lr5/ۣۢ۟ۦ;->۟ۥ۠۠ۥ(Ljava/lang/Object;)V

    goto/16 :goto_8

    :sswitch_49
    invoke-static {v0}, Lr5/ۣۢ۟ۦ;->۟ۥ۠۠ۥ(Ljava/lang/Object;)V

    :sswitch_4a
    invoke-static {p0}, Lw2/ۧۦۧ;->۟ۨۢۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    const v3, 0xd980

    :goto_19
    const v4, 0xd991

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_16

    goto :goto_19

    :sswitch_4b
    if-eqz v0, :cond_12

    const v3, 0xdc68

    goto :goto_19

    :cond_12
    :sswitch_4c
    const v3, 0xdc49

    goto :goto_19

    :sswitch_4d
    invoke-static {v0}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xdc87

    :goto_1a
    const v4, 0xdc98

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_17

    goto :goto_1a

    :sswitch_4e
    if-eqz v3, :cond_13

    const v0, 0xdce4

    goto :goto_1a

    :cond_13
    :sswitch_4f
    const v0, 0xdcc5

    goto :goto_1a

    :sswitch_50
    const v0, 0xdd03

    :goto_1b
    const v1, 0xdd14

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_18

    goto :goto_1b

    :sswitch_51
    const v0, 0xdd22

    goto :goto_1b

    :sswitch_52
    invoke-static {v1}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :sswitch_53
    invoke-static {v4}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0x1700af

    :goto_1c
    const v3, 0x1700c0

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_19

    goto :goto_1c

    :cond_14
    :sswitch_54
    const v0, 0x1700ed

    goto :goto_1c

    :sswitch_55
    if-eqz v1, :cond_14

    const v0, 0x17010c

    goto :goto_1c

    :sswitch_56
    invoke-static {v4}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityWindowInfo;

    invoke-static {v0}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۥۥۡۦ(Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v7

    const v1, 0x17012b

    :goto_1d
    const v3, 0x17013c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_1a

    goto :goto_1d

    :sswitch_57
    if-nez v7, :cond_15

    const v1, 0x170188

    goto :goto_1d

    :cond_15
    :sswitch_58
    const v1, 0x170169

    goto :goto_1d

    :sswitch_59
    const v0, 0x1701a7

    :goto_1e
    const v1, 0x1701b8

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1b

    goto :goto_1e

    :sswitch_5a
    const v0, 0x170451

    goto :goto_1e

    :sswitch_5b
    invoke-static {v7}, Li4/ۨ۟ۨ;->ۣۡۨۦ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v3

    const v1, 0x1704ae

    :goto_1f
    const v8, 0x1704bf

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_1c

    goto :goto_1f

    :sswitch_5c
    if-eqz v3, :cond_16

    const v1, 0x17050b

    goto :goto_1f

    :cond_16
    :sswitch_5d
    const v1, 0x1704ec

    goto :goto_1f

    :sswitch_5e
    invoke-static {v3}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v1, 0x17052a

    :goto_20
    const v8, 0x17053b

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_1d

    goto :goto_20

    :sswitch_5f
    if-eqz v3, :cond_17

    const v1, 0x170812

    goto :goto_20

    :cond_17
    :sswitch_60
    const v1, 0x170568

    goto :goto_20

    :sswitch_61
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v1

    invoke-static {v1, v6}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v1}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x170831

    :goto_21
    const v8, 0x170842

    xor-int/2addr v3, v8

    sparse-switch v3, :sswitch_data_1e

    goto :goto_21

    :goto_22
    :sswitch_62
    invoke-static {p0, v1}, Lcom/auto/accept/service/RideAcceptorService;->ۦۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Lcom/auto/accept/data/model/SupportedApp;

    move-result-object v3

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۦۢۢۤ(Ljava/lang/Object;)I

    move-result v8

    const v1, 0x1708ad

    :goto_23
    const v9, 0x1708be

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_1f

    goto :goto_23

    :sswitch_63
    const/4 v1, 0x1

    if-eq v8, v1, :cond_18

    const v1, 0x17090a

    goto :goto_23

    :sswitch_64
    const v3, 0x170850

    goto :goto_21

    :sswitch_65
    move-object v1, v2

    goto :goto_22

    :cond_18
    :sswitch_66
    const v1, 0x1708eb

    goto :goto_23

    :sswitch_67
    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۦۢۢۤ(Ljava/lang/Object;)I

    move-result v1

    const v0, 0x170929

    :goto_24
    const v8, 0x17093a

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_20

    goto :goto_24

    :sswitch_68
    const/4 v0, 0x3

    if-ne v1, v0, :cond_19

    const v0, 0x170c11

    goto :goto_24

    :cond_19
    :sswitch_69
    const v0, 0x170bf2

    goto :goto_24

    :sswitch_6a
    const v0, 0x170c30

    :goto_25
    const v1, 0x170c41

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_21

    goto :goto_25

    :cond_1a
    :sswitch_6b
    const v0, 0x170c6e

    goto :goto_25

    :sswitch_6c
    if-eqz v3, :cond_1a

    const v0, 0x170c8d

    goto :goto_25

    :sswitch_6d
    invoke-static {p0, v7, v3}, Lcom/auto/accept/service/RideAcceptorService;->۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6e
    invoke-static {v7}, Lr5/ۣۢ۟ۦ;->۟ۥ۠۠ۥ(Ljava/lang/Object;)V

    const v0, 0x170cac

    :goto_26
    const v1, 0x170cbd

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_22

    goto :goto_26

    :sswitch_6f
    const v0, 0x170ccb

    goto :goto_26

    :sswitch_70
    invoke-static {}, Ld7/ۢۧۧۢ;->ۨ۠ۤ۟()I

    move-result v1

    const v0, 0x170fb3

    :goto_27
    const v2, 0x170fc4

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_23

    goto :goto_27

    :cond_1b
    :sswitch_71
    const v0, 0x170ff1

    goto :goto_27

    :sswitch_72
    if-gtz v1, :cond_1b

    const v0, 0x171010

    goto :goto_27

    :sswitch_73
    const-string v0, "pfCQ4MPxzqlp08nzRxKcvQR3cW"

    invoke-static {v0}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->۟ۦۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_8

    :catch_0
    move-exception v2

    const v2, 0x17102f

    :goto_28
    const v3, 0x171040

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_24

    goto :goto_28

    :sswitch_74
    const v2, 0x17104e

    goto :goto_28

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_1b
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_1b
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_19
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1c
        0x2d -> :sswitch_22
        0x32 -> :sswitch_1d
        0x4c -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1f
        0xf3 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_23
        0x57 -> :sswitch_24
        0x74 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_25
        0x11 -> :sswitch_26
        0x2f -> :sswitch_28
        0x4c -> :sswitch_27
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_29
        0x7ab -> :sswitch_2a
        0x7c8 -> :sswitch_4a
        0x7e9 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2c
        0x36 -> :sswitch_2d
        0x55 -> :sswitch_33
        0x74 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2f
        0x2d -> :sswitch_33
        0x3ef -> :sswitch_30
        0x1ef7 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_35
        0x32 -> :sswitch_36
        0x4c -> :sswitch_37
        0x53 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_38
        0x6a7 -> :sswitch_39
        0x6c8 -> :sswitch_44
        0x6e9 -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3b
        0x32 -> :sswitch_3c
        0x55 -> :sswitch_44
        0x74 -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3e
        0x2d -> :sswitch_41
        0x32 -> :sswitch_3f
        0xdfb -> :sswitch_40
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_42
        0x3e -> :sswitch_43
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_45
        0x36 -> :sswitch_46
        0x57 -> :sswitch_48
        0x74 -> :sswitch_47
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_4b
        0x5bb -> :sswitch_4c
        0x5d8 -> :sswitch_70
        0x5f9 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_4e
        0x3e -> :sswitch_4f
        0x5d -> :sswitch_52
        0x7c -> :sswitch_50
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_51
        0x36 -> :sswitch_70
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_54
        0x2d -> :sswitch_70
        0x6f -> :sswitch_55
        0x1cc -> :sswitch_56
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_57
        0x55 -> :sswitch_5b
        0x76 -> :sswitch_58
        0xb4 -> :sswitch_59
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_5a
        0x5e9 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_5c
        0x53 -> :sswitch_65
        0x72 -> :sswitch_5d
        0x1b4 -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_5f
        0x53 -> :sswitch_65
        0x72 -> :sswitch_60
        0xd29 -> :sswitch_61
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_62
        0x73 -> :sswitch_64
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_63
        0x55 -> :sswitch_6a
        0x72 -> :sswitch_66
        0x1b4 -> :sswitch_67
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_68
        0x2c8 -> :sswitch_6e
        0x2e9 -> :sswitch_69
        0x52b -> :sswitch_6a
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_6b
        0x2f -> :sswitch_6e
        0x71 -> :sswitch_6c
        0xcc -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_6f
        0x76 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_71
        0x35 -> :sswitch_1a
        0x77 -> :sswitch_72
        0x1fd4 -> :sswitch_73
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_7
        0x6f -> :sswitch_74
    .end sparse-switch
.end method

.method private final logHistoryIfNew(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V
    .locals 10

    const-wide/16 v8, 0xa

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۥ۠ۡ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۨۦۣۤ(Ljava/lang/Object;)J

    move-result-wide v4

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    add-long v0, v2, v8

    sub-long/2addr v0, v4

    sub-long/2addr v0, v8

    const-wide/16 v6, 0x3a98

    cmp-long v0, v0, v6

    if-gez v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lt8/ۦۣ۠;->۟ۤۥ۠ۢ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const-string v0, "xkA3OkK2mJmM4RsUkB9aagGBBqN"

    invoke-static {v0}, Lp5/۟ۡۧۡۨ;->ۢۥۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_3
    :sswitch_9
    return-void

    :sswitch_a
    iput-object p1, p0, Lcom/auto/accept/service/RideAcceptorService;->lastHistoryOrderId:Ljava/lang/String;

    iput-wide v2, p0, Lcom/auto/accept/service/RideAcceptorService;->lastHistoryLogTime:J

    :try_start_0
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۢ۠۟ۤ(Ljava/lang/Object;)Lz4/g;

    move-result-object v1

    const v0, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-eqz v1, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x2ba

    sget v3, Ldagger/hilt/android/internal/modules/ۣۨۨ۠;->ۣۡۢ۟:I

    xor-int/lit16 v3, v3, 0x3e5

    const/16 v4, 0x945

    invoke-static {v0, v2, v3, v4}, Lz1/۟ۦ۟۠۟;->۟ۥ۟ۥۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x2c1

    sget v3, Lrikka/shizuku/۟ۤۦ۟ۦ;->۠ۦۣۨ:I

    xor-int/lit16 v3, v3, 0x343

    const/16 v4, 0x90f

    invoke-static {v0, v2, v3, v4}, Lc0/ۦۢۦۥ;->۟۟ۨۨۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p5, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lz4/e;

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lz4/e;-><init>(Lz4/g;Ljava/lang/String;IZLjava/lang/String;)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v6}, Lfa/ۣ۟ۥۤ;->ۢۦۧۦ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const v0, 0xbefb

    :goto_5
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :sswitch_e
    const v0, 0xbf1a

    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_9
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_9
        0x1f7 -> :sswitch_e
    .end sparse-switch
.end method

.method private final processRideDecision(DDDDLjava/util/List;Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDDD",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/view/accessibility/AccessibilityNodeInfo;",
            "Landroid/view/accessibility/AccessibilityNodeInfo;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-wide/16 v2, 0x0

    sub-double v2, v2, p3

    sub-double v8, p1, v2

    invoke-static/range {p9 .. p9}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    const/4 v2, 0x1

    if-le v3, v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v2, 0x1

    move-object/from16 v0, p9

    invoke-static {v0, v2}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    :sswitch_3
    check-cast v2, Ljava/lang/String;

    move-object v15, v2

    :sswitch_4
    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_6
    move-object/from16 v2, p9

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    xor-int/lit8 v2, v3, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v4, v3, -0x2

    or-int/2addr v2, v4

    if-eqz v2, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_8
    const v2, 0xbe41

    goto :goto_2

    :sswitch_9
    const/4 v2, 0x0

    move-object/from16 v0, p9

    invoke-static {v0, v2}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    const v3, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :sswitch_a
    const v3, 0xbe9e

    goto :goto_3

    :sswitch_b
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x2c9

    sget v4, Ly/ۤۨۧ۟;->۟ۡ۟ۦ۠:I

    xor-int/lit8 v4, v4, -0x1e

    const/16 v5, 0xb54

    invoke-static {v2, v3, v4, v5}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->ۦۧۥۨ([SIII)Ljava/lang/String;

    move-result-object v15

    const v2, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_d
    check-cast p9, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {p9 .. p9}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :sswitch_e
    invoke-static {v5}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    const v3, 0xc202

    :goto_5
    const v6, 0xc213

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-eqz v4, :cond_2

    const v3, 0xc25f

    goto :goto_5

    :cond_2
    :sswitch_10
    const v3, 0xc240

    goto :goto_5

    :sswitch_11
    invoke-static {v5}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v6

    const v3, 0xc27e

    :goto_6
    const v7, 0xc28f

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_6

    goto :goto_6

    :cond_3
    :sswitch_12
    const v3, 0xc2bc

    goto :goto_6

    :sswitch_13
    xor-int/lit8 v3, v6, -0x1

    and-int/lit8 v3, v3, 0x1

    and-int/lit8 v7, v6, -0x2

    or-int/2addr v3, v7

    if-eqz v3, :cond_3

    const v3, 0xc2db

    goto :goto_6

    :sswitch_14
    invoke-static {v2, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v3, 0xc2fa

    :goto_7
    const v4, 0xc30b

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    const v3, 0xc5a4

    goto :goto_7

    :sswitch_16
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v4, 0x2d0

    sget v5, Lcom/auto/accept/data/model/ۣ۟ۥۤ۟;->ۥۢۥۣ:I

    xor-int/lit16 v5, v5, -0x213

    const/16 v6, 0x657

    invoke-static {v3, v4, v5, v6}, Ld5/ۣۦۢۢ;->ۣۧۥۡ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget v7, Lp0/۟ۧۧۧ۟;->ۤۥ۟ۦ:I

    xor-int/lit16 v7, v7, -0x338

    invoke-static/range {v2 .. v7}, Lw9/۟۠۠ۢ۟;->ۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v8, v9}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v4, 0x2d3

    const/4 v5, 0x1

    const/16 v6, 0x773

    invoke-static {v3, v4, v5, v6}, Lc7/۟ۦۣۢۦ;->ۨۦ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2, v15}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۦ۠ۦ(Ljava/lang/Object;)J

    move-result-wide v10

    const v2, 0xc601

    :goto_8
    const v6, 0xc612

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_8

    goto :goto_8

    :sswitch_17
    const-wide/16 v12, 0x1b

    sub-long v12, v4, v12

    sub-long/2addr v12, v10

    const-wide/16 v16, 0x1b

    add-long v12, v12, v16

    const-wide/16 v16, 0x78

    cmp-long v2, v12, v16

    if-gez v2, :cond_4

    const v2, 0xc65e

    goto :goto_8

    :cond_4
    :sswitch_18
    const v2, 0xc63f

    goto :goto_8

    :sswitch_19
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۤۢ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟ۦۣ۠ۨ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    new-instance v6, Lb5/g;

    new-instance v10, Lf0/d;

    sget v11, Lg0/۟ۥۢۥۢ;->۟ۥۤۡۦ:I

    xor-int/lit16 v11, v11, -0x366

    invoke-direct {v10, v4, v5, v11}, Lf0/d;-><init>(JI)V

    const/4 v11, 0x0

    invoke-direct {v6, v10, v11}, Lb5/g;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v6}, Lb3/۟ۧ۠ۡۥ;->ۣۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۤۢ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {v2, v3}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۦۣۥ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xc67d

    :goto_9
    const v10, 0xc68e

    xor-int/2addr v2, v10

    sparse-switch v2, :sswitch_data_9

    goto :goto_9

    :cond_5
    :sswitch_1a
    const v2, 0xc6bb

    goto :goto_9

    :sswitch_1b
    if-eqz v6, :cond_5

    const v2, 0xc965

    goto :goto_9

    :sswitch_1c
    invoke-static {}, Le2/ۨۥۦۡ;->۟ۦۣ۟۠()I

    move-result v3

    const v2, 0xc984

    :goto_a
    const v4, 0xc995

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_a

    goto :goto_a

    :sswitch_1d
    if-ltz v3, :cond_6

    const v2, 0xc9e1

    goto :goto_a

    :cond_6
    :sswitch_1e
    const v2, 0xc9c2

    goto :goto_a

    :sswitch_1f
    const-string v2, "ISSUH9RmOmJP9VrZORC01ji3OSpZ"

    invoke-static {v2}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۥ۠ۢۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(F)V

    :goto_b
    :sswitch_20
    return-void

    :sswitch_21
    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۤۢ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-static {v4, v3, v2}, Ld1/۟۟ۥۡۡ;->۟ۤۧۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۡۡۡ(Ljava/lang/Object;)I

    move-result v2

    int-to-double v4, v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v6, 0x2d4

    sget v10, Landroidx/compose/ui/platform/۟ۨۨۨ;->ۣۤۢ۟:I

    xor-int/lit16 v10, v10, -0xe0

    const/16 v11, 0x908

    invoke-static {v2, v6, v10, v11}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۢ۟۟ۤ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v6, 0x2db

    sget v11, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۤۦۨ:I

    xor-int/lit8 v11, v11, 0x6a

    const/16 v12, 0x9b8

    invoke-static {v2, v6, v11, v12}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟ۤۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v6, 0x2de

    sget v12, Lv6/۟ۦۣۧۦ;->ۤ۟ۦۥ:I

    xor-int/lit8 v12, v12, -0x22

    const/16 v13, 0x2dc

    invoke-static {v2, v6, v12, v13}, Lz3/۟ۡ۠ۦۣ;->ۣۢ۠ۦ([SIII)Ljava/lang/String;

    const v2, 0xca00

    :goto_c
    const v6, 0xca11

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_b

    goto :goto_c

    :cond_7
    :sswitch_22
    const v2, 0xca3e

    goto :goto_c

    :sswitch_23
    cmpg-double v2, v8, v4

    if-ltz v2, :cond_7

    const v2, 0xca5d

    goto :goto_c

    :sswitch_24
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۨۤۦۧ(Ljava/lang/Object;)I

    move-result v2

    int-to-double v4, v2

    const v2, 0xca7c

    :goto_d
    const v6, 0xca8d

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_c

    goto :goto_d

    :sswitch_25
    cmpl-double v2, v8, v4

    if-lez v2, :cond_8

    const v2, 0xcd64

    goto :goto_d

    :cond_8
    :sswitch_26
    const v2, 0xcd45

    goto :goto_d

    :sswitch_27
    const v2, 0xcd83

    :goto_e
    const v4, 0xcd94

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_d

    goto :goto_e

    :sswitch_28
    const v2, 0xcda2

    goto :goto_e

    :sswitch_29
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣ۟ۧۡ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xcdff

    :goto_f
    const v5, 0xce10

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_e

    goto :goto_f

    :cond_9
    :sswitch_2a
    const v2, 0xce3d

    goto :goto_f

    :sswitch_2b
    if-eqz v4, :cond_9

    const v2, 0xd0e7

    goto :goto_f

    :sswitch_2c
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x2ea

    sget v5, Lx2/۟ۢۥ;->۟ۧۤۨۨ:I

    xor-int/lit16 v5, v5, -0x19d

    const/16 v6, 0x344

    invoke-static {v2, v4, v5, v6}, Lcom/google/firebase/encoders/config/ۣۧۦ;->ۡ۠۟ۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v5, 0x2ed

    sget v6, Ldagger/hilt/migration/۟ۦۨۥۣ;->۟۟ۧ۠ۥ:I

    xor-int/lit16 v6, v6, -0x3ca

    const/16 v12, 0x90f

    invoke-static {v2, v5, v6, v12}, Lu4/۟ۡۢۦۣ;->۟ۡۥۣ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v6, 0x2ef

    sget v12, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۢۢ۟۟:I

    xor-int/lit16 v12, v12, -0xac

    const/16 v13, 0x2ef

    invoke-static {v2, v6, v12, v13}, Lr6/۟ۡ۠۟ۡ;->۟۟ۦۨ۠([SIII)Ljava/lang/String;

    move-result-object v6

    const v2, 0xd106

    :goto_10
    const v12, 0xd117

    xor-int/2addr v2, v12

    sparse-switch v2, :sswitch_data_f

    goto :goto_10

    :sswitch_2d
    const-wide/16 v12, 0x0

    cmpl-double v2, p5, v12

    if-lez v2, :cond_a

    const v2, 0xd163

    goto :goto_10

    :cond_a
    :sswitch_2e
    const v2, 0xd144

    goto :goto_10

    :sswitch_2f
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۧۨۡ(Ljava/lang/Object;)F

    move-result v12

    float-to-double v0, v12

    move-wide/from16 v16, v0

    const v2, 0xd182

    :goto_11
    const v13, 0xd193

    xor-int/2addr v2, v13

    sparse-switch v2, :sswitch_data_10

    goto :goto_11

    :sswitch_30
    cmpg-double v2, p5, v16

    if-ltz v2, :cond_b

    const v2, 0xd1df

    goto :goto_11

    :cond_b
    :sswitch_31
    const v2, 0xd1c0

    goto :goto_11

    :sswitch_32
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۢۧۥ(Ljava/lang/Object;)F

    move-result v2

    float-to-double v0, v2

    move-wide/from16 v16, v0

    const v2, 0xd1fe

    :goto_12
    const v13, 0xd20f

    xor-int/2addr v2, v13

    sparse-switch v2, :sswitch_data_11

    goto :goto_12

    :sswitch_33
    cmpl-double v2, p5, v16

    if-lez v2, :cond_c

    const v2, 0xd4e6

    goto :goto_12

    :cond_c
    :sswitch_34
    const v2, 0xd4c7

    goto :goto_12

    :sswitch_35
    const v2, 0xd505

    :goto_13
    const v13, 0xd516

    xor-int/2addr v2, v13

    sparse-switch v2, :sswitch_data_12

    goto :goto_13

    :sswitch_36
    const v2, 0xd524

    goto :goto_13

    :sswitch_37
    const v2, 0xd581

    :goto_14
    const v12, 0xd592

    xor-int/2addr v2, v12

    sparse-switch v2, :sswitch_data_13

    goto :goto_14

    :sswitch_38
    const v2, 0xd5a0

    goto :goto_14

    :sswitch_39
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۢۧۥ(Ljava/lang/Object;)F

    move-result v2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v14

    const/16 v15, 0x2fb

    sget v16, Ln1/۟۠۟ۤۤ;->۟۟۠۠۟:I

    xor-int/lit8 v16, v16, 0x79

    const/16 v17, 0x29c

    invoke-static/range {v14 .. v17}, Lcom/google/firebase/iid/۟ۥ۟۠ۦ;->ۦۥۧۧ([SIII)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, p5

    invoke-static {v13, v0, v1}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    invoke-static {v13, v6}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v13, v12}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۣ۟۟ۧۢ(Ljava/lang/Object;F)Ljava/lang/StringBuilder;

    invoke-static {v13, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v13, v2}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۣ۟۟ۧۢ(Ljava/lang/Object;F)Ljava/lang/StringBuilder;

    invoke-static {v13, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v13}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p12

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v10}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    double-to-int v5, v8

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, p12

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v5, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۢۦ۠(Ljava/lang/Object;IZ)V

    goto/16 :goto_b

    :sswitch_3a
    const v2, 0xd888

    :goto_15
    const v12, 0xd899

    xor-int/2addr v2, v12

    sparse-switch v2, :sswitch_data_14

    goto :goto_15

    :sswitch_3b
    const v2, 0xd8a7

    goto :goto_15

    :sswitch_3c
    const v2, 0xd904

    :goto_16
    const v12, 0xd915

    xor-int/2addr v2, v12

    sparse-switch v2, :sswitch_data_15

    goto :goto_16

    :sswitch_3d
    const-wide/16 v12, 0x0

    cmpl-double v2, p7, v12

    if-lez v2, :cond_d

    const v2, 0xd961

    goto :goto_16

    :cond_d
    :sswitch_3e
    const v2, 0xd942

    goto :goto_16

    :sswitch_3f
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦ۠ۥ۟(Ljava/lang/Object;)F

    move-result v12

    float-to-double v0, v12

    move-wide/from16 v16, v0

    const v2, 0xd980

    :goto_17
    const v13, 0xd991

    xor-int/2addr v2, v13

    sparse-switch v2, :sswitch_data_16

    goto :goto_17

    :sswitch_40
    cmpg-double v2, p7, v16

    if-ltz v2, :cond_e

    const v2, 0xdc68

    goto :goto_17

    :cond_e
    :sswitch_41
    const v2, 0xdc49

    goto :goto_17

    :sswitch_42
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦۣ۟۟(Ljava/lang/Object;)F

    move-result v2

    float-to-double v0, v2

    move-wide/from16 v16, v0

    const v2, 0xdc87

    :goto_18
    const v13, 0xdc98

    xor-int/2addr v2, v13

    sparse-switch v2, :sswitch_data_17

    goto :goto_18

    :sswitch_43
    cmpl-double v2, p7, v16

    if-lez v2, :cond_f

    const v2, 0xdce4

    goto :goto_18

    :cond_f
    :sswitch_44
    const v2, 0xdcc5

    goto :goto_18

    :sswitch_45
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦۣ۟۟(Ljava/lang/Object;)F

    move-result v2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v14

    const/16 v15, 0x302

    sget v16, Lea/ۦۦۨۨ;->۟۠ۧ۠۟:I

    move/from16 v0, v16

    xor-int/lit16 v0, v0, 0x2fb

    move/from16 v16, v0

    const/16 v17, 0x3e2

    invoke-static/range {v14 .. v17}, Lv0/ۣۣۡۢ;->ۣۦ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, p7

    invoke-static {v13, v0, v1}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    invoke-static {v13, v6}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v13, v12}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۣ۟۟ۧۢ(Ljava/lang/Object;F)Ljava/lang/StringBuilder;

    invoke-static {v13, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v13, v2}, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۣ۟۟ۧۢ(Ljava/lang/Object;F)Ljava/lang/StringBuilder;

    invoke-static {v13, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v13}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p12

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v10}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    double-to-int v5, v8

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, p12

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v5, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۢۦ۠(Ljava/lang/Object;IZ)V

    goto/16 :goto_b

    :sswitch_46
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۡۡ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xdd03

    :goto_19
    const v5, 0xdd14

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_18

    goto :goto_19

    :sswitch_47
    if-eqz v4, :cond_10

    const v2, 0x170090

    goto :goto_19

    :cond_10
    :sswitch_48
    const v2, 0xdd41

    goto :goto_19

    :sswitch_49
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۥۣۦۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x1700af

    :goto_1a
    const v5, 0x1700c0

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_19

    goto :goto_1a

    :cond_11
    :sswitch_4a
    const v2, 0x1700ed

    goto :goto_1a

    :sswitch_4b
    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v5, v4, -0x2

    or-int/2addr v2, v5

    if-eqz v2, :cond_11

    const v2, 0x17010c

    goto :goto_1a

    :sswitch_4c
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x307

    sget v6, Ldagger/hilt/internal/ۡۡۨۦ;->ۤۤ۠ۨ:I

    xor-int/lit16 v6, v6, 0xd5

    const/16 v12, 0x600

    invoke-static {v4, v5, v6, v12}, Ll6/ۣۧۧۧ;->ۤۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v2, v12}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7, v2}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x30b

    sget v5, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۣ۟ۢۧۤ:I

    xor-int/lit16 v5, v5, 0x246

    const/16 v6, 0x8ac

    invoke-static {v2, v4, v5, v6}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۡۤۢ۟([SIII)Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۥۣۦۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v16

    :sswitch_4d
    invoke-static/range {v16 .. v16}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v5, 0x31b

    sget v17, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->ۣۣ۟ۨۧ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x389

    move/from16 v17, v0

    const/16 v18, 0xaf2

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v2, v5, v0, v1}, Li6/ۡۤۦ;->ۦۣۣۧ([SIII)Ljava/lang/String;

    move-result-object v17

    const v2, 0x17012b

    :goto_1b
    const v5, 0x17013c

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1a

    goto :goto_1b

    :sswitch_4e
    if-eqz v4, :cond_12

    const v2, 0x170188

    goto :goto_1b

    :cond_12
    :sswitch_4f
    const v2, 0x170169

    goto :goto_1b

    :sswitch_50
    invoke-static/range {v16 .. v16}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    move-object/from16 v0, v17

    invoke-static {v2, v0}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v0, v2, Ljava/lang/Boolean;

    move/from16 v17, v0

    const v5, 0x1701a7

    :goto_1c
    const v18, 0x1701b8

    xor-int v5, v5, v18

    sparse-switch v5, :sswitch_data_1b

    goto :goto_1c

    :sswitch_51
    if-eqz v17, :cond_13

    const v5, 0x17048f

    goto :goto_1c

    :cond_13
    :sswitch_52
    const v5, 0x170470

    goto :goto_1c

    :sswitch_53
    check-cast v2, Ljava/lang/Boolean;

    const v5, 0x1704ae

    :goto_1d
    const v17, 0x1704bf

    xor-int v5, v5, v17

    sparse-switch v5, :sswitch_data_1c

    goto :goto_1d

    :sswitch_54
    const v5, 0x1704cd

    goto :goto_1d

    :sswitch_55
    const/4 v2, 0x0

    :sswitch_56
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0x17052a

    :goto_1e
    const v17, 0x17053b

    xor-int v2, v2, v17

    sparse-switch v2, :sswitch_data_1d

    goto :goto_1e

    :sswitch_57
    if-eqz v5, :cond_14

    const v2, 0x170812

    goto :goto_1e

    :cond_14
    :sswitch_58
    const v2, 0x170568

    goto :goto_1e

    :sswitch_59
    invoke-static {v6, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0x170831

    :goto_1f
    const v4, 0x170842

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_1e

    goto :goto_1f

    :sswitch_5a
    const v2, 0x170850

    goto :goto_1f

    :sswitch_5b
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۥۣۦۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v18

    :sswitch_5c
    invoke-static/range {v18 .. v18}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x1708ad

    :goto_20
    const v5, 0x1708be

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_1f

    goto :goto_20

    :sswitch_5d
    if-eqz v4, :cond_15

    const v2, 0x17090a

    goto :goto_20

    :cond_15
    :sswitch_5e
    const v2, 0x1708eb

    goto :goto_20

    :sswitch_5f
    invoke-static/range {v18 .. v18}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    move-object/from16 v0, v17

    invoke-static {v2, v0}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v0, v2, Ljava/lang/Boolean;

    move/from16 v19, v0

    const v5, 0x170929

    :goto_21
    const v20, 0x17093a

    xor-int v5, v5, v20

    sparse-switch v5, :sswitch_data_20

    goto :goto_21

    :sswitch_60
    if-eqz v19, :cond_16

    const v5, 0x170c11

    goto :goto_21

    :cond_16
    :sswitch_61
    const v5, 0x170bf2

    goto :goto_21

    :sswitch_62
    check-cast v2, Ljava/lang/Boolean;

    const v5, 0x170c30

    :goto_22
    const v19, 0x170c41

    xor-int v5, v5, v19

    sparse-switch v5, :sswitch_data_21

    goto :goto_22

    :goto_23
    :sswitch_63
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v2, v5}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0x170cac

    :goto_24
    const v19, 0x170cbd

    xor-int v2, v2, v19

    sparse-switch v2, :sswitch_data_22

    goto :goto_24

    :sswitch_64
    if-eqz v5, :cond_17

    const v2, 0x170f94

    goto :goto_24

    :sswitch_65
    const v5, 0x170c4f

    goto :goto_22

    :sswitch_66
    const/4 v2, 0x0

    goto :goto_23

    :cond_17
    :sswitch_67
    const v2, 0x170cea

    goto :goto_24

    :sswitch_68
    move-object/from16 v0, v16

    invoke-static {v0, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_69
    const v2, 0x170fb3

    :goto_25
    const v4, 0x170fc4

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_23

    goto :goto_25

    :sswitch_6a
    const v2, 0x170fd2

    goto :goto_25

    :sswitch_6b
    invoke-static {v6}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v17

    :sswitch_6c
    invoke-static/range {v17 .. v17}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v6, 0x323

    sget v18, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۦۡ۠ۥ:I

    move/from16 v0, v18

    xor-int/lit16 v0, v0, 0x210

    move/from16 v18, v0

    const/16 v19, 0x917

    move/from16 v0, v18

    move/from16 v1, v19

    invoke-static {v2, v6, v0, v1}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v18

    const v2, 0x17102f

    :goto_26
    const v6, 0x171040

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_24

    goto :goto_26

    :cond_18
    :sswitch_6d
    const v2, 0x17106d

    goto :goto_26

    :sswitch_6e
    if-eqz v4, :cond_18

    const v2, 0x17108c

    goto :goto_26

    :sswitch_6f
    invoke-static/range {v17 .. v17}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v2, v4

    check-cast v2, Ljava/util/Map;

    move-object/from16 v0, v18

    invoke-static {v2, v0}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v0, v2, Ljava/lang/String;

    move/from16 v19, v0

    const v6, 0x1710ab

    :goto_27
    const v20, 0x1710bc

    xor-int v6, v6, v20

    sparse-switch v6, :sswitch_data_25

    goto :goto_27

    :sswitch_70
    if-eqz v19, :cond_19

    const v6, 0x171393

    goto :goto_27

    :cond_19
    :sswitch_71
    const v6, 0x171374

    goto :goto_27

    :sswitch_72
    check-cast v2, Ljava/lang/String;

    const v6, 0x1713b2

    :goto_28
    const v19, 0x1713c3

    xor-int v6, v6, v19

    sparse-switch v6, :sswitch_data_26

    goto :goto_28

    :goto_29
    :sswitch_73
    const v6, 0x17142e

    :goto_2a
    const v19, 0x17143f

    xor-int v6, v6, v19

    sparse-switch v6, :sswitch_data_27

    goto :goto_2a

    :sswitch_74
    if-eqz v2, :cond_1a

    const v6, 0x171716

    goto :goto_2a

    :sswitch_75
    const v6, 0x1713d1

    goto :goto_28

    :sswitch_76
    const/4 v2, 0x0

    goto :goto_29

    :cond_1a
    :sswitch_77
    const v6, 0x17146c

    goto :goto_2a

    :sswitch_78
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v6

    invoke-static {v6, v12}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x171735

    :goto_2b
    const v19, 0x171746

    xor-int v6, v6, v19

    sparse-switch v6, :sswitch_data_28

    goto :goto_2b

    :goto_2c
    :sswitch_79
    invoke-static {v2}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v19

    const v6, 0x1717b1

    :goto_2d
    const v20, 0x1717c2

    xor-int v6, v6, v20

    sparse-switch v6, :sswitch_data_29

    goto :goto_2d

    :cond_1b
    :sswitch_7a
    const v6, 0x1717ef

    goto :goto_2d

    :sswitch_7b
    const v6, 0x171754

    goto :goto_2b

    :sswitch_7c
    move-object v2, v5

    goto :goto_2c

    :sswitch_7d
    xor-int/lit8 v6, v19, -0x1

    and-int/lit8 v6, v6, 0x1

    and-int/lit8 v20, v19, -0x2

    or-int v6, v6, v20

    if-eqz v6, :cond_1b

    const v6, 0x17180e

    goto :goto_2d

    :sswitch_7e
    const/4 v6, 0x0

    invoke-static {v13, v2, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v2, 0x17182d

    :goto_2e
    const v19, 0x17183e

    xor-int v2, v2, v19

    sparse-switch v2, :sswitch_data_2a

    goto :goto_2e

    :sswitch_7f
    if-eqz v6, :cond_1c

    const v2, 0x171b15

    goto :goto_2e

    :cond_1c
    :sswitch_80
    const v2, 0x171af6

    goto :goto_2e

    :sswitch_81
    const v2, 0x171b34

    :goto_2f
    const v6, 0x171b45

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_2b

    goto :goto_2f

    :sswitch_82
    move-object v2, v4

    :goto_30
    check-cast v2, Ljava/util/Map;

    const v4, 0x171eb7

    :goto_31
    const v6, 0x171ec8

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_2c

    goto :goto_31

    :cond_1d
    :sswitch_83
    const v4, 0x171ef5

    goto :goto_31

    :sswitch_84
    const v2, 0x171b53

    goto :goto_2f

    :sswitch_85
    const v2, 0x171bb0

    :goto_32
    const v4, 0x171bc1

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_2d

    goto :goto_32

    :sswitch_86
    const v2, 0x171bcf

    goto :goto_32

    :sswitch_87
    const/4 v2, 0x0

    goto :goto_30

    :sswitch_88
    if-eqz v2, :cond_1d

    const v4, 0x171f14

    goto :goto_31

    :sswitch_89
    move-object/from16 v0, v18

    invoke-static {v2, v0}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x32a

    sget v12, Lh3/ۣ۠ۡۨ;->ۣ۟ۡۥۨ:I

    xor-int/lit16 v12, v12, -0x243

    const/16 v13, 0xbe9

    invoke-static {v5, v6, v12, v13}, Ldagger/hilt/android/internal/modules/ۣۨۨ۠;->ۣ۟ۧ۟ۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v2}, Ld1/ۣۣ۟ۢۨ;->۟ۤۤۧۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v5, 0x349

    const/4 v6, 0x1

    const/16 v12, 0xac7

    invoke-static {v2, v5, v6, v12}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۣۧ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p12

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v10}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    double-to-int v5, v8

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, p12

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v5, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۢۦ۠(Ljava/lang/Object;IZ)V

    goto/16 :goto_b

    :sswitch_8a
    invoke-static/range {v16 .. v16}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x171f33

    :goto_33
    const v6, 0x171f44

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_2e

    goto :goto_33

    :cond_1e
    :sswitch_8b
    const v2, 0x171f71

    goto :goto_33

    :sswitch_8c
    xor-int/lit8 v2, v4, -0x1

    and-int/lit8 v2, v2, 0x1

    and-int/lit8 v6, v4, -0x2

    or-int/2addr v2, v6

    if-eqz v2, :cond_1e

    const v2, 0x171f90

    goto :goto_33

    :sswitch_8d
    invoke-static/range {v16 .. v16}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x171faf

    :goto_34
    const v6, 0x171fc0

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_2f

    goto :goto_34

    :sswitch_8e
    if-eqz v4, :cond_1f

    const v2, 0x172297

    goto :goto_34

    :cond_1f
    :sswitch_8f
    const v2, 0x172278

    goto :goto_34

    :sswitch_90
    const v2, 0x1722b6

    :goto_35
    const v4, 0x1722c7

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_30

    goto :goto_35

    :sswitch_91
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p12

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x34a

    sget v6, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۦۡ۠ۥ:I

    xor-int/lit16 v6, v6, 0x23b

    const/16 v10, 0x2a3

    invoke-static {v4, v5, v6, v10}, Ll0/ۤ۠ۧ;->۟ۢۥ۟ۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    double-to-int v5, v8

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, p12

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v5, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۢۦ۠(Ljava/lang/Object;IZ)V

    goto/16 :goto_b

    :sswitch_92
    const v2, 0x1722d5

    goto :goto_35

    :sswitch_93
    invoke-static/range {v16 .. v16}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v6

    :sswitch_94
    invoke-static {v6}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x172332

    :goto_36
    const v10, 0x172343

    xor-int/2addr v2, v10

    sparse-switch v2, :sswitch_data_31

    goto :goto_36

    :cond_20
    :sswitch_95
    const v2, 0x172370

    goto :goto_36

    :sswitch_96
    if-eqz v4, :cond_20

    const v2, 0x1774ef

    goto :goto_36

    :sswitch_97
    invoke-static {v6}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    move-object/from16 v0, v18

    invoke-static {v2, v0}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v10, v2, Ljava/lang/String;

    const v4, 0x17750e

    :goto_37
    const v16, 0x17751f

    xor-int v4, v4, v16

    sparse-switch v4, :sswitch_data_32

    goto :goto_37

    :sswitch_98
    if-eqz v10, :cond_21

    const v4, 0x17756b

    goto :goto_37

    :cond_21
    :sswitch_99
    const v4, 0x17754c

    goto :goto_37

    :sswitch_9a
    check-cast v2, Ljava/lang/String;

    const v4, 0x17758a

    :goto_38
    const v10, 0x17759b

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_33

    goto :goto_38

    :sswitch_9b
    const v4, 0x1775a9

    goto :goto_38

    :sswitch_9c
    const/4 v2, 0x0

    :sswitch_9d
    const v4, 0x177606

    :goto_39
    const v10, 0x177617

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_34

    goto :goto_39

    :sswitch_9e
    if-eqz v2, :cond_22

    const v4, 0x1778ee

    goto :goto_39

    :cond_22
    :sswitch_9f
    const v4, 0x1778cf

    goto :goto_39

    :sswitch_a0
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4, v12}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v4}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x17790d

    :goto_3a
    const v10, 0x17791e

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_35

    goto :goto_3a

    :sswitch_a1
    const v4, 0x17792c

    goto :goto_3a

    :sswitch_a2
    move-object v2, v5

    :sswitch_a3
    invoke-static {v2}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v10

    const v4, 0x177989

    :goto_3b
    const v16, 0x17799a

    xor-int v4, v4, v16

    sparse-switch v4, :sswitch_data_36

    goto :goto_3b

    :sswitch_a4
    xor-int/lit8 v4, v10, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v16, v10, -0x2

    or-int v4, v4, v16

    if-eqz v4, :cond_23

    const v4, 0x177c71

    goto :goto_3b

    :cond_23
    :sswitch_a5
    const v4, 0x1779c7

    goto :goto_3b

    :sswitch_a6
    const/4 v4, 0x0

    invoke-static {v13, v2, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v4

    const v2, 0x177c90

    :goto_3c
    const v10, 0x177ca1

    xor-int/2addr v2, v10

    sparse-switch v2, :sswitch_data_37

    goto :goto_3c

    :cond_24
    :sswitch_a7
    const v2, 0x177cce

    goto :goto_3c

    :sswitch_a8
    if-eqz v4, :cond_24

    const v2, 0x177ced

    goto :goto_3c

    :sswitch_a9
    const v2, 0x177d0c

    :goto_3d
    const v4, 0x177d1d

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_38

    goto :goto_3d

    :sswitch_aa
    const v2, 0x177d2b

    goto :goto_3d

    :sswitch_ab
    move-object/from16 v8, p0

    move-object/from16 v9, p10

    move-wide/from16 v10, p1

    move-wide/from16 v12, p3

    move-object/from16 v14, p12

    move-object/from16 v16, v7

    move-object/from16 v17, v3

    invoke-static/range {v8 .. v17}, Lcom/auto/accept/service/RideAcceptorService;->ۤۥۧۢ(Ljava/lang/Object;Ljava/lang/Object;DDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_b

    :sswitch_ac
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۡۡۡ(Ljava/lang/Object;)I

    move-result v2

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۨۤۦۧ(Ljava/lang/Object;)I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v6

    const/16 v12, 0x376

    const/4 v13, 0x1

    const/16 v14, 0xc10

    invoke-static {v6, v12, v13, v14}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->۠ۥۤۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v8, v9}, Lw2/ۤ۠ۨۤ;->ۤ۟ۤۨ(Ljava/lang/Object;D)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v6

    const/16 v12, 0x377

    sget v13, Lq6/ۣ۟ۢ۟ۤ;->ۡ۠ۢۦ:I

    xor-int/lit16 v13, v13, -0x295

    const/16 v14, 0xaf0

    invoke-static {v6, v12, v13, v14}, Ll3/ۥۣۤ۟;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5, v2}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v6, 0x381

    sget v12, Le9/ۧۧۡ;->۟۟ۤ۠۟:I

    xor-int/lit16 v12, v12, -0x302

    const/16 v13, 0x262

    invoke-static {v2, v6, v12, v13}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->۟ۤ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5, v4}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x383

    sget v6, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۣ۟۟ۡ:I

    xor-int/lit16 v6, v6, -0x30c

    const/16 v12, 0x550

    invoke-static {v4, v5, v6, v12}, Lz8/ۣۤۡۧ;->۟ۥ۠۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p12

    invoke-static {v11, v0, v10, v2, v4}, Lt8/ۦۣ۠;->ۦۣۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v15}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    double-to-int v5, v8

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object/from16 v4, p12

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-static {v0, v5, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۢۦ۠(Ljava/lang/Object;IZ)V

    goto/16 :goto_b

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_3
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_4
        0x1f7 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_e
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_e
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_19
        0x32 -> :sswitch_18
        0x4c -> :sswitch_20
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_20
        0x74 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_22
        0x11 -> :sswitch_23
        0x2f -> :sswitch_27
        0x4c -> :sswitch_24
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_25
        0x7ab -> :sswitch_26
        0x7c8 -> :sswitch_29
        0x7e9 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_28
        0x36 -> :sswitch_ac
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_46
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_3a
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
        0x4c -> :sswitch_32
        0x53 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_37
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_38
        0x32 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3b
        0x3e -> :sswitch_37
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3d
        0x36 -> :sswitch_3e
        0x57 -> :sswitch_46
        0x74 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_40
        0x5bb -> :sswitch_41
        0x5d8 -> :sswitch_45
        0x5f9 -> :sswitch_42
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_43
        0x3e -> :sswitch_44
        0x5d -> :sswitch_46
        0x7c -> :sswitch_45
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_47
        0x36 -> :sswitch_48
        0x55 -> :sswitch_ab
        0x17dd84 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4a
        0x2d -> :sswitch_ab
        0x6f -> :sswitch_4b
        0x1cc -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4e
        0x55 -> :sswitch_5b
        0x76 -> :sswitch_4f
        0xb4 -> :sswitch_50
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_51
        0x537 -> :sswitch_53
        0x5c8 -> :sswitch_55
        0x5e9 -> :sswitch_52
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_54
        0x72 -> :sswitch_56
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_57
        0x53 -> :sswitch_4d
        0x72 -> :sswitch_58
        0xd29 -> :sswitch_59
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_4d
        0x73 -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5d
        0x55 -> :sswitch_6b
        0x72 -> :sswitch_5e
        0x1b4 -> :sswitch_5f
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_60
        0x2c8 -> :sswitch_66
        0x2e9 -> :sswitch_61
        0x52b -> :sswitch_62
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_63
        0x71 -> :sswitch_65
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_64
        0x57 -> :sswitch_69
        0x76 -> :sswitch_67
        0x329 -> :sswitch_68
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_5c
        0x77 -> :sswitch_6a
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_6d
        0x2d -> :sswitch_87
        0x6f -> :sswitch_6e
        0xcc -> :sswitch_6f
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_70
        0x32f -> :sswitch_72
        0x3c8 -> :sswitch_76
        0x3e9 -> :sswitch_71
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_73
        0x71 -> :sswitch_75
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x11 -> :sswitch_74
        0x53 -> :sswitch_7c
        0x72 -> :sswitch_77
        0x329 -> :sswitch_78
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_79
        0x73 -> :sswitch_7b
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_7a
        0x2d -> :sswitch_85
        0x73 -> :sswitch_7d
        0xfcc -> :sswitch_7e
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x13 -> :sswitch_7f
        0x2c8 -> :sswitch_85
        0x2e9 -> :sswitch_80
        0x32b -> :sswitch_81
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x16 -> :sswitch_82
        0x71 -> :sswitch_84
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0x1e -> :sswitch_83
        0x3d -> :sswitch_8a
        0x7f -> :sswitch_88
        0x1dc -> :sswitch_89
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0xe -> :sswitch_6c
        0x71 -> :sswitch_86
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0x16 -> :sswitch_8b
        0x35 -> :sswitch_ab
        0x77 -> :sswitch_8c
        0xd4 -> :sswitch_8d
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x6f -> :sswitch_8e
        0x3d57 -> :sswitch_90
        0x3d99 -> :sswitch_8f
        0x3db8 -> :sswitch_93
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x12 -> :sswitch_91
        0x71 -> :sswitch_92
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x12 -> :sswitch_95
        0x33 -> :sswitch_91
        0x71 -> :sswitch_96
        0x57ac -> :sswitch_97
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x11 -> :sswitch_98
        0x32 -> :sswitch_99
        0x53 -> :sswitch_9c
        0x74 -> :sswitch_9a
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_9b
        0x32 -> :sswitch_9d
    .end sparse-switch

    :sswitch_data_34
    .sparse-switch
        0x11 -> :sswitch_9e
        0xea7 -> :sswitch_9f
        0xed8 -> :sswitch_a2
        0xef9 -> :sswitch_a0
    .end sparse-switch

    :sswitch_data_35
    .sparse-switch
        0x13 -> :sswitch_a1
        0x32 -> :sswitch_a3
    .end sparse-switch

    :sswitch_data_36
    .sparse-switch
        0x13 -> :sswitch_a4
        0x32 -> :sswitch_a5
        0x5d -> :sswitch_94
        0x5eb -> :sswitch_a6
    .end sparse-switch

    :sswitch_data_37
    .sparse-switch
        0xe -> :sswitch_a7
        0x31 -> :sswitch_a8
        0x4c -> :sswitch_a9
        0x6f -> :sswitch_94
    .end sparse-switch

    :sswitch_data_38
    .sparse-switch
        0x11 -> :sswitch_aa
        0x36 -> :sswitch_ab
    .end sparse-switch
.end method

.method private static final processRideDecision$lambda$19(Lc9/c;Ljava/lang/Object;)Z
    .locals 10

    const/4 v7, 0x0

    const/4 v0, 0x0

    const-string v5, "\u06e1\u06e4\u06e4"

    move-object v2, v0

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move v6, v7

    move v8, v7

    move v9, v7

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0, v4}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e4\u06e3\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, p1}, Ld9/ۡۥۣۡ;->۟ۥۣۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e7\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    const/16 v0, 0x386

    const/16 v4, 0x810

    invoke-static {v2, v0, v8, v4}, Lu7/ۣ۟ۡ۟;->۟۟۠۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u06df\u06e8\u06e4"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v7, v9, 0x33b

    const-string v0, "\u06e2\u06e7\u06e3"

    move-object v5, v0

    move v8, v7

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const-string v5, "\u06e7\u06e3\u06e1"

    move-object v2, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v1

    check-cast v0, Ljava/lang/Boolean;

    const-string v5, "\u06e6\u06e3"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    invoke-static {v3}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v6

    const-string v0, "\u06e0\u06e3\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_6
    sget v7, Lp4/ۣ۟۟ۢۥ;->۟ۢ۠ۨۨ:I

    const-string v0, "\u06e3\u06e5\u06e1"

    move-object v5, v0

    move v9, v7

    goto :goto_0

    :sswitch_7
    return v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_5
        0xdcdc -> :sswitch_4
        0x1aab44 -> :sswitch_7
        0x1aaf21 -> :sswitch_3
        0x1ab33e -> :sswitch_1
        0x1ab6bf -> :sswitch_2
        0x1aba48 -> :sswitch_0
        0x1ac585 -> :sswitch_6
    .end sparse-switch
.end method

.method private final routeToScanner(Landroid/view/accessibility/AccessibilityNodeInfo;Lcom/auto/accept/data/model/SupportedApp;)V
    .locals 5

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۥۡۡۨ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Lw5/ۣۨۧ۠;->۟۠۠۟ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p2}, Lw5/ۣۨۧ۠;->۟۠۠۟ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x38b

    sget v3, Lia/۟۠ۡۦ۟;->۟ۥۥۧۡ:I

    xor-int/lit8 v3, v3, 0x7c

    const/16 v4, 0x534

    invoke-static {v0, v2, v3, v4}, Ln/۟۠ۥۥۨ;->۟ۥۥۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->۟ۧ۟ۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x38e

    sget v3, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟ۤ۟ۦ:I

    xor-int/lit16 v3, v3, 0x18e

    const/16 v4, 0x159

    invoke-static {v0, v2, v3, v4}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟۟ۦۢۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->ۥۤۧۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_b
    invoke-static {}, Lr4/۟ۦۦ۠ۥ;->ۣ۠ۦ۠()I

    move-result v1

    const v0, 0xc202

    :goto_6
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-ltz v1, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    invoke-direct {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeAllApps(Landroid/view/accessibility/AccessibilityNodeInfo;Lcom/auto/accept/data/model/SupportedApp;)V

    goto :goto_5

    :cond_3
    :sswitch_f
    const v0, 0xc240

    goto :goto_6

    :sswitch_10
    const-string v0, "byduTypdmNyuBoNrX"

    invoke-static {v0}, Lp7/ۣۣۦۤ;->ۣۧۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_11
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_11
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_b
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_f
        0x4c -> :sswitch_10
        0x53 -> :sswitch_11
    .end sparse-switch
.end method

.method private final scanNodeForOla(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 46

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1, v4}, Lcom/auto/accept/service/RideAcceptorService;->ۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    move-object/from16 v0, p1

    invoke-static {v0, v5}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Ld1/ۣۧۡۡ;->۟ۤۦۣۤ(Ljava/lang/Object;)I

    move-result v5

    int-to-double v6, v5

    const-wide v8, 0x3fbeb851eb851eb8L    # 0.12

    mul-double v26, v6, v8

    new-instance v28, Ljava/util/ArrayList;

    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v4}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v17

    const/4 v5, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x0

    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    const-wide/16 v20, 0x0

    const/4 v9, -0x1

    const/4 v6, -0x1

    const-wide/16 v22, 0x0

    const-wide/high16 v14, -0x4010000000000000L    # -1.0

    move-object v7, v4

    move-object v8, v5

    move v10, v6

    move v11, v9

    move-wide/from16 v18, v14

    :goto_0
    invoke-static/range {v17 .. v17}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x392

    sget v9, Ldagger/hilt/components/ۡۧ۟;->ۣۨۢۤ:I

    xor-int/lit16 v9, v9, 0x203

    const/16 v14, 0xc34

    invoke-static {v4, v6, v9, v14}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->۟ۧۤۢ۟([SIII)Ljava/lang/String;

    move-result-object v29

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x399

    sget v9, Lc3/۟ۡۧۢۥ;->ۨۦۤۨ:I

    xor-int/lit16 v9, v9, 0x145

    const/16 v14, 0x925

    invoke-static {v4, v6, v9, v14}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->۟ۤ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v30

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x3a0

    sget v9, La8/ۣۡۨ۠;->ۣ۟ۧۢ۟:I

    xor-int/lit16 v9, v9, -0x1b3

    const/16 v14, 0x2ec

    invoke-static {v4, v6, v9, v14}, Lh0/۟ۥ۟ۡۦ;->ۣۨ۟۠([SIII)Ljava/lang/String;

    move-result-object v31

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x3a6

    sget v9, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۥۤۦ:I

    xor-int/lit16 v9, v9, -0x3ac

    const/16 v14, 0x165

    invoke-static {v4, v6, v9, v14}, Ll0/ۤ۠ۧ;->۟ۢۥ۟ۨ([SIII)Ljava/lang/String;

    move-result-object v24

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x3b6

    sget v9, Lh6/ۧۧۤ۟;->۠۟ۤۨ:I

    xor-int/lit16 v9, v9, -0x19e

    const/16 v14, 0x232

    invoke-static {v4, v6, v9, v14}, Lk4/۟۠ۦ۟ۤ;->۟۟ۥۦۡ([SIII)Ljava/lang/String;

    move-result-object v25

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v14

    const/16 v4, 0x650

    :goto_1
    xor-int/lit16 v4, v4, 0x661

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v4, 0x68e

    goto :goto_1

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v4, 0x6ad

    goto :goto_1

    :sswitch_2
    invoke-static/range {v17 .. v17}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v4, v15}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v15}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣۡۡۡ(Ljava/lang/Object;)I

    move-result v5

    int-to-double v0, v5

    move-wide/from16 v32, v0

    const/16 v5, 0x6cc

    :goto_2
    xor-int/lit16 v5, v5, 0x6dd

    sparse-switch v5, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    cmpg-double v5, v32, v26

    if-ltz v5, :cond_1

    const/16 v5, 0x729

    goto :goto_2

    :cond_1
    :sswitch_4
    const/16 v5, 0x70a

    goto :goto_2

    :sswitch_5
    invoke-static {v4}, Lm4/۟ۧۤ۠;->۟ۥۣۣۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const/16 v5, 0x748

    :goto_3
    xor-int/lit16 v5, v5, 0x759

    sparse-switch v5, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    if-eqz v6, :cond_2

    const v5, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_7
    const v5, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const v5, 0xbe7f

    :goto_4
    const v9, 0xbe90

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_9
    const v5, 0xbebd

    goto :goto_4

    :sswitch_a
    if-eqz v6, :cond_3

    const v5, 0xbedc

    goto :goto_4

    :sswitch_b
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v5

    move-object/from16 v0, v25

    invoke-static {v5, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v5}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v24

    invoke-static {v5, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v6, 0xbefb

    :goto_5
    const v9, 0xbf0c

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_c
    invoke-static {v4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v9

    const v6, 0xc202

    :goto_7
    const v32, 0xc213

    xor-int v6, v6, v32

    sparse-switch v6, :sswitch_data_5

    goto :goto_7

    :sswitch_d
    if-eqz v9, :cond_4

    const v6, 0xc25f

    goto :goto_7

    :sswitch_e
    const v6, 0xbf1a

    goto :goto_5

    :sswitch_f
    move-object v5, v14

    goto :goto_6

    :cond_4
    :sswitch_10
    const v6, 0xc240

    goto :goto_7

    :sswitch_11
    invoke-static {v9}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const v6, 0xc27e

    :goto_8
    const v32, 0xc28f

    xor-int v6, v6, v32

    sparse-switch v6, :sswitch_data_6

    goto :goto_8

    :cond_5
    :sswitch_12
    const v6, 0xc2bc

    goto :goto_8

    :sswitch_13
    if-eqz v9, :cond_5

    const v6, 0xc2db

    goto :goto_8

    :sswitch_14
    invoke-static {v9}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const v9, 0xc2fa

    :goto_9
    const v32, 0xc30b

    xor-int v9, v9, v32

    sparse-switch v9, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    if-nez v6, :cond_6

    const v9, 0xc5e2

    goto :goto_9

    :cond_6
    :sswitch_16
    const v9, 0xc5c3

    goto :goto_9

    :sswitch_17
    const v6, 0xc601

    :goto_a
    const v9, 0xc612

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    const v6, 0xc620

    goto :goto_a

    :sswitch_19
    const v9, 0xc67d

    :goto_b
    const v14, 0xc68e

    xor-int/2addr v9, v14

    sparse-switch v9, :sswitch_data_9

    goto :goto_b

    :sswitch_1a
    move-object v14, v6

    :sswitch_1b
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v6

    move-object/from16 v0, v25

    invoke-static {v6, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v14, v6}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, v24

    invoke-static {v9, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v9}, Lv9/۟۟ۤۥ;->ۣۣۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3ba

    sget v25, Ldagger/hilt/migration/۟ۦۨۥۣ;->۟۟ۧ۠ۥ:I

    move/from16 v0, v25

    xor-int/lit16 v0, v0, -0x3ce

    move/from16 v25, v0

    const/16 v32, 0xc62

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v32

    invoke-static {v5, v0, v1, v2}, Lu4/ۧۦۦۧ;->۟ۢ۠([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-static {v6, v5, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xc984

    :goto_c
    const v25, 0xc995

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_a

    goto :goto_c

    :sswitch_1c
    if-nez v24, :cond_7

    const v5, 0xc9e1

    goto :goto_c

    :sswitch_1d
    const v9, 0xc69c

    goto :goto_b

    :cond_7
    :sswitch_1e
    const v5, 0xc9c2

    goto :goto_c

    :sswitch_1f
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3c0

    sget v25, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->ۧۤۨۦ:I

    xor-int/lit8 v25, v25, -0x20

    const/16 v32, 0x9b5

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v32

    invoke-static {v5, v0, v1, v2}, Lfa/ۦۣۡۢ;->۟ۧۥۥۨ([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-static {v6, v5, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xca00

    :goto_d
    const v25, 0xca11

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_b

    goto :goto_d

    :cond_8
    :sswitch_20
    const v5, 0xca3e

    goto :goto_d

    :sswitch_21
    if-eqz v24, :cond_8

    const v5, 0xca5d

    goto :goto_d

    :sswitch_22
    invoke-static {v15}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v11

    :sswitch_23
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3c5

    sget v25, Ls7/ۧۤۦۤ;->ۨۥ۟ۥ:I

    move/from16 v0, v25

    xor-int/lit16 v0, v0, 0x309

    move/from16 v25, v0

    const/16 v32, 0x5c4

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v32

    invoke-static {v5, v0, v1, v2}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۣۣ۟ۨ([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-static {v6, v5, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xca7c

    :goto_e
    const v25, 0xca8d

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    if-nez v24, :cond_9

    const v5, 0xcd64

    goto :goto_e

    :cond_9
    :sswitch_25
    const v5, 0xcd45

    goto :goto_e

    :sswitch_26
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3c9

    sget v25, Lw4/۟ۤ۠۟ۨ;->ۨۧۦ۠:I

    move/from16 v0, v25

    xor-int/lit16 v0, v0, 0x2fb

    move/from16 v25, v0

    const/16 v32, 0xa1a

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v32

    invoke-static {v5, v0, v1, v2}, Lv0/۟ۤۧ۠ۧ;->۠ۨۧۢ([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-static {v6, v5, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xcd83

    :goto_f
    const v25, 0xcd94

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_d

    goto :goto_f

    :sswitch_27
    if-nez v24, :cond_a

    const v5, 0xcde0

    goto :goto_f

    :cond_a
    :sswitch_28
    const v5, 0xcdc1

    goto :goto_f

    :sswitch_29
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3cc

    sget v25, Ld7/۟ۢۧۧ۠;->ۣ۟۠ۢۡ:I

    move/from16 v0, v25

    xor-int/lit16 v0, v0, 0x109

    move/from16 v25, v0

    const/16 v32, 0x29a

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v32

    invoke-static {v5, v0, v1, v2}, Lh/۟ۡۥۡۧ;->ۡۢ۠ۢ([SIII)Ljava/lang/String;

    move-result-object v5

    const/16 v24, 0x0

    move/from16 v0, v24

    invoke-static {v6, v5, v0}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xcdff

    :goto_10
    const v25, 0xce10

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_e

    goto :goto_10

    :cond_b
    :sswitch_2a
    const v5, 0xce3d

    goto :goto_10

    :sswitch_2b
    if-eqz v24, :cond_b

    const v5, 0xd0e7

    goto :goto_10

    :sswitch_2c
    const v5, 0xd106

    :goto_11
    const v10, 0xd117

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_f

    goto :goto_11

    :sswitch_2d
    const v5, 0xd125

    goto :goto_11

    :sswitch_2e
    const v5, 0xd182

    :goto_12
    const v24, 0xd193

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_10

    goto :goto_12

    :sswitch_2f
    const v5, 0xd1a1

    goto :goto_12

    :sswitch_30
    invoke-static {v15}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v10

    :sswitch_31
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3d7

    sget v25, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->ۧۤۨۦ:I

    xor-int/lit8 v25, v25, -0x1f

    const/16 v32, 0x7be

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v32

    invoke-static {v5, v0, v1, v2}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۢۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v32

    const/4 v5, 0x0

    move-object/from16 v0, v32

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3db

    sget v33, Ldagger/hilt/internal/ۡۡۨۦ;->ۤۤ۠ۨ:I

    move/from16 v0, v33

    xor-int/lit16 v0, v0, 0xd6

    move/from16 v33, v0

    const/16 v34, 0xb70

    move/from16 v0, v25

    move/from16 v1, v33

    move/from16 v2, v34

    invoke-static {v5, v0, v1, v2}, Lh8/۟ۤۨۨۦ;->۟۟ۤۨ۟([SIII)Ljava/lang/String;

    move-result-object v33

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3e2

    sget v34, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟۟ۦ:I

    move/from16 v0, v34

    xor-int/lit16 v0, v0, -0xf6

    move/from16 v34, v0

    const/16 v35, 0xb61

    move/from16 v0, v25

    move/from16 v1, v34

    move/from16 v2, v35

    invoke-static {v5, v0, v1, v2}, Lf/۟ۤۧ۠ۡ;->ۨۥۨۦ([SIII)Ljava/lang/String;

    move-result-object v34

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3e7

    const/16 v35, 0x1

    const/16 v36, 0x198

    move/from16 v0, v25

    move/from16 v1, v35

    move/from16 v2, v36

    invoke-static {v5, v0, v1, v2}, Lh5/ۢ۠۠۟;->ۣ۟ۤ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v35

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3e8

    const/16 v36, 0x1

    const/16 v37, 0x248

    move/from16 v0, v25

    move/from16 v1, v36

    move/from16 v2, v37

    invoke-static {v5, v0, v1, v2}, Lk/ۣۡۤۧ;->۟ۤۨۢۢ([SIII)Ljava/lang/String;

    move-result-object v36

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3e9

    sget v37, Ldagger/hilt/ۣ۟ۧۤ۠;->ۡۧۡ:I

    move/from16 v0, v37

    xor-int/lit16 v0, v0, -0x14f

    move/from16 v37, v0

    const/16 v38, 0x163

    move/from16 v0, v25

    move/from16 v1, v37

    move/from16 v2, v38

    invoke-static {v5, v0, v1, v2}, Lh5/ۢ۠۠۟;->ۣ۟ۤ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v37

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3f0

    sget v38, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۤۥۤ:I

    xor-int/lit8 v38, v38, -0x6c

    const/16 v39, 0x3c3

    move/from16 v0, v25

    move/from16 v1, v38

    move/from16 v2, v39

    invoke-static {v5, v0, v1, v2}, Lq2/ۣ۟ۢۥ۠;->۠ۨۥۡ([SIII)Ljava/lang/String;

    move-result-object v38

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v25, 0x3f6

    sget v39, Li6/ۡۤۦ;->ۢۢۡۡ:I

    move/from16 v0, v39

    xor-int/lit16 v0, v0, -0x322

    move/from16 v39, v0

    const/16 v40, 0x93a

    move/from16 v0, v25

    move/from16 v1, v39

    move/from16 v2, v40

    invoke-static {v5, v0, v1, v2}, Lz3/۟ۡ۠ۦۣ;->ۣۢ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v39

    const v5, 0xd1fe

    :goto_13
    const v25, 0xd20f

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_11

    goto :goto_13

    :sswitch_32
    if-nez v24, :cond_c

    const v5, 0xd4e6

    goto :goto_13

    :cond_c
    :sswitch_33
    const v5, 0xd4c7

    goto :goto_13

    :sswitch_34
    const/4 v5, 0x0

    move-object/from16 v0, v39

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xd505

    :goto_14
    const v25, 0xd516

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_12

    goto :goto_14

    :sswitch_35
    if-nez v24, :cond_d

    const v5, 0xd562

    goto :goto_14

    :cond_d
    :sswitch_36
    const v5, 0xd543

    goto :goto_14

    :sswitch_37
    const/4 v5, 0x0

    move-object/from16 v0, v38

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xd581

    :goto_15
    const v25, 0xd592

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_13

    goto :goto_15

    :sswitch_38
    if-nez v24, :cond_e

    const v5, 0xd869

    goto :goto_15

    :cond_e
    :sswitch_39
    const v5, 0xd5bf

    goto :goto_15

    :sswitch_3a
    const/4 v5, 0x0

    move-object/from16 v0, v37

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xd888

    :goto_16
    const v25, 0xd899

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_14

    goto :goto_16

    :sswitch_3b
    if-nez v24, :cond_f

    const v5, 0xd8e5

    goto :goto_16

    :cond_f
    :sswitch_3c
    const v5, 0xd8c6

    goto :goto_16

    :sswitch_3d
    move-object/from16 v0, v36

    invoke-static {v9, v0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۣۣۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24

    const v5, 0xd904

    :goto_17
    const v25, 0xd915

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_15

    goto :goto_17

    :sswitch_3e
    if-nez v24, :cond_10

    const v5, 0xd961

    goto :goto_17

    :cond_10
    :sswitch_3f
    const v5, 0xd942

    goto :goto_17

    :sswitch_40
    move-object/from16 v0, v35

    invoke-static {v14, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24

    const v5, 0xd980

    :goto_18
    const v25, 0xd991

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_16

    goto :goto_18

    :sswitch_41
    if-nez v24, :cond_11

    const v5, 0xdc68

    goto :goto_18

    :cond_11
    :sswitch_42
    const v5, 0xdc49

    goto :goto_18

    :sswitch_43
    const/4 v5, 0x0

    move-object/from16 v0, v34

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0xdc87

    :goto_19
    const v25, 0xdc98

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_17

    goto :goto_19

    :sswitch_44
    if-nez v24, :cond_12

    const v5, 0xdce4

    goto :goto_19

    :cond_12
    :sswitch_45
    const v5, 0xdcc5

    goto :goto_19

    :sswitch_46
    const/4 v5, 0x0

    move-object/from16 v0, v33

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0xdd03

    :goto_1a
    const v24, 0xdd14

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_18

    goto :goto_1a

    :sswitch_47
    if-eqz v6, :cond_13

    const v5, 0x170090

    goto :goto_1a

    :cond_13
    :sswitch_48
    const v5, 0xdd41

    goto :goto_1a

    :sswitch_49
    const v5, 0x1700af

    :goto_1b
    const v6, 0x1700c0

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_19

    goto :goto_1b

    :sswitch_4a
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v16

    const v5, 0x1701a7

    :goto_1c
    const v6, 0x1701b8

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_1a

    goto :goto_1c

    :sswitch_4b
    if-nez v16, :cond_14

    const v5, 0x17048f

    goto :goto_1c

    :sswitch_4c
    const v5, 0x1700ce

    goto :goto_1b

    :sswitch_4d
    const v5, 0x17012b

    :goto_1d
    const v6, 0x17013c

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_1b

    goto :goto_1d

    :sswitch_4e
    const v5, 0x17014a

    goto :goto_1d

    :cond_14
    :sswitch_4f
    const v5, 0x170470

    goto :goto_1c

    :sswitch_50
    move-object/from16 v16, v4

    :sswitch_51
    invoke-static {v14}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v6

    const v5, 0x1704ae

    :goto_1e
    const v24, 0x1704bf

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_1c

    goto :goto_1e

    :sswitch_52
    if-nez v6, :cond_15

    const v5, 0x17050b

    goto :goto_1e

    :cond_15
    :sswitch_53
    const v5, 0x1704ec

    goto :goto_1e

    :sswitch_54
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x3fa

    const/16 v24, 0x1

    const/16 v25, 0x853

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۣ۠۠۟([SIII)Ljava/lang/String;

    move-result-object v40

    const/4 v5, 0x0

    move-object/from16 v0, v40

    invoke-static {v14, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v24, 0x3fb

    const/16 v25, 0x1

    const/16 v41, 0x694

    move/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v41

    invoke-static {v5, v0, v1, v2}, Lj2/ۥ۠ۨۢ;->۟ۤۡۨ۠([SIII)Ljava/lang/String;

    move-result-object v41

    const v5, 0x17052a

    :goto_1f
    const v24, 0x17053b

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_1d

    goto :goto_1f

    :sswitch_55
    if-eqz v6, :cond_16

    const v5, 0x170812

    goto :goto_1f

    :cond_16
    :sswitch_56
    const v5, 0x170568

    goto :goto_1f

    :sswitch_57
    const/4 v5, 0x0

    move-object/from16 v0, v41

    invoke-static {v14, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x170831

    :goto_20
    const v24, 0x170842

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_1e

    goto :goto_20

    :cond_17
    :sswitch_58
    const v5, 0x17086f

    goto :goto_20

    :sswitch_59
    if-nez v6, :cond_17

    const v5, 0x17088e

    goto :goto_20

    :sswitch_5a
    move-object/from16 v0, p0

    invoke-static {v0, v14}, Lcom/auto/accept/service/RideAcceptorService;->۠ۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object v5, v6

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v24

    const v5, 0x1708ad

    :goto_21
    const v25, 0x1708be

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_1f

    goto :goto_21

    :sswitch_5b
    xor-int/lit8 v5, v24, -0x1

    and-int/lit8 v5, v5, 0x1

    and-int/lit8 v25, v24, -0x2

    or-int v5, v5, v25

    if-eqz v5, :cond_18

    const v5, 0x17090a

    goto :goto_21

    :cond_18
    :sswitch_5c
    const v5, 0x1708eb

    goto :goto_21

    :sswitch_5d
    invoke-static {v14}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v5}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v24

    const/16 v25, 0x3fc

    const/16 v42, 0x1

    const/16 v43, 0xc52

    move-object/from16 v0, v24

    move/from16 v1, v25

    move/from16 v2, v42

    move/from16 v3, v43

    invoke-static {v0, v1, v2, v3}, Lv0/ۣۣۡۢ;->ۣۦ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v24

    const/16 v25, 0x0

    move-object/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v0, v1}, Lcom/auto/accept/service/۟۠ۧۧۢ;->۟۠۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v25

    const v5, 0x170929

    :goto_22
    const v42, 0x17093a

    xor-int v5, v5, v42

    sparse-switch v5, :sswitch_data_20

    goto :goto_22

    :sswitch_5e
    if-eqz v25, :cond_19

    const v5, 0x170c11

    goto :goto_22

    :cond_19
    :sswitch_5f
    const v5, 0x170bf2

    goto :goto_22

    :sswitch_60
    const/4 v5, 0x0

    invoke-static {v6, v5}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v22

    const v5, 0x170c30

    :goto_23
    const v6, 0x170c41

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_21

    goto :goto_23

    :goto_24
    :sswitch_61
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x3fd

    sget v24, Lcom/google/firebase/firestore/util/ۣۣ۠;->ۢۦۡۡ:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, -0x23b

    move/from16 v24, v0

    const/16 v25, 0x2d6

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lm7/ۧۢ۟;->ۧۨۨۨ([SIII)Ljava/lang/String;

    move-result-object v42

    const/4 v5, 0x0

    move-object/from16 v0, v42

    invoke-static {v9, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x1722b6

    :goto_25
    const v24, 0x1722c7

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_22

    goto :goto_25

    :cond_1a
    :sswitch_62
    const v5, 0x1722f4

    goto :goto_25

    :sswitch_63
    const v5, 0x170c4f

    goto :goto_23

    :sswitch_64
    const/4 v5, 0x0

    move-object/from16 v0, v24

    invoke-static {v14, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v25

    const v5, 0x170cac

    :goto_26
    const v42, 0x170cbd

    xor-int v5, v5, v42

    sparse-switch v5, :sswitch_data_23

    goto :goto_26

    :sswitch_65
    if-eqz v25, :cond_1b

    const v5, 0x170f94

    goto :goto_26

    :cond_1b
    :sswitch_66
    const v5, 0x170cea

    goto :goto_26

    :sswitch_67
    invoke-static {v6}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v25

    const v5, 0x170fb3

    :goto_27
    const v42, 0x170fc4

    xor-int v5, v5, v42

    sparse-switch v5, :sswitch_data_24

    goto :goto_27

    :cond_1c
    :sswitch_68
    const v5, 0x170ff1

    goto :goto_27

    :sswitch_69
    const/4 v5, 0x2

    move/from16 v0, v25

    if-lt v0, v5, :cond_1c

    const v5, 0x171010

    goto :goto_27

    :sswitch_6a
    const/4 v5, 0x0

    invoke-static {v6, v5}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v24

    const v5, 0x17102f

    :goto_28
    const v42, 0x171040

    xor-int v5, v5, v42

    sparse-switch v5, :sswitch_data_25

    goto :goto_28

    :cond_1d
    :sswitch_6b
    const v5, 0x17106d

    goto :goto_28

    :sswitch_6c
    cmpl-double v5, v24, v20

    if-lez v5, :cond_1d

    const v5, 0x17108c

    goto :goto_28

    :sswitch_6d
    const/4 v5, 0x0

    invoke-static {v6, v5}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v20

    const/4 v5, 0x1

    invoke-static {v6, v5}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v22

    :sswitch_6e
    const v5, 0x1710ab

    :goto_29
    const v6, 0x1710bc

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_26

    goto :goto_29

    :sswitch_6f
    const v5, 0x171355

    goto :goto_29

    :sswitch_70
    const v5, 0x1713b2

    :goto_2a
    const v6, 0x1713c3

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_27

    goto :goto_2a

    :sswitch_71
    const v5, 0x1713d1

    goto :goto_2a

    :sswitch_72
    invoke-static {v6}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v25

    const v5, 0x17142e

    :goto_2b
    const v42, 0x17143f

    xor-int v5, v5, v42

    sparse-switch v5, :sswitch_data_28

    goto :goto_2b

    :sswitch_73
    const/4 v5, 0x2

    move/from16 v0, v25

    if-lt v0, v5, :cond_1e

    const v5, 0x171716

    goto :goto_2b

    :cond_1e
    :sswitch_74
    const v5, 0x17146c

    goto :goto_2b

    :sswitch_75
    const/4 v5, 0x0

    move-object/from16 v0, v24

    invoke-static {v14, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v24

    const v5, 0x171735

    :goto_2c
    const v25, 0x171746

    xor-int v5, v5, v25

    sparse-switch v5, :sswitch_data_29

    goto :goto_2c

    :cond_1f
    :sswitch_76
    const v5, 0x171773

    goto :goto_2c

    :sswitch_77
    if-nez v24, :cond_1f

    const v5, 0x171792

    goto :goto_2c

    :sswitch_78
    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lc4/ۡ۟۠ۥ;->ۢۦ۟(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v6

    const v5, 0x1717b1

    :goto_2d
    const v24, 0x1717c2

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_2a

    goto :goto_2d

    :cond_20
    :sswitch_79
    const v5, 0x1717ef

    goto :goto_2d

    :sswitch_7a
    if-eqz v6, :cond_20

    const v5, 0x17180e

    goto :goto_2d

    :sswitch_7b
    invoke-static {v6}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->۟۠۠ۢۢ(Ljava/lang/Object;)D

    move-result-wide v24

    const v5, 0x17182d

    :goto_2e
    const v6, 0x17183e

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_2b

    goto :goto_2e

    :sswitch_7c
    const v5, 0x171ad7

    goto :goto_2e

    :sswitch_7d
    const-wide/16 v24, 0x0

    :sswitch_7e
    const v5, 0x171b34

    :goto_2f
    const v6, 0x171b45

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_2c

    goto :goto_2f

    :cond_21
    :sswitch_7f
    const v5, 0x171b72

    goto :goto_2f

    :sswitch_80
    cmpl-double v5, v24, v20

    if-lez v5, :cond_21

    const v5, 0x171b91

    goto :goto_2f

    :sswitch_81
    const-wide/16 v22, 0x0

    const v5, 0x171bb0

    :goto_30
    const v6, 0x171bc1

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_2d

    goto :goto_30

    :sswitch_82
    move-wide/from16 v20, v24

    goto/16 :goto_24

    :sswitch_83
    const v5, 0x171bcf

    goto :goto_30

    :sswitch_84
    const/4 v5, 0x0

    invoke-static {v6, v5}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v24

    const v5, 0x171eb7

    :goto_31
    const v42, 0x171ec8

    xor-int v5, v5, v42

    sparse-switch v5, :sswitch_data_2e

    goto :goto_31

    :cond_22
    :sswitch_85
    const v5, 0x171ef5

    goto :goto_31

    :sswitch_86
    cmpl-double v5, v24, v20

    if-lez v5, :cond_22

    const v5, 0x171f14

    goto :goto_31

    :sswitch_87
    const/4 v5, 0x0

    invoke-static {v6, v5}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v24

    const v5, 0x171f33

    :goto_32
    const v6, 0x171f44

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_2f

    goto :goto_32

    :sswitch_88
    const v5, 0x171f52

    goto :goto_32

    :sswitch_89
    const v5, 0x171faf

    :goto_33
    const v6, 0x171fc0

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_30

    goto :goto_33

    :sswitch_8a
    const v5, 0x172259

    goto :goto_33

    :sswitch_8b
    if-nez v6, :cond_1a

    const v5, 0x172313

    goto/16 :goto_25

    :sswitch_8c
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x3ff

    sget v24, Lcom/google/firebase/remoteconfig/ktx/ۣ۟ۢ۠ۢ;->۟ۢۢۧۢ:I

    xor-int/lit8 v24, v24, -0x36

    const/16 v25, 0x301

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->۟ۥۧۨ۟([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v9, v5, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x172332

    :goto_34
    const v24, 0x172343

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_31

    goto :goto_34

    :cond_23
    :sswitch_8d
    const v5, 0x172370

    goto :goto_34

    :sswitch_8e
    if-nez v6, :cond_23

    const v5, 0x1774ef

    goto :goto_34

    :sswitch_8f
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x401

    sget v24, Lq9/۟ۧۦۤۨ;->ۣ۟ۤۡ۠:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, 0x327

    move/from16 v24, v0

    const/16 v25, 0xc0f

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۤ۟ۤۥ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v9, v5, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x17750e

    :goto_35
    const v24, 0x17751f

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_32

    goto :goto_35

    :sswitch_90
    if-eqz v6, :cond_24

    const v5, 0x17756b

    goto :goto_35

    :cond_24
    :sswitch_91
    const v5, 0x17754c

    goto :goto_35

    :sswitch_92
    const v5, 0x17758a

    :goto_36
    const v6, 0x17759b

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_33

    goto :goto_36

    :sswitch_93
    const v5, 0x1775a9

    goto :goto_36

    :sswitch_94
    const v5, 0x177606

    :goto_37
    const v6, 0x177617

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_34

    goto :goto_37

    :sswitch_95
    const v5, 0x1778b0

    goto :goto_37

    :sswitch_96
    const/4 v5, 0x0

    move-object/from16 v0, v41

    invoke-static {v9, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x17790d

    :goto_38
    const v24, 0x17791e

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_35

    goto :goto_38

    :sswitch_97
    if-nez v6, :cond_25

    const v5, 0x17796a

    goto :goto_38

    :cond_25
    :sswitch_98
    const v5, 0x17794b

    goto :goto_38

    :sswitch_99
    move-object/from16 v0, p0

    invoke-static {v0, v14}, Lcom/auto/accept/service/RideAcceptorService;->ۣۥۣۧ(Ljava/lang/Object;Ljava/lang/Object;)D

    move-result-wide v24

    const v5, 0x177989

    :goto_39
    const v6, 0x17799a

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_36

    goto :goto_39

    :sswitch_9a
    const-wide/high16 v44, -0x4010000000000000L    # -1.0

    cmpg-double v5, v12, v44

    if-nez v5, :cond_26

    const v5, 0x177c71

    goto :goto_39

    :cond_26
    :sswitch_9b
    const v5, 0x1779c7

    goto :goto_39

    :sswitch_9c
    move-wide/from16 v18, v24

    :goto_3a
    :sswitch_9d
    const v5, 0x177c90

    :goto_3b
    const v6, 0x177ca1

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_37

    goto :goto_3b

    :sswitch_9e
    const/4 v5, 0x0

    move-object/from16 v0, v31

    invoke-static {v9, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x17810b

    :goto_3c
    const v24, 0x17811c

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_38

    goto :goto_3c

    :sswitch_9f
    if-nez v6, :cond_28

    const v5, 0x1783f3

    goto :goto_3c

    :sswitch_a0
    const v5, 0x177caf

    goto :goto_3b

    :sswitch_a1
    const v5, 0x177d0c

    :goto_3d
    const v6, 0x177d1d

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_39

    goto :goto_3d

    :sswitch_a2
    const-wide/high16 v44, -0x4010000000000000L    # -1.0

    cmpg-double v5, v18, v44

    if-nez v5, :cond_27

    const v5, 0x177d69

    goto :goto_3d

    :cond_27
    :sswitch_a3
    const v5, 0x177d4a

    goto :goto_3d

    :sswitch_a4
    const v5, 0x177d88

    :goto_3e
    const v6, 0x177d99

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_3a

    goto :goto_3e

    :sswitch_a5
    const v5, 0x178032

    goto :goto_3e

    :sswitch_a6
    const v5, 0x17808f

    :goto_3f
    const v6, 0x1780a0

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_3b

    goto :goto_3f

    :sswitch_a7
    const v5, 0x1780ae

    goto :goto_3f

    :cond_28
    :sswitch_a8
    const v5, 0x178149

    goto :goto_3c

    :sswitch_a9
    const/4 v5, 0x0

    move-object/from16 v0, v30

    invoke-static {v9, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x178412

    :goto_40
    const v24, 0x178423

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_3c

    goto :goto_40

    :cond_29
    :sswitch_aa
    const v5, 0x178450

    goto :goto_40

    :sswitch_ab
    if-nez v6, :cond_29

    const v5, 0x17846f

    goto :goto_40

    :sswitch_ac
    const/4 v5, 0x0

    move-object/from16 v0, v29

    invoke-static {v9, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x17848e

    :goto_41
    const v24, 0x17849f

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_3d

    goto :goto_41

    :sswitch_ad
    if-nez v6, :cond_2a

    const v5, 0x1784eb

    goto :goto_41

    :cond_2a
    :sswitch_ae
    const v5, 0x1784cc

    goto :goto_41

    :sswitch_af
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x405

    sget v24, Landroidx/annotation/۟ۦۤ۟ۤ;->ۢۥۡۧ:I

    xor-int/lit8 v24, v24, -0x4f

    const/16 v25, 0xc0e

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lga/۟ۢۧ۟ۦ;->۟ۥۡۧۦ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v9, v5, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x17850a

    :goto_42
    const v24, 0x17851b

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_3e

    goto :goto_42

    :sswitch_b0
    if-nez v6, :cond_2b

    const v5, 0x1787f2

    goto :goto_42

    :cond_2b
    :sswitch_b1
    const v5, 0x1787d3

    goto :goto_42

    :sswitch_b2
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x40a

    sget v24, Li9/ۨۨ۟;->ۣ۟۠ۡۤ:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, -0x270

    move/from16 v24, v0

    const/16 v25, 0xc9e

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lw2/ۧۦۧ;->ۣۣۨۤ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v9, v5, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x178811

    :goto_43
    const v24, 0x178822

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_3f

    goto :goto_43

    :cond_2c
    :sswitch_b3
    const v5, 0x17884f

    goto :goto_43

    :sswitch_b4
    if-nez v6, :cond_2c

    const v5, 0x17886e

    goto :goto_43

    :sswitch_b5
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x411

    sget v24, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۡۥۤۡ:I

    xor-int/lit8 v24, v24, -0x49

    const/16 v25, 0x8a3

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lz7/۠ۡ۟ۦ;->ۧۨۦ۠([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v9, v5, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x17888d

    :goto_44
    const v24, 0x17889e

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_40

    goto :goto_44

    :sswitch_b6
    if-nez v6, :cond_2d

    const v5, 0x178b75

    goto :goto_44

    :cond_2d
    :sswitch_b7
    const v5, 0x1788cb

    goto :goto_44

    :sswitch_b8
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x418

    sget v24, Lz/۟ۥۣۣ۠;->۟ۨۢۦ:I

    move/from16 v0, v24

    xor-int/lit16 v0, v0, -0x2ac

    move/from16 v24, v0

    const/16 v25, 0x8ac

    move/from16 v0, v24

    move/from16 v1, v25

    invoke-static {v5, v6, v0, v1}, Lh7/۟۟ۧۨ۟;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v9, v5, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0x178b94

    :goto_45
    const v24, 0x178ba5

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_41

    goto :goto_45

    :cond_2e
    :sswitch_b9
    const v5, 0x178bd2

    goto :goto_45

    :sswitch_ba
    if-eqz v6, :cond_2e

    const v5, 0x178bf1

    goto :goto_45

    :sswitch_bb
    const v5, 0x178c10

    :goto_46
    const v6, 0x178c21

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_42

    goto :goto_46

    :sswitch_bc
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v5

    const v6, 0x178c8c

    :goto_47
    const v7, 0x178c9d

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_43

    goto :goto_47

    :sswitch_bd
    if-nez v5, :cond_2f

    const v6, 0x178f74

    goto :goto_47

    :sswitch_be
    const v5, 0x178c2f

    goto :goto_46

    :cond_2f
    :sswitch_bf
    const v6, 0x178f55

    goto :goto_47

    :sswitch_c0
    move-object v5, v4

    :sswitch_c1
    move-object v8, v5

    move-object v7, v4

    :sswitch_c2
    invoke-static {v14}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v5

    const v4, 0x178f93

    :goto_48
    const v6, 0x178fa4

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_44

    goto :goto_48

    :cond_30
    :sswitch_c3
    const v4, 0x178fd1

    goto :goto_48

    :sswitch_c4
    const/4 v4, 0x4

    if-le v5, v4, :cond_30

    const v4, 0x178ff0

    goto :goto_48

    :sswitch_c5
    const/4 v4, 0x0

    move-object/from16 v0, v40

    invoke-static {v14, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17900f

    :goto_49
    const v6, 0x179020

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_45

    goto :goto_49

    :cond_31
    :sswitch_c6
    const v4, 0x17904d

    goto :goto_49

    :sswitch_c7
    if-nez v5, :cond_31

    const v4, 0x1792f7

    goto :goto_49

    :sswitch_c8
    const/4 v4, 0x0

    move-object/from16 v0, v42

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x179316

    :goto_4a
    const v6, 0x179327

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_46

    goto :goto_4a

    :cond_32
    :sswitch_c9
    const v4, 0x179354

    goto :goto_4a

    :sswitch_ca
    if-nez v5, :cond_32

    const v4, 0x179373

    goto :goto_4a

    :sswitch_cb
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x41e

    sget v6, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->۟ۢۥۣ۟:I

    xor-int/lit16 v6, v6, -0x310

    const/16 v24, 0xa33

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lla/۟ۢۥۧۥ;->۟ۦۤۦۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x179392

    :goto_4b
    const v6, 0x1793a3

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_47

    goto :goto_4b

    :cond_33
    :sswitch_cc
    const v4, 0x1793d0

    goto :goto_4b

    :sswitch_cd
    if-nez v5, :cond_33

    const v4, 0x1793ef

    goto :goto_4b

    :sswitch_ce
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x421

    sget v6, Ll0/ۤ۠ۧ;->ۡۥۦۨ:I

    xor-int/lit16 v6, v6, -0x102

    const/16 v24, 0x3b0

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۡۥۨۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17940e

    :goto_4c
    const v6, 0x17941f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_48

    goto :goto_4c

    :sswitch_cf
    if-nez v5, :cond_34

    const v4, 0x1796f6

    goto :goto_4c

    :cond_34
    :sswitch_d0
    const v4, 0x1796d7

    goto :goto_4c

    :sswitch_d1
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x425

    sget v6, Lm7/ۥۨۥ۟;->۠ۡۡۦ:I

    xor-int/lit16 v6, v6, 0x30f

    const/16 v24, 0xc49

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۤۧ۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x179715

    :goto_4d
    const v6, 0x179726

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_49

    goto :goto_4d

    :cond_35
    :sswitch_d2
    const v4, 0x179753

    goto :goto_4d

    :sswitch_d3
    if-nez v5, :cond_35

    const v4, 0x179772

    goto :goto_4d

    :sswitch_d4
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x428

    sget v6, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۠ۧ۠ۤ:I

    xor-int/lit16 v6, v6, 0x315

    const/16 v24, 0xa30

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->۟ۢۡۨۥ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x179791

    :goto_4e
    const v6, 0x1797a2

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4a

    goto :goto_4e

    :cond_36
    :sswitch_d5
    const v4, 0x1797cf

    goto :goto_4e

    :sswitch_d6
    if-nez v5, :cond_36

    const v4, 0x17e94e

    goto :goto_4e

    :sswitch_d7
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x42e

    sget v6, Lv0/ۣ۟۟ۤۧ;->ۦ۟ۦۦ:I

    xor-int/lit16 v6, v6, -0x376

    const/16 v24, 0x5fb

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lu1/ۢۥ۠ۤ;->۟ۦۢ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17e96d

    :goto_4f
    const v6, 0x17e97e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4b

    goto :goto_4f

    :sswitch_d8
    if-nez v5, :cond_37

    const v4, 0x17e9ca

    goto :goto_4f

    :cond_37
    :sswitch_d9
    const v4, 0x17e9ab

    goto :goto_4f

    :sswitch_da
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x432

    sget v6, Ll0/ۡۦۦۡ;->ۦۨۨۥ:I

    xor-int/lit16 v6, v6, -0x3ce

    const/16 v24, 0x61b

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۦۡۧ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17e9e9

    :goto_50
    const v6, 0x17e9fa

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4c

    goto :goto_50

    :sswitch_db
    if-nez v5, :cond_38

    const v4, 0x17ea46

    goto :goto_50

    :cond_38
    :sswitch_dc
    const v4, 0x17ea27

    goto :goto_50

    :sswitch_dd
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x437

    sget v6, La0/ۣ۟ۤۨۧ;->۟ۦ۟ۥۣ:I

    xor-int/lit16 v6, v6, -0x35a

    const/16 v24, 0xc4e

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/firebase/annotations/ۣۤ۟ۦ;->۟ۦ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17ea65

    :goto_51
    const v6, 0x17ea76

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4d

    goto :goto_51

    :sswitch_de
    if-nez v5, :cond_39

    const v4, 0x17ed4d

    goto :goto_51

    :cond_39
    :sswitch_df
    const v4, 0x17ed2e

    goto :goto_51

    :sswitch_e0
    const/4 v4, 0x0

    move-object/from16 v0, v31

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17ed6c

    :goto_52
    const v6, 0x17ed7d

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4e

    goto :goto_52

    :sswitch_e1
    if-nez v5, :cond_3a

    const v4, 0x17edc9

    goto :goto_52

    :cond_3a
    :sswitch_e2
    const v4, 0x17edaa

    goto :goto_52

    :sswitch_e3
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x43c

    sget v6, Lcom/google/firebase/measurement/ۢۥۤۦ;->ۥۦۥ۠:I

    xor-int/lit16 v6, v6, 0x109

    const/16 v24, 0xb71

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lr6/۟ۡ۠۟ۡ;->۟۟ۦۨ۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17ede8

    :goto_53
    const v6, 0x17edf9

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_4f

    goto :goto_53

    :sswitch_e4
    if-nez v5, :cond_3b

    const v4, 0x17f0d0

    goto :goto_53

    :cond_3b
    :sswitch_e5
    const v4, 0x17ee26

    goto :goto_53

    :sswitch_e6
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x442

    sget v6, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->۟ۦۣۢۢ:I

    xor-int/lit16 v6, v6, 0x199

    const/16 v24, 0x745

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۧۤۦ۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f0ef

    :goto_54
    const v6, 0x17f100

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_50

    goto :goto_54

    :cond_3c
    :sswitch_e7
    const v4, 0x17f12d

    goto :goto_54

    :sswitch_e8
    if-nez v5, :cond_3c

    const v4, 0x17f14c

    goto :goto_54

    :sswitch_e9
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x446

    sget v6, Ld9/ۨۧۧۦ;->۟۟ۥۨۢ:I

    xor-int/lit16 v6, v6, 0x34f

    const/16 v24, 0xa55

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lla/۟ۢۥۧۥ;->۟ۦۤۦۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f16b

    :goto_55
    const v6, 0x17f17c

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_51

    goto :goto_55

    :sswitch_ea
    if-nez v5, :cond_3d

    const v4, 0x17f1c8

    goto :goto_55

    :cond_3d
    :sswitch_eb
    const v4, 0x17f1a9

    goto :goto_55

    :sswitch_ec
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x44e

    sget v6, Lx4/ۣۡۢ۠;->۟ۤۤۧۤ:I

    xor-int/lit16 v6, v6, 0xcd

    const/16 v24, 0xafd

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۥۣۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f1e7

    :goto_56
    const v6, 0x17f1f8

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_52

    goto :goto_56

    :sswitch_ed
    if-nez v5, :cond_3e

    const v4, 0x17f4cf    # 2.200037E-39f

    goto :goto_56

    :cond_3e
    :sswitch_ee
    const v4, 0x17f4b0    # 2.199994E-39f

    goto :goto_56

    :sswitch_ef
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x454

    sget v6, Lr9/۟ۢۢۤۨ;->۟ۥۡۥۦ:I

    xor-int/lit8 v6, v6, 0x57

    const/16 v24, 0x9f2

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣ۟۠ۦۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f4ee    # 2.20008E-39f

    :goto_57
    const v6, 0x17f4ff

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_53

    goto :goto_57

    :sswitch_f0
    if-nez v5, :cond_3f

    const v4, 0x17f54b

    goto :goto_57

    :cond_3f
    :sswitch_f1
    const v4, 0x17f52c

    goto :goto_57

    :sswitch_f2
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x45b

    sget v6, Lr5/۟ۤۨۥۡ;->۠ۦۦۦ:I

    xor-int/lit8 v6, v6, 0x7

    const/16 v24, 0xbd9

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lb4/ۦۣۧ۟;->ۥۥۣۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f56a

    :goto_58
    const v6, 0x17f57b

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_54

    goto :goto_58

    :sswitch_f3
    if-nez v5, :cond_40

    const v4, 0x17f852

    goto :goto_58

    :cond_40
    :sswitch_f4
    const v4, 0x17f5a8

    goto :goto_58

    :sswitch_f5
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x460

    sget v6, Landroidx/preference/۟ۤۥۦۧ;->ۣۨۡۡ:I

    xor-int/lit8 v6, v6, 0x3a

    const/16 v24, 0x4df

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟۠ۡ۟([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f871

    :goto_59
    const v6, 0x17f882

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_55

    goto :goto_59

    :cond_41
    :sswitch_f6
    const v4, 0x17f8af

    goto :goto_59

    :sswitch_f7
    if-nez v5, :cond_41

    const v4, 0x17f8ce

    goto :goto_59

    :sswitch_f8
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x464

    sget v6, Li6/۟۟ۦۨۧ;->۠ۦۡۡ:I

    xor-int/lit16 v6, v6, 0xc9

    const/16 v24, 0x66b

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lx4/۟ۤۦۥ۟;->ۦۤۧۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f8ed

    :goto_5a
    const v6, 0x17f8fe

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_56

    goto :goto_5a

    :sswitch_f9
    if-nez v5, :cond_42

    const v4, 0x17f94a

    goto :goto_5a

    :cond_42
    :sswitch_fa
    const v4, 0x17f92b

    goto :goto_5a

    :sswitch_fb
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x469

    sget v6, Lq2/ۣ۟ۢۥ۠;->۟۟ۧۢۨ:I

    xor-int/lit16 v6, v6, 0x252

    const/16 v24, 0x276

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->۟ۤ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17f969

    :goto_5b
    const v6, 0x17f97a

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_57

    goto :goto_5b

    :sswitch_fc
    if-nez v5, :cond_43

    const v4, 0x17fc51

    goto :goto_5b

    :cond_43
    :sswitch_fd
    const v4, 0x17fc32

    goto :goto_5b

    :sswitch_fe
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x46e

    sget v6, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟۟ۦ:I

    xor-int/lit16 v6, v6, -0xf5

    const/16 v24, 0x5cb

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Ldagger/hilt/android/internal/ۣۧۨۨ;->۟ۦۧۢۨ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17fc70

    :goto_5c
    const v6, 0x17fc81

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_58

    goto :goto_5c

    :cond_44
    :sswitch_ff
    const v4, 0x17fcae

    goto :goto_5c

    :sswitch_100
    if-nez v5, :cond_44

    const v4, 0x17fccd

    goto :goto_5c

    :sswitch_101
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x472

    sget v6, Le2/۟۟ۥۦ;->۟ۢ۠ۨۥ:I

    xor-int/lit16 v6, v6, -0x2f2

    const/16 v24, 0xb95

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۠ۥۣ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17fcec

    :goto_5d
    const v6, 0x17fcfd

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_59

    goto :goto_5d

    :sswitch_102
    if-nez v5, :cond_45

    const v4, 0x17ffd4

    goto :goto_5d

    :cond_45
    :sswitch_103
    const v4, 0x17fd2a

    goto :goto_5d

    :sswitch_104
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x477

    sget v6, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۤۢۧۡ:I

    xor-int/lit16 v6, v6, 0xea

    const/16 v24, 0xa53

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lo5/۟ۧۡۧۦ;->۟ۤ۟ۢۢ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17fff3

    :goto_5e
    const v6, 0x180004

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5a

    goto :goto_5e

    :cond_46
    :sswitch_105
    const v4, 0x180031

    goto :goto_5e

    :sswitch_106
    if-nez v5, :cond_46

    const v4, 0x180050

    goto :goto_5e

    :sswitch_107
    move-object/from16 v0, v36

    invoke-static {v9, v0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->ۣۣۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x18006f

    :goto_5f
    const v6, 0x180080

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5b

    goto :goto_5f

    :cond_47
    :sswitch_108
    const v4, 0x1800ad

    goto :goto_5f

    :sswitch_109
    if-nez v5, :cond_47

    const v4, 0x1800cc

    goto :goto_5f

    :sswitch_10a
    move-object/from16 v0, v35

    invoke-static {v14, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x1800eb

    :goto_60
    const v6, 0x1800fc

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5c

    goto :goto_60

    :sswitch_10b
    if-nez v5, :cond_48

    const v4, 0x1803d3

    goto :goto_60

    :cond_48
    :sswitch_10c
    const v4, 0x1803b4

    goto :goto_60

    :sswitch_10d
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x47b

    sget v6, La/ۥۦۥۡ;->۟۠ۤۡۥ:I

    xor-int/lit16 v6, v6, -0x3d5

    const/16 v24, 0xad6

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->ۢۨۥۧ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x1803f2

    :goto_61
    const v6, 0x180403

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5d

    goto :goto_61

    :cond_49
    :sswitch_10e
    const v4, 0x180430

    goto :goto_61

    :sswitch_10f
    if-nez v5, :cond_49

    const v4, 0x18044f

    goto :goto_61

    :sswitch_110
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x480

    sget v6, Lc4/ۡ۟۠ۥ;->۟ۦۣ۟۟:I

    xor-int/lit16 v6, v6, -0xdf

    const/16 v24, 0xaac

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۥۣۨۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x18046e

    :goto_62
    const v6, 0x18047f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5e

    goto :goto_62

    :sswitch_111
    if-nez v5, :cond_4a

    const v4, 0x180756

    goto :goto_62

    :cond_4a
    :sswitch_112
    const v4, 0x1804ac

    goto :goto_62

    :sswitch_113
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x487

    sget v6, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۢۦۦ:I

    xor-int/lit8 v6, v6, -0x4e

    const/16 v24, 0x41c

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Ls7/۟ۢ۟ۤۧ;->۟ۧۦۧۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x180775

    :goto_63
    const v6, 0x180786

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_5f

    goto :goto_63

    :cond_4b
    :sswitch_114
    const v4, 0x1807b3

    goto :goto_63

    :sswitch_115
    if-nez v5, :cond_4b

    const v4, 0x1807d2

    goto :goto_63

    :sswitch_116
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x48f

    sget v6, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۥۤۦۨ:I

    xor-int/lit8 v6, v6, -0x2f

    const/16 v24, 0xa6b

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lo8/۟ۢۧۢۤ;->ۣۣۧ۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x1807f1

    :goto_64
    const v6, 0x180802

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_60

    goto :goto_64

    :cond_4c
    :sswitch_117
    const v4, 0x18082f

    goto :goto_64

    :sswitch_118
    if-nez v5, :cond_4c

    const v4, 0x18084e

    goto :goto_64

    :sswitch_119
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x497

    sget v6, Lcom/google/protobuf/ۧ۠۠ۥ;->۠ۧ۟ۨ:I

    xor-int/lit16 v6, v6, 0xd0

    const/16 v24, 0x97a

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣۣۨۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x18086d

    :goto_65
    const v6, 0x18087e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_61

    goto :goto_65

    :sswitch_11a
    if-nez v5, :cond_4d

    const v4, 0x180b55

    goto :goto_65

    :cond_4d
    :sswitch_11b
    const v4, 0x180b36

    goto :goto_65

    :sswitch_11c
    const/4 v4, 0x0

    move-object/from16 v0, v30

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x180b74

    :goto_66
    const v6, 0x180b85

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_62

    goto :goto_66

    :cond_4e
    :sswitch_11d
    const v4, 0x180bb2

    goto :goto_66

    :sswitch_11e
    if-nez v5, :cond_4e

    const v4, 0x180bd1

    goto :goto_66

    :sswitch_11f
    const/4 v4, 0x0

    move-object/from16 v0, v38

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x180bf0

    :goto_67
    const v6, 0x180c01

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_63

    goto :goto_67

    :cond_4f
    :sswitch_120
    const v4, 0x180c2e

    goto :goto_67

    :sswitch_121
    if-nez v5, :cond_4f

    const v4, 0x185dad

    goto :goto_67

    :sswitch_122
    const/4 v4, 0x0

    move-object/from16 v0, v37

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x185dcc

    :goto_68
    const v6, 0x185ddd

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_64

    goto :goto_68

    :sswitch_123
    if-nez v5, :cond_50

    const v4, 0x185e29

    goto :goto_68

    :cond_50
    :sswitch_124
    const v4, 0x185e0a

    goto :goto_68

    :sswitch_125
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4a5

    sget v6, Ls7/ۧۤۦۤ;->ۨۥ۟ۥ:I

    xor-int/lit16 v6, v6, 0x30b

    const/16 v24, 0xb20

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Ls7/ۧۤۦۤ;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x185e48

    :goto_69
    const v6, 0x185e59

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_65

    goto :goto_69

    :sswitch_126
    if-nez v5, :cond_51

    const v4, 0x185ea5

    goto :goto_69

    :cond_51
    :sswitch_127
    const v4, 0x185e86

    goto :goto_69

    :sswitch_128
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4ab

    sget v6, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۡۤ۠:I

    xor-int/lit16 v6, v6, -0x2e5

    const/16 v24, 0xa81

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۟ۨۧۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x185ec4

    :goto_6a
    const v6, 0x185ed5

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_66

    goto :goto_6a

    :sswitch_129
    if-nez v5, :cond_52

    const v4, 0x1861ac

    goto :goto_6a

    :cond_52
    :sswitch_12a
    const v4, 0x18618d

    goto :goto_6a

    :sswitch_12b
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4af

    sget v6, Lh6/ۧۧۤ۟;->۠۟ۤۨ:I

    xor-int/lit16 v6, v6, -0x19b

    const/16 v24, 0x9f6

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۠ۥۣ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x1861cb

    :goto_6b
    const v6, 0x1861dc

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_67

    goto :goto_6b

    :sswitch_12c
    if-nez v5, :cond_53

    const v4, 0x186228

    goto :goto_6b

    :cond_53
    :sswitch_12d
    const v4, 0x186209

    goto :goto_6b

    :sswitch_12e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4b2

    sget v6, Lr6/۟ۡ۠۟ۡ;->ۣۧۡ:I

    xor-int/lit16 v6, v6, -0x20b

    const/16 v24, 0x349

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۢۢ۟ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x186247

    :goto_6c
    const v6, 0x186258

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_68

    goto :goto_6c

    :sswitch_12f
    if-nez v5, :cond_54

    const v4, 0x18652f

    goto :goto_6c

    :cond_54
    :sswitch_130
    const v4, 0x186285

    goto :goto_6c

    :sswitch_131
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4b8

    sget v6, Lj2/۠ۤۨۤ;->ۣ۟۟۠ۦ:I

    xor-int/lit16 v6, v6, -0x3d3

    const/16 v24, 0x415

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lm7/ۡۢۦۢ;->ۥ۟ۨ۟([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x18654e

    :goto_6d
    const v6, 0x18655f

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_69

    goto :goto_6d

    :sswitch_132
    if-nez v5, :cond_55

    const v4, 0x1865ab

    goto :goto_6d

    :cond_55
    :sswitch_133
    const v4, 0x18658c

    goto :goto_6d

    :sswitch_134
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4bf

    sget v6, Lh7/ۣ۟ۤ۠۠;->ۦ۟ۡۨ:I

    xor-int/lit16 v6, v6, 0x2e5

    const/16 v24, 0xcc8

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lr2/ۧۧۢۢ;->ۥۥ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x1865ca

    :goto_6e
    const v6, 0x1865db

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6a

    goto :goto_6e

    :sswitch_135
    if-nez v5, :cond_56

    const v4, 0x186627

    goto :goto_6e

    :cond_56
    :sswitch_136
    const v4, 0x186608

    goto :goto_6e

    :sswitch_137
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4c8

    sget v6, Lt2/۟ۦۣۡۤ;->۟ۡۥۢ۟:I

    xor-int/lit16 v6, v6, -0x11c

    const/16 v24, 0x38c

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lg2/۟۠ۡۡۦ;->ۡۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x186646

    :goto_6f
    const v6, 0x186657

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6b

    goto :goto_6f

    :sswitch_138
    if-nez v5, :cond_57

    const v4, 0x18692e

    goto :goto_6f

    :cond_57
    :sswitch_139
    const v4, 0x18690f

    goto :goto_6f

    :sswitch_13a
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4cd

    sget v6, Lm1/۟ۧۥ۟ۨ;->۟ۤۢۤۧ:I

    xor-int/lit16 v6, v6, -0x2c8

    const/16 v24, 0x7ee

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Ll0/ۡۦۦۡ;->۠۟ۦۥ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x18694d

    :goto_70
    const v6, 0x18695e

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6c

    goto :goto_70

    :sswitch_13b
    if-nez v5, :cond_58

    const v4, 0x1869aa

    goto :goto_70

    :cond_58
    :sswitch_13c
    const v4, 0x18698b

    goto :goto_70

    :sswitch_13d
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4d5

    sget v6, Lg/۟ۧ۠ۤ;->ۦۥۡۦ:I

    xor-int/lit16 v6, v6, 0x3df

    const/16 v24, 0xb90

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Ll8/ۣ۟ۧۢ۠;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x1869c9    # 2.242E-39f

    :goto_71
    const v6, 0x1869da

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6d

    goto :goto_71

    :sswitch_13e
    if-nez v5, :cond_59

    const v4, 0x186cb1

    goto :goto_71

    :cond_59
    :sswitch_13f
    const v4, 0x186a07

    goto :goto_71

    :sswitch_140
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4dc

    sget v6, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->۟ۦۡ۠ۧ:I

    xor-int/lit16 v6, v6, -0xd3

    const/16 v24, 0x250

    move/from16 v0, v24

    invoke-static {v4, v5, v6, v0}, Lv0/ۣۣۡۢ;->ۣۦ۟ۧ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v9, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x186cd0

    :goto_72
    const v6, 0x186ce1

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6e

    goto :goto_72

    :cond_5a
    :sswitch_141
    const v4, 0x186d0e

    goto :goto_72

    :sswitch_142
    if-nez v5, :cond_5a

    const v4, 0x186d2d

    goto :goto_72

    :sswitch_143
    const/4 v4, 0x0

    move-object/from16 v0, v32

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x186d4c

    :goto_73
    const v6, 0x186d5d

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_6f

    goto :goto_73

    :sswitch_144
    if-nez v5, :cond_5b

    const v4, 0x186da9

    goto :goto_73

    :cond_5b
    :sswitch_145
    const v4, 0x186d8a

    goto :goto_73

    :sswitch_146
    const/4 v4, 0x0

    move-object/from16 v0, v39

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x186dc8

    :goto_74
    const v6, 0x186dd9

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_70

    goto :goto_74

    :sswitch_147
    if-nez v5, :cond_5c

    const v4, 0x1870b0

    goto :goto_74

    :cond_5c
    :sswitch_148
    const v4, 0x187091

    goto :goto_74

    :sswitch_149
    const/4 v4, 0x0

    move-object/from16 v0, v33

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x1870cf

    :goto_75
    const v6, 0x1870e0

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_71

    goto :goto_75

    :cond_5d
    :sswitch_14a
    const v4, 0x18710d

    goto :goto_75

    :sswitch_14b
    if-nez v5, :cond_5d

    const v4, 0x18712c

    goto :goto_75

    :sswitch_14c
    const/4 v4, 0x0

    move-object/from16 v0, v34

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x18714b

    :goto_76
    const v6, 0x18715c

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_72

    goto :goto_76

    :sswitch_14d
    if-nez v5, :cond_5e

    const v4, 0x187433

    goto :goto_76

    :cond_5e
    :sswitch_14e
    const v4, 0x187189

    goto :goto_76

    :sswitch_14f
    const/4 v4, 0x0

    move-object/from16 v0, v29

    invoke-static {v9, v0, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x187452

    :goto_77
    const v6, 0x187463

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_73

    goto :goto_77

    :cond_5f
    :sswitch_150
    const v4, 0x187490

    goto :goto_77

    :sswitch_151
    if-nez v5, :cond_5f

    const v4, 0x1874af

    goto :goto_77

    :sswitch_152
    new-instance v4, Lq8/f;

    invoke-static {v15}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v4, v14, v5}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v28

    invoke-static {v0, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0x1874ce

    :goto_78
    const v5, 0x1874df

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_74

    goto :goto_78

    :sswitch_153
    const v4, 0x1874ed

    goto :goto_78

    :sswitch_154
    move-object v4, v7

    move-object v5, v8

    move v6, v10

    move v9, v11

    move-wide/from16 v14, v18

    :goto_79
    const v7, 0x18754a

    :goto_7a
    const v8, 0x18755b

    xor-int/2addr v7, v8

    sparse-switch v7, :sswitch_data_75

    goto :goto_7a

    :sswitch_155
    const v7, 0x1877f4

    goto :goto_7a

    :sswitch_156
    move-object v7, v4

    move-object v8, v5

    move v10, v6

    move v11, v9

    move-wide/from16 v18, v14

    goto/16 :goto_0

    :sswitch_157
    const v4, 0x187851

    :goto_7b
    const v5, 0x187862

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_76

    goto :goto_7b

    :sswitch_158
    move-object v4, v7

    move-object v5, v8

    move v6, v10

    move v9, v11

    move-wide/from16 v14, v18

    goto :goto_79

    :sswitch_159
    const v4, 0x187870

    goto :goto_7b

    :sswitch_15a
    const v4, 0x1878cd

    :goto_7c
    const v5, 0x1878de

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_77

    goto :goto_7c

    :sswitch_15b
    const v4, 0x1878ec

    goto :goto_7c

    :sswitch_15c
    const v4, 0x187bd4

    :goto_7d
    const v5, 0x187be5

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_78

    goto :goto_7d

    :cond_60
    :sswitch_15d
    const v4, 0x187c12

    goto :goto_7d

    :sswitch_15e
    if-nez v8, :cond_60

    const v4, 0x187c31

    goto :goto_7d

    :sswitch_15f
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x4e0

    sget v6, Lf0/ۣۦۦ۠;->۟ۤۡۡ۟:I

    xor-int/lit16 v6, v6, -0x328

    const/16 v9, 0x343

    invoke-static {v4, v5, v6, v9}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->۠ۧۤۢ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x4e6

    sget v9, Lq1/۠۠ۤ;->ۣۣ۟ۡۤ:I

    xor-int/lit8 v9, v9, -0x34

    const/16 v15, 0x287

    invoke-static {v5, v6, v9, v15}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۣۡۤۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v6

    const/16 v9, 0x4ec

    sget v15, Lfa/ۢۤۢ۟;->ۢ۠۟ۧ:I

    xor-int/lit8 v15, v15, -0x74

    const/16 v17, 0xb1d

    move/from16 v0, v17

    invoke-static {v6, v9, v15, v0}, La7/۠ۢۧ;->ۦۣۧۢ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v9

    const/16 v15, 0x4f2

    sget v17, Lr/۠ۡ۠;->۟ۢۨۦ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x246

    move/from16 v17, v0

    const/16 v26, 0x4bc

    move/from16 v0, v17

    move/from16 v1, v26

    invoke-static {v9, v15, v0, v1}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۣ۟۟ۧ۠([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v15

    const/16 v17, 0x4f9

    sget v26, Lh/ۥۦۡۧ;->ۤۢۨۨ:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x8e

    move/from16 v26, v0

    const/16 v27, 0x155

    move/from16 v0, v17

    move/from16 v1, v26

    move/from16 v2, v27

    invoke-static {v15, v0, v1, v2}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۣ۟۠([SIII)Ljava/lang/String;

    move-result-object v15

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v17

    const/16 v26, 0x500

    sget v27, Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x321

    move/from16 v27, v0

    const/16 v32, 0xcaf

    move-object/from16 v0, v17

    move/from16 v1, v26

    move/from16 v2, v27

    move/from16 v3, v32

    invoke-static {v0, v1, v2, v3}, Ls6/۟ۡ۟ۧۢ;->۟ۢۡۡ۠([SIII)Ljava/lang/String;

    move-result-object v17

    const/16 v26, 0x6

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v26, v0

    sget v27, Lw1/ۦۣۦۧ;->۟ۥۣ۠۟:I

    move/from16 v0, v27

    xor-int/lit16 v0, v0, 0x230

    move/from16 v27, v0

    aput-object v4, v26, v27

    sget v4, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۢۡۤ:I

    xor-int/lit16 v4, v4, 0x137

    aput-object v5, v26, v4

    sget v4, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->ۧۤۨۦ:I

    xor-int/lit8 v4, v4, -0x19

    aput-object v6, v26, v4

    sget v4, Ll8/ۣ۟ۧۢ۠;->ۨۨۧ۠:I

    xor-int/lit16 v4, v4, 0x2b1

    aput-object v9, v26, v4

    sget v4, Lw5/ۣۨۧ۠;->۟۠ۢ۠۟:I

    xor-int/lit16 v4, v4, 0x127

    aput-object v15, v26, v4

    sget v4, Ld1/۟ۡۨۧۢ;->۟ۢۢۦۤ:I

    xor-int/lit16 v4, v4, 0xed

    aput-object v17, v26, v4

    invoke-static/range {v26 .. v26}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v9

    move-object v15, v7

    :goto_7e
    invoke-static {v9}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x187c50

    :goto_7f
    const v6, 0x187c61

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_79

    goto :goto_7f

    :cond_61
    :sswitch_160
    const v4, 0x187c8e

    goto :goto_7f

    :sswitch_161
    if-eqz v5, :cond_61

    const v4, 0x187cad

    goto :goto_7f

    :sswitch_162
    invoke-static {v9}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    :try_start_0
    move-object/from16 v0, p1

    invoke-static {v0, v5}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۦۢ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const v4, 0x187ccc

    :goto_80
    const v7, 0x187cdd

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_7a

    goto :goto_80

    :sswitch_163
    if-eqz v6, :cond_62

    const v4, 0x187fb4

    goto :goto_80

    :cond_62
    :sswitch_164
    const v4, 0x187f95

    goto :goto_80

    :sswitch_165
    move-object v0, v6

    check-cast v0, Ljava/util/Collection;

    move-object v4, v0

    invoke-static {v4}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0x187fd3

    :goto_81
    const v17, 0x187fe4

    xor-int v4, v4, v17

    sparse-switch v4, :sswitch_data_7b

    goto :goto_81

    :cond_63
    :sswitch_166
    const v4, 0x188011    # 2.249993E-39f

    goto :goto_81

    :sswitch_167
    xor-int/lit8 v4, v7, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v17, v7, -0x2

    or-int v4, v4, v17

    if-eqz v4, :cond_63

    const v4, 0x188030

    goto :goto_81

    :sswitch_168
    invoke-static {v6}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8

    move-result-object v17

    move-object v7, v8

    :sswitch_169
    :try_start_1
    invoke-static/range {v17 .. v17}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v6

    const v4, 0x18804f

    :goto_82
    const v8, 0x188060

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_7c

    goto :goto_82

    :cond_64
    :sswitch_16a
    const v4, 0x18808d

    goto :goto_82

    :sswitch_16b
    if-eqz v6, :cond_64

    const v4, 0x18d20c

    goto :goto_82

    :sswitch_16c
    invoke-static/range {v17 .. v17}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_5

    move-result-object v4

    :try_start_2
    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v8

    const v6, 0x18d22b

    :goto_83
    const v26, 0x18d23c

    xor-int v6, v6, v26

    sparse-switch v6, :sswitch_data_7d

    goto :goto_83

    :sswitch_16d
    if-eqz v8, :cond_65

    const v6, 0x18d288

    goto :goto_83

    :cond_65
    :sswitch_16e
    const v6, 0x18d269

    goto :goto_83

    :sswitch_16f
    :try_start_3
    invoke-static {v8}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v8

    const v6, 0x18d2a7

    :goto_84
    const v26, 0x18d2b8

    xor-int v6, v6, v26

    sparse-switch v6, :sswitch_data_7e

    goto :goto_84

    :sswitch_170
    if-eqz v8, :cond_66

    const v6, 0x18d304

    goto :goto_84

    :cond_66
    :sswitch_171
    const v6, 0x18d2e5

    goto :goto_84

    :sswitch_172
    :try_start_4
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v6

    move-object/from16 v0, v25

    invoke-static {v6, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v6}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, v24

    invoke-static {v6, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_85
    const v8, 0x18d323

    :goto_86
    const v26, 0x18d334

    xor-int v8, v8, v26

    sparse-switch v8, :sswitch_data_7f

    goto :goto_86

    :sswitch_173
    const v8, 0x18d5cd

    goto :goto_86

    :catch_0
    move-exception v4

    const v4, 0x18d62a

    :goto_87
    const v5, 0x18d63b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_80

    goto :goto_87

    :sswitch_174
    const v4, 0x18d649

    goto :goto_87

    :sswitch_175
    move-object v6, v15

    :goto_88
    const v4, 0x18ed2c

    :goto_89
    const v5, 0x18ed3d

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_81

    goto :goto_89

    :sswitch_176
    if-eqz v7, :cond_6b

    const v4, 0x18f014

    goto :goto_89

    :sswitch_177
    const v6, 0x18d6a6

    :goto_8a
    const v8, 0x18d6b7

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_82

    goto :goto_8a

    :sswitch_178
    const v6, 0x18d6c5

    goto :goto_8a

    :catch_1
    move-exception v4

    const v4, 0x18d9ad

    :goto_8b
    const v5, 0x18d9be

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_83

    goto :goto_8b

    :sswitch_179
    const v4, 0x18d9cc

    goto :goto_8b

    :sswitch_17a
    move-object v6, v15

    goto :goto_88

    :sswitch_17b
    const v6, 0x18da29

    :goto_8c
    const v8, 0x18da3a

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_84

    goto :goto_8c

    :sswitch_17c
    const v6, 0x18da48

    goto :goto_8c

    :sswitch_17d
    move-object v6, v14

    goto :goto_85

    :sswitch_17e
    const/4 v8, 0x0

    move-object/from16 v0, v31

    invoke-static {v6, v0, v8}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v26

    const v8, 0x18daa5

    :goto_8d
    const v27, 0x18dab6

    xor-int v8, v8, v27

    sparse-switch v8, :sswitch_data_85

    goto :goto_8d

    :sswitch_17f
    if-nez v26, :cond_67

    const v8, 0x18dd8d

    goto :goto_8d

    :cond_67
    :sswitch_180
    const v8, 0x18dd6e

    goto :goto_8d

    :sswitch_181
    const/4 v8, 0x0

    move-object/from16 v0, v30

    invoke-static {v6, v0, v8}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v26

    const v8, 0x18ddac

    :goto_8e
    const v27, 0x18ddbd

    xor-int v8, v8, v27

    sparse-switch v8, :sswitch_data_86

    goto :goto_8e

    :sswitch_182
    if-nez v26, :cond_68

    const v8, 0x18de09

    goto :goto_8e

    :cond_68
    :sswitch_183
    const v8, 0x18ddea

    goto :goto_8e

    :sswitch_184
    const/4 v8, 0x0

    move-object/from16 v0, v29

    invoke-static {v6, v0, v8}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result v8

    const v6, 0x18de28

    :goto_8f
    const v26, 0x18de39

    xor-int v6, v6, v26

    sparse-switch v6, :sswitch_data_87

    goto :goto_8f

    :sswitch_185
    if-eqz v8, :cond_69

    const v6, 0x18e110

    goto :goto_8f

    :cond_69
    :sswitch_186
    const v6, 0x18de66

    goto :goto_8f

    :sswitch_187
    const v6, 0x18e12f

    :goto_90
    const v8, 0x18e140

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_88

    goto :goto_90

    :sswitch_188
    :try_start_5
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move-result-object v7

    const v6, 0x18e227

    :goto_91
    const v8, 0x18e238

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_89

    goto :goto_91

    :sswitch_189
    if-nez v7, :cond_6a

    const v6, 0x18e50f

    goto :goto_91

    :sswitch_18a
    const v6, 0x18e14e

    goto :goto_90

    :sswitch_18b
    const v4, 0x18e1ab

    :goto_92
    const v6, 0x18e1bc

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_8a

    goto :goto_92

    :sswitch_18c
    const v4, 0x18e1ca

    goto :goto_92

    :cond_6a
    :sswitch_18d
    const v6, 0x18e4f0

    goto :goto_91

    :sswitch_18e
    move-object v7, v4

    :sswitch_18f
    :try_start_6
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v6

    const/16 v8, 0x50c

    sget v15, Ls8/ۣۡۡ۠;->ۣ۟ۧۧ۟:I

    xor-int/lit16 v15, v15, 0x211

    const/16 v17, 0x3f1

    move/from16 v0, v17

    invoke-static {v6, v8, v15, v0}, Lp4/ۣ۟۟ۢۥ;->ۦۣۨۤ([SIII)Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :try_start_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    :try_start_8
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v8

    const/16 v15, 0x518

    sget v17, Lr5/۟ۤۨۥۡ;->۠ۦۦۦ:I

    xor-int/lit8 v17, v17, 0x27

    const/16 v26, 0xb01

    move/from16 v0, v17

    move/from16 v1, v26

    invoke-static {v8, v15, v0, v1}, Lh3/ۣ۠ۡۨ;->۟۟ۥۤۥ([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v8, 0x53d

    sget v15, Lf0/ۣۤ۠۟;->۟ۧۦۥ:I

    xor-int/lit16 v15, v15, 0x14e

    const/16 v17, 0x305

    move/from16 v0, v17

    invoke-static {v5, v8, v15, v0}, Lc0/ۦۢۦۥ;->۟۟ۨۨۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    :sswitch_190
    const v5, 0x18e52e

    :goto_93
    const v6, 0x18e53f

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_8b

    goto :goto_93

    :sswitch_191
    const v5, 0x18e54d

    goto :goto_93

    :sswitch_192
    move-object v6, v4

    goto/16 :goto_88

    :sswitch_193
    const v5, 0x18e5aa

    :goto_94
    const v6, 0x18e5bb

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_8c

    goto :goto_94

    :sswitch_194
    const v5, 0x18e5c9

    goto :goto_94

    :catch_2
    move-exception v5

    const v5, 0x18e8b1

    :goto_95
    const v6, 0x18e8c2

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_8d

    goto :goto_95

    :sswitch_195
    const v5, 0x18e8d0

    goto :goto_95

    :catch_3
    move-exception v5

    const v5, 0x18e92d

    :goto_96
    const v6, 0x18e93e

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_8e

    goto :goto_96

    :sswitch_196
    const v5, 0x18e94c

    goto :goto_96

    :sswitch_197
    move-object v6, v4

    goto/16 :goto_88

    :catch_4
    move-exception v4

    move-object v4, v9

    move-object v5, v7

    :sswitch_198
    const v6, 0x18e9a9

    :goto_97
    const v7, 0x18e9ba

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_8f

    goto :goto_97

    :sswitch_199
    const v6, 0x18ec53

    goto :goto_97

    :sswitch_19a
    move-object v6, v15

    move-object v9, v4

    move-object v7, v5

    goto/16 :goto_88

    :catch_5
    move-exception v4

    move-object v4, v9

    move-object v5, v7

    :goto_98
    const v6, 0x18ecb0

    :goto_99
    const v7, 0x18ecc1

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_90

    goto :goto_99

    :sswitch_19b
    const v6, 0x18eccf

    goto :goto_99

    :sswitch_19c
    move-object v7, v8

    :sswitch_19d
    move-object v6, v15

    goto/16 :goto_88

    :cond_6b
    :sswitch_19e
    const v4, 0x18ed6a

    goto/16 :goto_89

    :sswitch_19f
    const v4, 0x18f033

    :goto_9a
    const v5, 0x18f044

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_91

    goto :goto_9a

    :sswitch_1a0
    move-object v15, v6

    move-object v8, v7

    :goto_9b
    :sswitch_1a1
    const v4, 0x18f432

    :goto_9c
    const v5, 0x18f443

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_92

    goto :goto_9c

    :cond_6c
    :sswitch_1a2
    const v4, 0x18f470

    goto :goto_9c

    :sswitch_1a3
    const v4, 0x18f052

    goto :goto_9a

    :sswitch_1a4
    const v4, 0x18f0af

    :goto_9d
    const v5, 0x18f0c0

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_93

    goto :goto_9d

    :sswitch_1a5
    move-object v15, v6

    move-object v8, v7

    goto/16 :goto_7e

    :sswitch_1a6
    const v4, 0x18f0ce

    goto :goto_9d

    :sswitch_1a7
    const v4, 0x18f12b

    :goto_9e
    const v5, 0x18f13c

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_94

    goto :goto_9e

    :sswitch_1a8
    const v4, 0x18f3d5

    goto :goto_9e

    :sswitch_1a9
    if-nez v8, :cond_6c

    const v4, 0x18f48f

    goto :goto_9c

    :sswitch_1aa
    invoke-static {}, La2/۟ۡۥۦ۟;->۟ۤۨ۟۟()I

    move-result v5

    const v4, 0x18f4ae

    :goto_9f
    const v6, 0x18f4bf

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_95

    goto :goto_9f

    :sswitch_1ab
    if-ltz v5, :cond_6d

    const v4, 0x19466b

    goto :goto_9f

    :cond_6d
    :sswitch_1ac
    const v4, 0x18f4ec

    goto :goto_9f

    :sswitch_1ad
    const-string v4, "PHhbigRlKWrqIXbr0XLZLIDzqXXIw"

    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣۧۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v4

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_a0
    :sswitch_1ae
    return-void

    :sswitch_1af
    const v4, 0x19468a

    :goto_a1
    const v5, 0x19469b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_96

    goto :goto_a1

    :sswitch_1b0
    const-wide/16 v4, 0x0

    cmpl-double v4, v20, v4

    if-lez v4, :cond_6e

    const v4, 0x1946e7

    goto :goto_a1

    :cond_6e
    :sswitch_1b1
    const v4, 0x1946c8

    goto :goto_a1

    :sswitch_1b2
    move-wide/from16 v0, v20

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaFare:D

    move-wide/from16 v0, v22

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaTip:D

    move-object/from16 v0, p0

    iput-wide v12, v0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaPickupDist:D

    move-wide/from16 v0, v18

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaDropDist:D

    invoke-static/range {v28 .. v28}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    const v4, 0x194706

    :goto_a2
    const v6, 0x194717

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_97

    goto :goto_a2

    :sswitch_1b3
    const/4 v4, 0x1

    if-le v5, v4, :cond_6f

    const v4, 0x194763

    goto :goto_a2

    :cond_6f
    :sswitch_1b4
    const v4, 0x194744

    goto :goto_a2

    :sswitch_1b5
    invoke-static/range {v28 .. v28}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    const v4, 0x194782

    :goto_a3
    const v6, 0x194793

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_98

    goto :goto_a3

    :sswitch_1b6
    const/4 v4, 0x1

    if-le v5, v4, :cond_70

    const v4, 0x194a6a

    goto :goto_a3

    :cond_70
    :sswitch_1b7
    const v4, 0x194a4b

    goto :goto_a3

    :sswitch_1b8
    new-instance v4, Lt1/p;

    sget v5, Ls7/۟ۢ۟ۤۧ;->۟ۦۤۥۥ:I

    xor-int/lit16 v5, v5, -0x196

    invoke-direct {v4, v5}, Lt1/p;-><init>(I)V

    move-object/from16 v0, v28

    invoke-static {v0, v4}, Lr5/۟ۤۨۥۡ;->۠۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1b9
    const v4, 0x194a89

    :goto_a4
    const v5, 0x194a9a

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_99

    goto :goto_a4

    :sswitch_1ba
    const/4 v4, -0x1

    if-eq v11, v4, :cond_71

    const v4, 0x194ae6

    goto :goto_a4

    :cond_71
    :sswitch_1bb
    const v4, 0x194ac7

    goto :goto_a4

    :sswitch_1bc
    const v4, 0x194b05

    :goto_a5
    const v5, 0x194b16

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_9a

    goto :goto_a5

    :sswitch_1bd
    const/4 v4, -0x1

    if-eq v10, v4, :cond_72

    const v4, 0x194ded

    goto :goto_a5

    :cond_72
    :sswitch_1be
    const v4, 0x194b43

    goto :goto_a5

    :sswitch_1bf
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {v28 .. v28}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    :sswitch_1c0
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v6

    const v5, 0x194e0c

    :goto_a6
    const v7, 0x194e1d

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_9b

    goto :goto_a6

    :sswitch_1c1
    if-eqz v6, :cond_73

    const v5, 0x194e69

    goto :goto_a6

    :cond_73
    :sswitch_1c2
    const v5, 0x194e4a

    goto :goto_a6

    :sswitch_1c3
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v6, v7

    check-cast v6, Lq8/f;

    invoke-static {v6}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/lit8 v5, v5, 0xb

    sub-int/2addr v5, v11

    add-int/lit8 v5, v5, -0xb

    invoke-static {v5}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v9

    invoke-static {v6}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/lit8 v5, v5, 0xf

    sub-int/2addr v5, v10

    add-int/lit8 v5, v5, -0xf

    invoke-static {v5}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v6

    const v5, 0x194e88

    :goto_a7
    const v17, 0x194e99

    xor-int v5, v5, v17

    sparse-switch v5, :sswitch_data_9c

    goto :goto_a7

    :sswitch_1c4
    if-ge v9, v6, :cond_74

    const v5, 0x194ee5

    goto :goto_a7

    :cond_74
    :sswitch_1c5
    const v5, 0x194ec6

    goto :goto_a7

    :sswitch_1c6
    invoke-static {v4, v7}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_1c7
    const v5, 0x194f04

    :goto_a8
    const v6, 0x194f15

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_9d

    goto :goto_a8

    :sswitch_1c8
    const v5, 0x1951ae

    goto :goto_a8

    :sswitch_1c9
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x53f

    const/4 v7, 0x1

    const/16 v8, 0x415

    invoke-static {v5, v6, v7, v8}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۧ۟ۢۡ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {}, Lcom/google/android/gms/common/ۦۢۨ;->ۧۡ۠ۨ()Lb5/l;

    move-result-object v8

    sget v9, Lc1/ۢۥۥ۟;->ۣ۠ۡ۟:I

    xor-int/lit16 v9, v9, 0x32a

    invoke-static/range {v4 .. v9}, Lw9/۟۠۠ۢ۟;->ۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lz7/۠ۡ۟ۦ;->۟ۧۤۡۧ:I

    xor-int/lit16 v5, v5, 0x34e

    invoke-static {v5, v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۢۨۤۢ(ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {v28 .. v28}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    :sswitch_1ca
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v6

    const v5, 0x19520b

    :goto_a9
    const v7, 0x19521c

    xor-int/2addr v5, v7

    sparse-switch v5, :sswitch_data_9e

    goto :goto_a9

    :sswitch_1cb
    if-eqz v6, :cond_75

    const v5, 0x195268

    goto :goto_a9

    :cond_75
    :sswitch_1cc
    const v5, 0x195249

    goto :goto_a9

    :sswitch_1cd
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v6, v7

    check-cast v6, Lq8/f;

    invoke-static {v6}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/lit8 v5, v5, -0xc

    sub-int/2addr v5, v10

    add-int/lit8 v5, v5, 0xc

    invoke-static {v5}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v9

    invoke-static {v6}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/lit8 v5, v5, -0x1b

    sub-int/2addr v5, v11

    add-int/lit8 v5, v5, 0x1b

    invoke-static {v5}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v6

    const v5, 0x195287

    :goto_aa
    const v24, 0x195298

    xor-int v5, v5, v24

    sparse-switch v5, :sswitch_data_9f

    goto :goto_aa

    :sswitch_1ce
    if-gt v9, v6, :cond_76

    const v5, 0x19556f

    goto :goto_aa

    :cond_76
    :sswitch_1cf
    const v5, 0x1952c5

    goto :goto_aa

    :sswitch_1d0
    invoke-static {v4, v7}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_1d1
    const v5, 0x19558e

    :goto_ab
    const v6, 0x19559f

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_a0

    goto :goto_ab

    :sswitch_1d2
    const v5, 0x1955ad

    goto :goto_ab

    :sswitch_1d3
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x540

    const/4 v7, 0x1

    const/16 v8, 0xcbf

    invoke-static {v5, v6, v7, v8}, Lc0/ۦ۠۟ۥ;->ۣ۟ۥۨۥ([SIII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۦۥۧۢ()Lb5/l;

    move-result-object v8

    sget v9, Lv0/ۣ۟۟ۤۧ;->ۦ۟ۦۦ:I

    xor-int/lit16 v9, v9, -0x370

    invoke-static/range {v4 .. v9}, Lw9/۟۠۠ۢ۟;->ۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lh0/۟ۥ۟ۡۦ;->ۢ۟۠ۥ:I

    xor-int/lit16 v5, v5, 0x219

    invoke-static {v5, v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۢۨۤۢ(ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v4, 0x19560a

    :goto_ac
    const v6, 0x19561b

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_a1

    goto :goto_ac

    :sswitch_1d4
    const v4, 0x195629

    goto :goto_ac

    :sswitch_1d5
    move-object/from16 v6, v17

    :goto_ad
    invoke-static {v6}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    const v4, 0x195d10

    :goto_ae
    const v8, 0x195d21

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_a2

    goto :goto_ae

    :cond_77
    :sswitch_1d6
    const v4, 0x195d4e

    goto :goto_ae

    :sswitch_1d7
    const v4, 0x195686

    :goto_af
    const v5, 0x195697

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_a3

    goto :goto_af

    :sswitch_1d8
    const v4, 0x195930

    goto :goto_af

    :sswitch_1d9
    invoke-static/range {v28 .. v28}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    sget v4, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۦۣۤۤ:I

    xor-int/lit16 v6, v4, 0x9b

    const v4, 0x19598d

    :goto_b0
    const v7, 0x19599e

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a4

    goto :goto_b0

    :sswitch_1da
    if-lt v5, v6, :cond_78

    const v4, 0x1959ea

    goto :goto_b0

    :cond_78
    :sswitch_1db
    const v4, 0x1959cb

    goto :goto_b0

    :sswitch_1dc
    move-object/from16 v0, v28

    invoke-static {v0, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۡۥۣ۟(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    invoke-static {v4}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static/range {v28 .. v28}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟۠۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq8/f;

    invoke-static {v5}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const v6, 0x195a09

    :goto_b1
    const v7, 0x195a1a

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_a5

    goto :goto_b1

    :sswitch_1dd
    const v6, 0x195a28

    goto :goto_b1

    :sswitch_1de
    move-object v6, v4

    goto :goto_ad

    :sswitch_1df
    move-object v5, v14

    move-object v6, v14

    goto :goto_ad

    :sswitch_1e0
    if-nez v7, :cond_77

    const v4, 0x195d6d

    goto :goto_ae

    :sswitch_1e1
    invoke-static {v5}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    const v4, 0x195d8c

    :goto_b2
    const v8, 0x195d9d

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_a6

    goto :goto_b2

    :sswitch_1e2
    if-nez v7, :cond_79

    const v4, 0x195de9

    goto :goto_b2

    :cond_79
    :sswitch_1e3
    const v4, 0x195dca

    goto :goto_b2

    :sswitch_1e4
    invoke-static/range {v28 .. v28}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v7

    const v4, 0x195e08

    :goto_b3
    const v8, 0x195e19

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_a7

    goto :goto_b3

    :sswitch_1e5
    xor-int/lit8 v4, v7, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v8, v7, -0x2

    or-int/2addr v4, v8

    if-eqz v4, :cond_7a

    const v4, 0x1960f0

    goto :goto_b3

    :cond_7a
    :sswitch_1e6
    const v4, 0x1960d1

    goto :goto_b3

    :sswitch_1e7
    const v4, 0x19610f

    :goto_b4
    const v7, 0x196120

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a8

    goto :goto_b4

    :cond_7b
    :sswitch_1e8
    const v4, 0x19614d

    goto :goto_b4

    :sswitch_1e9
    const/4 v4, -0x1

    if-eq v11, v4, :cond_7b

    const v4, 0x19616c

    goto :goto_b4

    :sswitch_1ea
    const v4, 0x19618b

    :goto_b5
    const v7, 0x19619c

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_a9

    goto :goto_b5

    :sswitch_1eb
    const/4 v4, -0x1

    if-eq v10, v4, :cond_7c

    const v4, 0x196473

    goto :goto_b5

    :cond_7c
    :sswitch_1ec
    const v4, 0x1961c9

    goto :goto_b5

    :sswitch_1ed
    invoke-static/range {v28 .. v28}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    move-object v7, v5

    :goto_b6
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x196492

    :goto_b7
    const v9, 0x1964a3

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_aa

    goto :goto_b7

    :cond_7d
    :sswitch_1ee
    const v4, 0x1964d0

    goto :goto_b7

    :sswitch_1ef
    if-eqz v5, :cond_7d

    const v4, 0x1964ef

    goto :goto_b7

    :sswitch_1f0
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    invoke-static {v4}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/lit8 v5, v5, -0x10

    sub-int/2addr v5, v11

    add-int/lit8 v5, v5, 0x10

    invoke-static {v5}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v9

    invoke-static {v4}, Lfa/ۢۤۢ۟;->ۣ۟ۤ۟ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-static {v5}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/lit8 v5, v5, -0x1e

    sub-int/2addr v5, v10

    add-int/lit8 v5, v5, 0x1e

    invoke-static {v5}, Lh3/۟ۡۥ۠۠;->۟ۤۨ۟ۡ(I)I

    move-result v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v17

    const/16 v24, 0x541

    const/16 v25, 0x1

    const/16 v26, 0xc41

    move-object/from16 v0, v17

    move/from16 v1, v24

    move/from16 v2, v25

    move/from16 v3, v26

    invoke-static {v0, v1, v2, v3}, Lg5/ۣۡۦۣ;->ۣ۟ۢ۟([SIII)Ljava/lang/String;

    move-result-object v17

    invoke-static {v4}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v24

    const v4, 0x19650e

    :goto_b8
    const v25, 0x19651f

    xor-int v4, v4, v25

    sparse-switch v4, :sswitch_data_ab

    goto :goto_b8

    :sswitch_1f1
    if-ge v9, v5, :cond_7e

    const v4, 0x19656b

    goto :goto_b8

    :cond_7e
    :sswitch_1f2
    const v4, 0x19654c

    goto :goto_b8

    :sswitch_1f3
    const v4, 0x19658a

    :goto_b9
    const v25, 0x19659b

    xor-int v4, v4, v25

    sparse-switch v4, :sswitch_data_ac

    goto :goto_b9

    :sswitch_1f4
    const/16 v4, 0xc8

    if-ge v9, v4, :cond_7f

    const v4, 0x196872

    goto :goto_b9

    :cond_7f
    :sswitch_1f5
    const v4, 0x196853

    goto :goto_b9

    :sswitch_1f6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v6}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v17

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v24

    invoke-static {v4, v0}, Ld1/ۣۣ۟ۢۨ;->۟ۤۤۧۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object v5, v7

    :goto_ba
    const v6, 0x196891

    :goto_bb
    const v7, 0x1968a2

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_ad

    goto :goto_bb

    :sswitch_1f7
    move-object v7, v5

    move-object v6, v4

    goto/16 :goto_b6

    :sswitch_1f8
    const v6, 0x1968b0

    goto :goto_bb

    :sswitch_1f9
    const v4, 0x19690d

    :goto_bc
    const v9, 0x19691e

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_ae

    goto :goto_bc

    :sswitch_1fa
    const/16 v4, 0xc8

    if-ge v5, v4, :cond_80

    const v4, 0x19baca

    goto :goto_bc

    :cond_80
    :sswitch_1fb
    const v4, 0x19694b

    goto :goto_bc

    :sswitch_1fc
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v7}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v17

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v24

    invoke-static {v4, v0}, Ld1/ۣۣ۟ۢۨ;->۟ۤۤۧۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v4, 0x19bae9

    :goto_bd
    const v7, 0x19bafa

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_af

    goto :goto_bd

    :sswitch_1fd
    const v4, 0x19bb08

    goto :goto_bd

    :sswitch_1fe
    move-object v4, v6

    goto :goto_ba

    :sswitch_1ff
    move-object v5, v7

    :sswitch_200
    const v4, 0x19bb65

    :goto_be
    const v7, 0x19bb76

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_b0

    goto :goto_be

    :sswitch_201
    const v4, 0x19bb84

    goto :goto_be

    :sswitch_202
    new-instance v7, Ljava/util/ArrayList;

    invoke-static/range {v28 .. v28}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۧ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static/range {v28 .. v28}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    :sswitch_203
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v9

    const v4, 0x19bbe1

    :goto_bf
    const v10, 0x19bbf2

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_b1

    goto :goto_bf

    :sswitch_204
    if-eqz v9, :cond_81

    const v4, 0x19bec9

    goto :goto_bf

    :cond_81
    :sswitch_205
    const v4, 0x19beaa

    goto :goto_bf

    :sswitch_206
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    invoke-static {v4}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v7, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0x19bee8

    :goto_c0
    const v9, 0x19bef9

    xor-int/2addr v4, v9

    sparse-switch v4, :sswitch_data_b2

    goto :goto_c0

    :sswitch_207
    const v4, 0x19bf07

    goto :goto_c0

    :sswitch_208
    invoke-static {v7}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v8

    sget v4, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۣۣ:I

    xor-int/lit16 v9, v4, -0x175

    const v4, 0x19bf64

    :goto_c1
    const v10, 0x19bf75

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_b3

    goto :goto_c1

    :sswitch_209
    if-lt v8, v9, :cond_82

    const v4, 0x19c24c

    goto :goto_c1

    :cond_82
    :sswitch_20a
    const v4, 0x19bfa2

    goto :goto_c1

    :sswitch_20b
    invoke-static {v7, v9}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۡۥۣ۟(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v7}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟۠۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v6, v4

    :sswitch_20c
    invoke-static {v6}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v5}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    sget v7, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۤۢۧۢ:I

    xor-int/lit16 v7, v7, 0x162

    aput-object v4, v6, v7

    sget v4, Lcom/google/firebase/installations/ktx/ۡۥۦ۟;->۟ۢۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x233

    aput-object v5, v6, v4

    invoke-static {v6}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaAddresses:Ljava/util/List;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v4

    move-object/from16 v0, p0

    iput-wide v4, v0, Lcom/auto/accept/service/RideAcceptorService;->lastOlaCacheTime:J

    const v4, 0x19c26b

    :goto_c2
    const v5, 0x19c27c

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_b4

    goto :goto_c2

    :sswitch_20d
    const v4, 0x19c28a

    goto :goto_c2

    :sswitch_20e
    move-wide/from16 v6, v20

    move-wide/from16 v8, v22

    :goto_c3
    const-wide/16 v4, 0x0

    const v10, 0x19c363

    :goto_c4
    const v11, 0x19c374

    xor-int/2addr v10, v11

    sparse-switch v10, :sswitch_data_b5

    goto :goto_c4

    :sswitch_20f
    const-wide/16 v10, 0x0

    cmpg-double v10, v6, v10

    if-gtz v10, :cond_84

    const v10, 0x19c64b

    goto :goto_c4

    :sswitch_210
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۦۤۦۡ(Ljava/lang/Object;)J

    move-result-wide v8

    const v4, 0x19c2e7

    :goto_c5
    const v5, 0x19c2f8

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_b6

    goto :goto_c5

    :sswitch_211
    const-wide/16 v4, 0x12

    add-long/2addr v4, v6

    sub-long/2addr v4, v8

    const-wide/16 v10, 0x12

    sub-long/2addr v4, v10

    const-wide/16 v10, 0xfa0

    cmp-long v4, v4, v10

    if-ltz v4, :cond_83

    const v4, 0x19c344

    goto :goto_c5

    :cond_83
    :sswitch_212
    const v4, 0x19c325

    goto :goto_c5

    :sswitch_213
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟۟ۦۦۥ(Ljava/lang/Object;)D

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟۟ۦۦۧ(Ljava/lang/Object;)D

    move-result-wide v8

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۨۦۣۧ(Ljava/lang/Object;)D

    move-result-wide v12

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۥۡۤۡ(Ljava/lang/Object;)D

    move-result-wide v18

    goto :goto_c3

    :cond_84
    :sswitch_214
    const v10, 0x19c62c

    goto :goto_c4

    :sswitch_215
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۧۦۧۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v11

    const v10, 0x19c66a

    :goto_c6
    const v17, 0x19c67b

    xor-int v10, v10, v17

    sparse-switch v10, :sswitch_data_b7

    goto :goto_c6

    :sswitch_216
    const/4 v10, 0x2

    if-lt v11, v10, :cond_85

    const v10, 0x19c6c7

    goto :goto_c6

    :cond_85
    :sswitch_217
    const v10, 0x19c6a8

    goto :goto_c6

    :sswitch_218
    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۧۦۧۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    :sswitch_219
    const v10, 0x19c6e6

    :goto_c7
    const v11, 0x19c6f7

    xor-int/2addr v10, v11

    sparse-switch v10, :sswitch_data_b8

    goto :goto_c7

    :sswitch_21a
    const v10, 0x19c705

    goto :goto_c7

    :sswitch_21b
    const/4 v10, 0x2

    new-array v10, v10, [Ljava/lang/String;

    sget v11, Lc6/۟ۧۧ۠ۤ;->۟ۧ۟ۧۥ:I

    xor-int/lit16 v11, v11, -0x328

    aput-object v14, v10, v11

    sget v11, Lv7/ۤۦۧ۟;->۠ۡ۟:I

    xor-int/lit16 v11, v11, 0x169

    aput-object v14, v10, v11

    invoke-static {v10}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const v10, 0x19c9ed

    :goto_c8
    const v11, 0x19c9fe

    xor-int/2addr v10, v11

    sparse-switch v10, :sswitch_data_b9

    goto :goto_c8

    :sswitch_21c
    const v10, 0x19ca0c

    goto :goto_c8

    :sswitch_21d
    const v10, 0x19ca69

    :goto_c9
    const v11, 0x19ca7a

    xor-int/2addr v10, v11

    sparse-switch v10, :sswitch_data_ba

    goto :goto_c9

    :sswitch_21e
    if-nez v15, :cond_86

    const v10, 0x19cac6

    goto :goto_c9

    :cond_86
    :sswitch_21f
    const v10, 0x19caa7

    goto :goto_c9

    :sswitch_220
    const v10, 0x19cae5

    :goto_ca
    const v11, 0x19caf6

    xor-int/2addr v10, v11

    sparse-switch v10, :sswitch_data_bb

    goto :goto_ca

    :sswitch_221
    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    cmpg-double v10, v12, v10

    if-nez v10, :cond_87

    const v10, 0x19cdcd

    goto :goto_ca

    :cond_87
    :sswitch_222
    const v10, 0x19cdae

    goto :goto_ca

    :sswitch_223
    const-wide/16 v10, 0x0

    :goto_cb
    const v12, 0x19cdec

    :goto_cc
    const v13, 0x19cdfd

    xor-int/2addr v12, v13

    sparse-switch v12, :sswitch_data_bc

    goto :goto_cc

    :sswitch_224
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    cmpg-double v12, v18, v12

    if-nez v12, :cond_88

    const v12, 0x19ce49

    goto :goto_cc

    :cond_88
    :sswitch_225
    const v12, 0x19ce2a

    goto :goto_cc

    :sswitch_226
    const v12, 0x19ce68

    :goto_cd
    const v13, 0x19ce79

    xor-int/2addr v12, v13

    sparse-switch v12, :sswitch_data_bd

    goto :goto_cd

    :sswitch_227
    const v12, 0x19ce87

    goto :goto_cd

    :sswitch_228
    move-wide v12, v4

    :goto_ce
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x542

    sget v17, Ly6/۟ۤۥۥۥ;->ۣۤ۟ۧ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, 0x19e

    move/from16 v17, v0

    const/16 v18, 0xcba

    move/from16 v0, v17

    move/from16 v1, v18

    invoke-static {v4, v5, v0, v1}, La/ۥۡۢۨ;->ۣۤۤۨ([SIII)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v5, p0

    invoke-static/range {v5 .. v17}, Lcom/auto/accept/service/RideAcceptorService;->۟ۤۤۡ۠(Ljava/lang/Object;DDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_a0

    :catch_6
    move-exception v5

    const v5, 0x19d16f

    :goto_cf
    const v6, 0x19d180

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_be

    goto :goto_cf

    :sswitch_229
    const v5, 0x19d18e

    goto :goto_cf

    :catch_7
    move-exception v5

    const v5, 0x19d1eb

    :goto_d0
    const v6, 0x19d1fc

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_bf

    goto :goto_d0

    :sswitch_22a
    const v5, 0x19d20a

    goto :goto_d0

    :catch_8
    move-exception v4

    move-object v4, v9

    move-object v5, v8

    goto/16 :goto_98

    :sswitch_22b
    move-wide/from16 v12, v18

    goto :goto_ce

    :sswitch_22c
    move-wide v10, v12

    goto :goto_cb

    :sswitch_22d
    move-object v4, v6

    move-object v5, v7

    goto/16 :goto_ba

    :sswitch_22e
    move-object v15, v7

    goto/16 :goto_9b

    :sswitch_22f
    move-wide/from16 v12, v24

    goto/16 :goto_3a

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_15c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_15a
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_f
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_1b
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1a
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_1e
        0x57 -> :sswitch_22
        0x74 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_21
        0x2f -> :sswitch_23
        0x4c -> :sswitch_22
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_30
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
        0x55 -> :sswitch_30
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_2e
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_32
        0x6a7 -> :sswitch_33
        0x6c8 -> :sswitch_4a
        0x6e9 -> :sswitch_34
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_35
        0x32 -> :sswitch_36
        0x55 -> :sswitch_4a
        0x74 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_38
        0x2d -> :sswitch_4a
        0x32 -> :sswitch_39
        0xdfb -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3b
        0x3e -> :sswitch_3c
        0x5f -> :sswitch_4a
        0x7c -> :sswitch_3d
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3e
        0x36 -> :sswitch_3f
        0x57 -> :sswitch_4a
        0x74 -> :sswitch_40
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_41
        0x5bb -> :sswitch_42
        0x5d8 -> :sswitch_4a
        0x5f9 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_44
        0x3e -> :sswitch_45
        0x5d -> :sswitch_4a
        0x7c -> :sswitch_46
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_47
        0x36 -> :sswitch_48
        0x55 -> :sswitch_4d
        0x17dd84 -> :sswitch_49
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4a
        0x6f -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x1f -> :sswitch_4b
        0x537 -> :sswitch_50
        0x5c8 -> :sswitch_51
        0x5e9 -> :sswitch_4f
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x17 -> :sswitch_4e
        0x76 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_52
        0x53 -> :sswitch_157
        0x72 -> :sswitch_53
        0x1b4 -> :sswitch_54
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_55
        0x53 -> :sswitch_61
        0x72 -> :sswitch_56
        0xd29 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_58
        0x2d -> :sswitch_89
        0x73 -> :sswitch_59
        0xcc -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5b
        0x55 -> :sswitch_89
        0x72 -> :sswitch_5c
        0x1b4 -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_5e
        0x2c8 -> :sswitch_64
        0x2e9 -> :sswitch_5f
        0x52b -> :sswitch_60
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_61
        0x71 -> :sswitch_63
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x12 -> :sswitch_62
        0x33 -> :sswitch_96
        0x71 -> :sswitch_8b
        0x1d4 -> :sswitch_8c
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x11 -> :sswitch_65
        0x57 -> :sswitch_72
        0x76 -> :sswitch_66
        0x329 -> :sswitch_67
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0x16 -> :sswitch_68
        0x35 -> :sswitch_72
        0x77 -> :sswitch_69
        0x1fd4 -> :sswitch_6a
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0xe -> :sswitch_6b
        0x2d -> :sswitch_70
        0x6f -> :sswitch_6c
        0xcc -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x17 -> :sswitch_6f
        0x3e9 -> :sswitch_61
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x12 -> :sswitch_61
        0x71 -> :sswitch_71
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x11 -> :sswitch_73
        0x53 -> :sswitch_84
        0x72 -> :sswitch_74
        0x329 -> :sswitch_75
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_76
        0x35 -> :sswitch_84
        0x73 -> :sswitch_77
        0xd4 -> :sswitch_78
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x12 -> :sswitch_79
        0x2d -> :sswitch_7d
        0x73 -> :sswitch_7a
        0xfcc -> :sswitch_7b
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x13 -> :sswitch_7c
        0x2e9 -> :sswitch_7e
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0x16 -> :sswitch_7f
        0x37 -> :sswitch_6e
        0x71 -> :sswitch_80
        0xd4 -> :sswitch_81
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0xe -> :sswitch_82
        0x71 -> :sswitch_83
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0x1e -> :sswitch_85
        0x3d -> :sswitch_61
        0x7f -> :sswitch_86
        0x1dc -> :sswitch_87
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x16 -> :sswitch_81
        0x77 -> :sswitch_88
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x6f -> :sswitch_8a
        0x3d99 -> :sswitch_6e
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x12 -> :sswitch_8d
        0x33 -> :sswitch_96
        0x71 -> :sswitch_8e
        0x57ac -> :sswitch_8f
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x11 -> :sswitch_90
        0x32 -> :sswitch_91
        0x53 -> :sswitch_94
        0x74 -> :sswitch_92
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_93
        0x32 -> :sswitch_96
    .end sparse-switch

    :sswitch_data_34
    .sparse-switch
        0x11 -> :sswitch_95
        0xea7 -> :sswitch_a6
    .end sparse-switch

    :sswitch_data_35
    .sparse-switch
        0x13 -> :sswitch_97
        0x32 -> :sswitch_98
        0x55 -> :sswitch_94
        0x74 -> :sswitch_99
    .end sparse-switch

    :sswitch_data_36
    .sparse-switch
        0x13 -> :sswitch_9a
        0x32 -> :sswitch_9b
        0x5d -> :sswitch_a1
        0x5eb -> :sswitch_22f
    .end sparse-switch

    :sswitch_data_37
    .sparse-switch
        0xe -> :sswitch_9e
        0x31 -> :sswitch_a0
    .end sparse-switch

    :sswitch_data_38
    .sparse-switch
        0x17 -> :sswitch_9f
        0x36 -> :sswitch_a8
        0x55 -> :sswitch_bc
        0x2ef -> :sswitch_a9
    .end sparse-switch

    :sswitch_data_39
    .sparse-switch
        0x11 -> :sswitch_a2
        0x36 -> :sswitch_a3
        0x57 -> :sswitch_a6
        0x74 -> :sswitch_a4
    .end sparse-switch

    :sswitch_data_3a
    .sparse-switch
        0x11 -> :sswitch_a5
        0xfdab -> :sswitch_9c
    .end sparse-switch

    :sswitch_data_3b
    .sparse-switch
        0xe -> :sswitch_9d
        0x2f -> :sswitch_a7
    .end sparse-switch

    :sswitch_data_3c
    .sparse-switch
        0x12 -> :sswitch_aa
        0x31 -> :sswitch_ab
        0x4c -> :sswitch_ac
        0x73 -> :sswitch_bc
    .end sparse-switch

    :sswitch_data_3d
    .sparse-switch
        0x11 -> :sswitch_ad
        0x32 -> :sswitch_ae
        0x53 -> :sswitch_bc
        0x74 -> :sswitch_af
    .end sparse-switch

    :sswitch_data_3e
    .sparse-switch
        0x11 -> :sswitch_b0
        0x2af -> :sswitch_b1
        0x2c8 -> :sswitch_bc
        0x2e9 -> :sswitch_b2
    .end sparse-switch

    :sswitch_data_3f
    .sparse-switch
        0x12 -> :sswitch_b3
        0x33 -> :sswitch_b4
        0x4c -> :sswitch_b5
        0x6d -> :sswitch_bc
    .end sparse-switch

    :sswitch_data_40
    .sparse-switch
        0x13 -> :sswitch_b6
        0x32 -> :sswitch_b7
        0x55 -> :sswitch_bc
        0x3eb -> :sswitch_b8
    .end sparse-switch

    :sswitch_data_41
    .sparse-switch
        0x16 -> :sswitch_b9
        0x31 -> :sswitch_ba
        0x54 -> :sswitch_bb
        0x77 -> :sswitch_c2
    .end sparse-switch

    :sswitch_data_42
    .sparse-switch
        0xe -> :sswitch_bc
        0x31 -> :sswitch_be
    .end sparse-switch

    :sswitch_data_43
    .sparse-switch
        0x11 -> :sswitch_bd
        0x3ab -> :sswitch_bf
        0x3c8 -> :sswitch_c1
        0x3e9 -> :sswitch_c0
    .end sparse-switch

    :sswitch_data_44
    .sparse-switch
        0x16 -> :sswitch_c3
        0x37 -> :sswitch_c4
        0x54 -> :sswitch_c5
        0x75 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_45
    .sparse-switch
        0xe -> :sswitch_c6
        0x2f -> :sswitch_c7
        0x6d -> :sswitch_154
        0x2d7 -> :sswitch_c8
    .end sparse-switch

    :sswitch_data_46
    .sparse-switch
        0x12 -> :sswitch_c9
        0x31 -> :sswitch_ca
        0x54 -> :sswitch_cb
        0x73 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_47
    .sparse-switch
        0x12 -> :sswitch_cc
        0x31 -> :sswitch_cd
        0x4c -> :sswitch_ce
        0x73 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_48
    .sparse-switch
        0x11 -> :sswitch_cf
        0x2a7 -> :sswitch_d0
        0x2c8 -> :sswitch_154
        0x2e9 -> :sswitch_d1
    .end sparse-switch

    :sswitch_data_49
    .sparse-switch
        0x12 -> :sswitch_d2
        0x33 -> :sswitch_d3
        0x54 -> :sswitch_d4
        0x75 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_4a
    .sparse-switch
        0x12 -> :sswitch_d5
        0x33 -> :sswitch_d6
        0x6d -> :sswitch_154
        0x7eec -> :sswitch_d7
    .end sparse-switch

    :sswitch_data_4b
    .sparse-switch
        0x13 -> :sswitch_d8
        0xb4 -> :sswitch_da
        0xd5 -> :sswitch_154
        0xf2 -> :sswitch_d9
    .end sparse-switch

    :sswitch_data_4c
    .sparse-switch
        0x13 -> :sswitch_db
        0x3bc -> :sswitch_dd
        0x3dd -> :sswitch_154
        0x3f2 -> :sswitch_dc
    .end sparse-switch

    :sswitch_data_4d
    .sparse-switch
        0x13 -> :sswitch_de
        0x73b -> :sswitch_e0
        0x758 -> :sswitch_154
        0x779 -> :sswitch_df
    .end sparse-switch

    :sswitch_data_4e
    .sparse-switch
        0x11 -> :sswitch_e1
        0xb4 -> :sswitch_e3
        0xd7 -> :sswitch_154
        0xf6 -> :sswitch_e2
    .end sparse-switch

    :sswitch_data_4f
    .sparse-switch
        0x11 -> :sswitch_e4
        0x3df -> :sswitch_154
        0x3fe -> :sswitch_e5
        0x1d29 -> :sswitch_e6
    .end sparse-switch

    :sswitch_data_50
    .sparse-switch
        0xe -> :sswitch_e7
        0x2d -> :sswitch_154
        0x4c -> :sswitch_e9
        0x1ef -> :sswitch_e8
    .end sparse-switch

    :sswitch_data_51
    .sparse-switch
        0x17 -> :sswitch_ea
        0xb4 -> :sswitch_ec
        0xd5 -> :sswitch_154
        0xf6 -> :sswitch_eb
    .end sparse-switch

    :sswitch_data_52
    .sparse-switch
        0x1f -> :sswitch_ed
        0x537 -> :sswitch_ef
        0x548 -> :sswitch_154
        0x569 -> :sswitch_ee
    .end sparse-switch

    :sswitch_data_53
    .sparse-switch
        0x11 -> :sswitch_f0
        0x1b4 -> :sswitch_f2
        0x1d3 -> :sswitch_154
        0x1f2 -> :sswitch_f1
    .end sparse-switch

    :sswitch_data_54
    .sparse-switch
        0x11 -> :sswitch_f3
        0xd3 -> :sswitch_154
        0xf2 -> :sswitch_f4
        0xd29 -> :sswitch_f5
    .end sparse-switch

    :sswitch_data_55
    .sparse-switch
        0x12 -> :sswitch_f6
        0x2d -> :sswitch_154
        0x4c -> :sswitch_f8
        0xf3 -> :sswitch_f7
    .end sparse-switch

    :sswitch_data_56
    .sparse-switch
        0x13 -> :sswitch_f9
        0x1b4 -> :sswitch_fb
        0x1d5 -> :sswitch_154
        0x1f2 -> :sswitch_fa
    .end sparse-switch

    :sswitch_data_57
    .sparse-switch
        0x13 -> :sswitch_fc
        0x52b -> :sswitch_fe
        0x548 -> :sswitch_154
        0x569 -> :sswitch_fd
    .end sparse-switch

    :sswitch_data_58
    .sparse-switch
        0xe -> :sswitch_ff
        0x2f -> :sswitch_154
        0x4c -> :sswitch_101
        0xf1 -> :sswitch_100
    .end sparse-switch

    :sswitch_data_59
    .sparse-switch
        0x11 -> :sswitch_102
        0x1d7 -> :sswitch_154
        0x1f6 -> :sswitch_103
        0x329 -> :sswitch_104
    .end sparse-switch

    :sswitch_data_5a
    .sparse-switch
        0x16 -> :sswitch_105
        0x35 -> :sswitch_154
        0x54 -> :sswitch_107
        0xffff7 -> :sswitch_106
    .end sparse-switch

    :sswitch_data_5b
    .sparse-switch
        0xe -> :sswitch_108
        0x2d -> :sswitch_154
        0x4c -> :sswitch_10a
        0xef -> :sswitch_109
    .end sparse-switch

    :sswitch_data_5c
    .sparse-switch
        0x17 -> :sswitch_10b
        0x32f -> :sswitch_10d
        0x348 -> :sswitch_154
        0x369 -> :sswitch_10c
    .end sparse-switch

    :sswitch_data_5d
    .sparse-switch
        0x12 -> :sswitch_10e
        0x33 -> :sswitch_154
        0x4c -> :sswitch_110
        0x7f1 -> :sswitch_10f
    .end sparse-switch

    :sswitch_data_5e
    .sparse-switch
        0x11 -> :sswitch_111
        0xd3 -> :sswitch_154
        0xf2 -> :sswitch_112
        0x329 -> :sswitch_113
    .end sparse-switch

    :sswitch_data_5f
    .sparse-switch
        0x12 -> :sswitch_114
        0x35 -> :sswitch_154
        0x54 -> :sswitch_116
        0xf3 -> :sswitch_115
    .end sparse-switch

    :sswitch_data_60
    .sparse-switch
        0x12 -> :sswitch_117
        0x2d -> :sswitch_154
        0x4c -> :sswitch_119
        0xff3 -> :sswitch_118
    .end sparse-switch

    :sswitch_data_61
    .sparse-switch
        0x13 -> :sswitch_11a
        0x32b -> :sswitch_11c
        0x348 -> :sswitch_154
        0x369 -> :sswitch_11b
    .end sparse-switch

    :sswitch_data_62
    .sparse-switch
        0x16 -> :sswitch_11d
        0x37 -> :sswitch_154
        0x54 -> :sswitch_11f
        0xf1 -> :sswitch_11e
    .end sparse-switch

    :sswitch_data_63
    .sparse-switch
        0xe -> :sswitch_120
        0x2f -> :sswitch_154
        0x7f1 -> :sswitch_121
        0x51ac -> :sswitch_122
    .end sparse-switch

    :sswitch_data_64
    .sparse-switch
        0x11 -> :sswitch_123
        0x36 -> :sswitch_124
        0x3d7 -> :sswitch_154
        0x3f4 -> :sswitch_125
    .end sparse-switch

    :sswitch_data_65
    .sparse-switch
        0x11 -> :sswitch_126
        0x3e -> :sswitch_127
        0xdf -> :sswitch_154
        0xfc -> :sswitch_128
    .end sparse-switch

    :sswitch_data_66
    .sparse-switch
        0x11 -> :sswitch_129
        0x3f58 -> :sswitch_154
        0x3f79 -> :sswitch_12b
        0x3fbb -> :sswitch_12a
    .end sparse-switch

    :sswitch_data_67
    .sparse-switch
        0x17 -> :sswitch_12c
        0x36 -> :sswitch_12d
        0x3d5 -> :sswitch_154
        0x3f4 -> :sswitch_12e
    .end sparse-switch

    :sswitch_data_68
    .sparse-switch
        0x1f -> :sswitch_12f
        0x3e -> :sswitch_130
        0xdd -> :sswitch_154
        0x777 -> :sswitch_131
    .end sparse-switch

    :sswitch_data_69
    .sparse-switch
        0x11 -> :sswitch_132
        0x32 -> :sswitch_133
        0xd3 -> :sswitch_154
        0xf4 -> :sswitch_134
    .end sparse-switch

    :sswitch_data_6a
    .sparse-switch
        0x11 -> :sswitch_135
        0x32 -> :sswitch_136
        0x3d3 -> :sswitch_154
        0x3fc -> :sswitch_137
    .end sparse-switch

    :sswitch_data_6b
    .sparse-switch
        0x11 -> :sswitch_138
        0xea7 -> :sswitch_139
        0xf58 -> :sswitch_154
        0xf79 -> :sswitch_13a
    .end sparse-switch

    :sswitch_data_6c
    .sparse-switch
        0x13 -> :sswitch_13b
        0x32 -> :sswitch_13c
        0xd5 -> :sswitch_154
        0xf4 -> :sswitch_13d
    .end sparse-switch

    :sswitch_data_6d
    .sparse-switch
        0x13 -> :sswitch_13e
        0x32 -> :sswitch_13f
        0x3dd -> :sswitch_154
        0x56b -> :sswitch_140
    .end sparse-switch

    :sswitch_data_6e
    .sparse-switch
        0xe -> :sswitch_141
        0x31 -> :sswitch_142
        0x1cc -> :sswitch_143
        0x1ef -> :sswitch_154
    .end sparse-switch

    :sswitch_data_6f
    .sparse-switch
        0x11 -> :sswitch_144
        0x36 -> :sswitch_145
        0xd7 -> :sswitch_154
        0xf4 -> :sswitch_146
    .end sparse-switch

    :sswitch_data_70
    .sparse-switch
        0x11 -> :sswitch_147
        0x1d48 -> :sswitch_154
        0x1d69 -> :sswitch_149
        0x1dab -> :sswitch_148
    .end sparse-switch

    :sswitch_data_71
    .sparse-switch
        0xe -> :sswitch_14a
        0x2f -> :sswitch_14b
        0x1cc -> :sswitch_14c
        0x1ed -> :sswitch_154
    .end sparse-switch

    :sswitch_data_72
    .sparse-switch
        0x17 -> :sswitch_14d
        0x36 -> :sswitch_14e
        0xd5 -> :sswitch_154
        0x56f -> :sswitch_14f
    .end sparse-switch

    :sswitch_data_73
    .sparse-switch
        0x12 -> :sswitch_150
        0x31 -> :sswitch_151
        0xcc -> :sswitch_152
        0xf3 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_74
    .sparse-switch
        0x11 -> :sswitch_153
        0x32 -> :sswitch_154
    .end sparse-switch

    :sswitch_data_75
    .sparse-switch
        0x11 -> :sswitch_155
        0x2af -> :sswitch_156
    .end sparse-switch

    :sswitch_data_76
    .sparse-switch
        0x12 -> :sswitch_158
        0x33 -> :sswitch_159
    .end sparse-switch

    :sswitch_data_77
    .sparse-switch
        0x13 -> :sswitch_15b
        0x32 -> :sswitch_157
    .end sparse-switch

    :sswitch_data_78
    .sparse-switch
        0x16 -> :sswitch_15d
        0x31 -> :sswitch_15e
        0x7d4 -> :sswitch_15f
        0x7f7 -> :sswitch_22e
    .end sparse-switch

    :sswitch_data_79
    .sparse-switch
        0xe -> :sswitch_160
        0x31 -> :sswitch_161
        0xcc -> :sswitch_162
        0xef -> :sswitch_1a7
    .end sparse-switch

    :sswitch_data_7a
    .sparse-switch
        0x11 -> :sswitch_163
        0x348 -> :sswitch_19c
        0x369 -> :sswitch_165
        0x3ab -> :sswitch_164
    .end sparse-switch

    :sswitch_data_7b
    .sparse-switch
        0x16 -> :sswitch_166
        0x37 -> :sswitch_167
        0xffd4 -> :sswitch_168
        0xfff5 -> :sswitch_19c
    .end sparse-switch

    :sswitch_data_7c
    .sparse-switch
        0xe -> :sswitch_16a
        0x2f -> :sswitch_16b
        0xed -> :sswitch_19d
        0x526c -> :sswitch_16c
    .end sparse-switch

    :sswitch_data_7d
    .sparse-switch
        0x17 -> :sswitch_16d
        0x55 -> :sswitch_177
        0x76 -> :sswitch_16e
        0xb4 -> :sswitch_16f
    .end sparse-switch

    :sswitch_data_7e
    .sparse-switch
        0x1f -> :sswitch_170
        0x5d -> :sswitch_177
        0x7e -> :sswitch_171
        0x1bc -> :sswitch_172
    .end sparse-switch

    :sswitch_data_7f
    .sparse-switch
        0x17 -> :sswitch_173
        0x6f9 -> :sswitch_17e
    .end sparse-switch

    :sswitch_data_80
    .sparse-switch
        0x11 -> :sswitch_174
        0x72 -> :sswitch_175
    .end sparse-switch

    :sswitch_data_81
    .sparse-switch
        0x11 -> :sswitch_176
        0x57 -> :sswitch_1a4
        0x76 -> :sswitch_19e
        0x1d29 -> :sswitch_19f
    .end sparse-switch

    :sswitch_data_82
    .sparse-switch
        0x11 -> :sswitch_178
        0x72 -> :sswitch_17b
    .end sparse-switch

    :sswitch_data_83
    .sparse-switch
        0x13 -> :sswitch_179
        0x72 -> :sswitch_17a
    .end sparse-switch

    :sswitch_data_84
    .sparse-switch
        0x13 -> :sswitch_17c
        0x72 -> :sswitch_17d
    .end sparse-switch

    :sswitch_data_85
    .sparse-switch
        0x13 -> :sswitch_17f
        0x73b -> :sswitch_181
        0x7d8 -> :sswitch_188
        0x7f9 -> :sswitch_180
    .end sparse-switch

    :sswitch_data_86
    .sparse-switch
        0x11 -> :sswitch_182
        0x57 -> :sswitch_188
        0x76 -> :sswitch_183
        0x3b4 -> :sswitch_184
    .end sparse-switch

    :sswitch_data_87
    .sparse-switch
        0x11 -> :sswitch_185
        0x5f -> :sswitch_18b
        0x7e -> :sswitch_186
        0x3f29 -> :sswitch_187
    .end sparse-switch

    :sswitch_data_88
    .sparse-switch
        0xe -> :sswitch_188
        0x6f -> :sswitch_18a
    .end sparse-switch

    :sswitch_data_89
    .sparse-switch
        0x1f -> :sswitch_189
        0x6c8 -> :sswitch_18f
        0x6e9 -> :sswitch_18d
        0x737 -> :sswitch_18e
    .end sparse-switch

    :sswitch_data_8a
    .sparse-switch
        0x17 -> :sswitch_18c
        0x76 -> :sswitch_169
    .end sparse-switch

    :sswitch_data_8b
    .sparse-switch
        0x11 -> :sswitch_191
        0x72 -> :sswitch_192
    .end sparse-switch

    :sswitch_data_8c
    .sparse-switch
        0x11 -> :sswitch_194
        0x72 -> :sswitch_190
    .end sparse-switch

    :sswitch_data_8d
    .sparse-switch
        0x12 -> :sswitch_193
        0x73 -> :sswitch_195
    .end sparse-switch

    :sswitch_data_8e
    .sparse-switch
        0x13 -> :sswitch_196
        0x72 -> :sswitch_197
    .end sparse-switch

    :sswitch_data_8f
    .sparse-switch
        0x13 -> :sswitch_199
        0x5e9 -> :sswitch_19a
    .end sparse-switch

    :sswitch_data_90
    .sparse-switch
        0xe -> :sswitch_198
        0x71 -> :sswitch_19b
    .end sparse-switch

    :sswitch_data_91
    .sparse-switch
        0x16 -> :sswitch_1a0
        0x77 -> :sswitch_1a3
    .end sparse-switch

    :sswitch_data_92
    .sparse-switch
        0x12 -> :sswitch_1a2
        0x33 -> :sswitch_1af
        0x71 -> :sswitch_1a9
        0xcc -> :sswitch_1aa
    .end sparse-switch

    :sswitch_data_93
    .sparse-switch
        0xe -> :sswitch_1a5
        0x6f -> :sswitch_1a6
    .end sparse-switch

    :sswitch_data_94
    .sparse-switch
        0x17 -> :sswitch_1a8
        0x2e9 -> :sswitch_1a1
    .end sparse-switch

    :sswitch_data_95
    .sparse-switch
        0x11 -> :sswitch_1ab
        0x53 -> :sswitch_1ae
        0x72 -> :sswitch_1ac
        0x1b2d4 -> :sswitch_1ad
    .end sparse-switch

    :sswitch_data_96
    .sparse-switch
        0x11 -> :sswitch_1b0
        0x32 -> :sswitch_1b1
        0x53 -> :sswitch_210
        0x7c -> :sswitch_1b2
    .end sparse-switch

    :sswitch_data_97
    .sparse-switch
        0x11 -> :sswitch_1b3
        0x32 -> :sswitch_1b4
        0x53 -> :sswitch_1b9
        0x74 -> :sswitch_1b5
    .end sparse-switch

    :sswitch_data_98
    .sparse-switch
        0x11 -> :sswitch_1b6
        0xdbf -> :sswitch_1b7
        0xdd8 -> :sswitch_1b9
        0xdf9 -> :sswitch_1b8
    .end sparse-switch

    :sswitch_data_99
    .sparse-switch
        0x13 -> :sswitch_1ba
        0x32 -> :sswitch_1bb
        0x5d -> :sswitch_1d9
        0x7c -> :sswitch_1bc
    .end sparse-switch

    :sswitch_data_9a
    .sparse-switch
        0x13 -> :sswitch_1bd
        0x32 -> :sswitch_1be
        0x55 -> :sswitch_1d7
        0x6fb -> :sswitch_1bf
    .end sparse-switch

    :sswitch_data_9b
    .sparse-switch
        0x11 -> :sswitch_1c1
        0x36 -> :sswitch_1c2
        0x57 -> :sswitch_1c9
        0x74 -> :sswitch_1c3
    .end sparse-switch

    :sswitch_data_9c
    .sparse-switch
        0x11 -> :sswitch_1c4
        0x3e -> :sswitch_1c5
        0x5f -> :sswitch_1c7
        0x7c -> :sswitch_1c6
    .end sparse-switch

    :sswitch_data_9d
    .sparse-switch
        0x11 -> :sswitch_1c8
        0x1ebb -> :sswitch_1c0
    .end sparse-switch

    :sswitch_data_9e
    .sparse-switch
        0x17 -> :sswitch_1cb
        0x36 -> :sswitch_1cc
        0x55 -> :sswitch_1d3
        0x74 -> :sswitch_1cd
    .end sparse-switch

    :sswitch_data_9f
    .sparse-switch
        0x1f -> :sswitch_1ce
        0x3e -> :sswitch_1cf
        0x5d -> :sswitch_1d1
        0x7f7 -> :sswitch_1d0
    .end sparse-switch

    :sswitch_data_a0
    .sparse-switch
        0x11 -> :sswitch_1d2
        0x32 -> :sswitch_1ca
    .end sparse-switch

    :sswitch_data_a1
    .sparse-switch
        0x11 -> :sswitch_1d4
        0x32 -> :sswitch_1d5
    .end sparse-switch

    :sswitch_data_a2
    .sparse-switch
        0xe -> :sswitch_1d6
        0x31 -> :sswitch_1e0
        0x4c -> :sswitch_1e1
        0x6f -> :sswitch_200
    .end sparse-switch

    :sswitch_data_a3
    .sparse-switch
        0x11 -> :sswitch_1d8
        0xfa7 -> :sswitch_1d9
    .end sparse-switch

    :sswitch_data_a4
    .sparse-switch
        0x13 -> :sswitch_1da
        0x32 -> :sswitch_1db
        0x55 -> :sswitch_1df
        0x74 -> :sswitch_1dc
    .end sparse-switch

    :sswitch_data_a5
    .sparse-switch
        0x13 -> :sswitch_1dd
        0x32 -> :sswitch_1de
    .end sparse-switch

    :sswitch_data_a6
    .sparse-switch
        0x11 -> :sswitch_1e2
        0x36 -> :sswitch_1e3
        0x57 -> :sswitch_200
        0x74 -> :sswitch_1e4
    .end sparse-switch

    :sswitch_data_a7
    .sparse-switch
        0x11 -> :sswitch_1e5
        0x3eab -> :sswitch_1e6
        0x3ec8 -> :sswitch_200
        0x3ee9 -> :sswitch_1e7
    .end sparse-switch

    :sswitch_data_a8
    .sparse-switch
        0xe -> :sswitch_1e8
        0x2f -> :sswitch_1e9
        0x4c -> :sswitch_1ea
        0x6d -> :sswitch_202
    .end sparse-switch

    :sswitch_data_a9
    .sparse-switch
        0x17 -> :sswitch_1eb
        0x36 -> :sswitch_1ec
        0x55 -> :sswitch_202
        0x5ef -> :sswitch_1ed
    .end sparse-switch

    :sswitch_data_aa
    .sparse-switch
        0x12 -> :sswitch_1ee
        0x31 -> :sswitch_1ef
        0x4c -> :sswitch_1f0
        0x73 -> :sswitch_1ff
    .end sparse-switch

    :sswitch_data_ab
    .sparse-switch
        0x11 -> :sswitch_1f1
        0x32 -> :sswitch_1f2
        0x53 -> :sswitch_1f9
        0x74 -> :sswitch_1f3
    .end sparse-switch

    :sswitch_data_ac
    .sparse-switch
        0x11 -> :sswitch_1f4
        0xdaf -> :sswitch_1f5
        0xdc8 -> :sswitch_1f9
        0xde9 -> :sswitch_1f6
    .end sparse-switch

    :sswitch_data_ad
    .sparse-switch
        0x12 -> :sswitch_1f7
        0x33 -> :sswitch_1f8
    .end sparse-switch

    :sswitch_data_ae
    .sparse-switch
        0x13 -> :sswitch_1fa
        0x32 -> :sswitch_1fb
        0x55 -> :sswitch_22d
        0xd3d4 -> :sswitch_1fc
    .end sparse-switch

    :sswitch_data_af
    .sparse-switch
        0x13 -> :sswitch_1fd
        0x1f2 -> :sswitch_1fe
    .end sparse-switch

    :sswitch_data_b0
    .sparse-switch
        0x13 -> :sswitch_201
        0xf2 -> :sswitch_20c
    .end sparse-switch

    :sswitch_data_b1
    .sparse-switch
        0x13 -> :sswitch_204
        0x53b -> :sswitch_206
        0x558 -> :sswitch_208
        0x579 -> :sswitch_205
    .end sparse-switch

    :sswitch_data_b2
    .sparse-switch
        0x11 -> :sswitch_207
        0x1fe -> :sswitch_203
    .end sparse-switch

    :sswitch_data_b3
    .sparse-switch
        0x11 -> :sswitch_209
        0xd7 -> :sswitch_20c
        0xf6 -> :sswitch_20a
        0x7d39 -> :sswitch_20b
    .end sparse-switch

    :sswitch_data_b4
    .sparse-switch
        0x17 -> :sswitch_20d
        0xf6 -> :sswitch_20e
    .end sparse-switch

    :sswitch_data_b5
    .sparse-switch
        0x17 -> :sswitch_20f
        0x53f -> :sswitch_1ae
        0x558 -> :sswitch_215
        0x579 -> :sswitch_214
    .end sparse-switch

    :sswitch_data_b6
    .sparse-switch
        0x1f -> :sswitch_211
        0x1bc -> :sswitch_1ae
        0x1dd -> :sswitch_213
        0x1fe -> :sswitch_212
    .end sparse-switch

    :sswitch_data_b7
    .sparse-switch
        0x11 -> :sswitch_216
        0xbc -> :sswitch_218
        0xd3 -> :sswitch_21b
        0xf2 -> :sswitch_217
    .end sparse-switch

    :sswitch_data_b8
    .sparse-switch
        0x11 -> :sswitch_21a
        0x1f2 -> :sswitch_21d
    .end sparse-switch

    :sswitch_data_b9
    .sparse-switch
        0x13 -> :sswitch_21c
        0x3f2 -> :sswitch_219
    .end sparse-switch

    :sswitch_data_ba
    .sparse-switch
        0x13 -> :sswitch_21e
        0xbc -> :sswitch_1ae
        0xdd -> :sswitch_220
        0xf2 -> :sswitch_21f
    .end sparse-switch

    :sswitch_data_bb
    .sparse-switch
        0x13 -> :sswitch_221
        0x73b -> :sswitch_223
        0x758 -> :sswitch_22c
        0x779 -> :sswitch_222
    .end sparse-switch

    :sswitch_data_bc
    .sparse-switch
        0x11 -> :sswitch_224
        0x3b4 -> :sswitch_226
        0x3d7 -> :sswitch_22b
        0x3f6 -> :sswitch_225
    .end sparse-switch

    :sswitch_data_bd
    .sparse-switch
        0x11 -> :sswitch_227
        0xfe -> :sswitch_228
    .end sparse-switch

    :sswitch_data_be
    .sparse-switch
        0xe -> :sswitch_193
        0xef -> :sswitch_229
    .end sparse-switch

    :sswitch_data_bf
    .sparse-switch
        0x17 -> :sswitch_22a
        0x3f6 -> :sswitch_190
    .end sparse-switch
.end method

.method private final scanNodeForRapido(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 40

    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    invoke-static {v0, v1, v2}, Lcom/auto/accept/service/RideAcceptorService;->ۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    move-object/from16 v0, p1

    invoke-static {v0, v4}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Ld1/ۣۧۡۡ;->۟ۤۦۣۤ(Ljava/lang/Object;)I

    move-result v4

    int-to-double v0, v4

    move-wide/from16 v24, v0

    new-instance v26, Ljava/util/ArrayList;

    invoke-direct/range {v26 .. v26}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {v19 .. v19}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v7

    :sswitch_0
    invoke-static {v7}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v18

    const/16 v4, 0x650

    :goto_0
    xor-int/lit16 v4, v4, 0x661

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v4, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz v5, :cond_0

    const/16 v4, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v7}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const/16 v5, 0x6cc

    :goto_1
    xor-int/lit16 v5, v5, 0x6dd

    sparse-switch v5, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v6, :cond_1

    const/16 v5, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v5, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x748

    :goto_2
    xor-int/lit16 v6, v6, 0x759

    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-nez v5, :cond_2

    const v6, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v6, 0xbe41

    goto :goto_2

    :sswitch_9
    const v5, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v5, v6

    sparse-switch v5, :sswitch_data_3

    goto :goto_3

    :sswitch_a
    invoke-static {v4}, Lm4/۟ۧۤ۠;->۟ۥۣۣۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const v5, 0xc202

    :goto_4
    const v8, 0xc213

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_4

    goto :goto_4

    :sswitch_b
    if-eqz v6, :cond_4

    const v5, 0xc25f

    goto :goto_4

    :sswitch_c
    const v5, 0xbe9e

    goto :goto_3

    :sswitch_d
    const v6, 0xbefb

    :goto_5
    const v8, 0xbf0c

    xor-int/2addr v6, v8

    sparse-switch v6, :sswitch_data_5

    goto :goto_5

    :goto_6
    :sswitch_e
    invoke-static {v5}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v5}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v6

    const v5, 0xc27e

    :goto_7
    const v8, 0xc28f

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_f
    const v5, 0xc2bc

    goto :goto_7

    :sswitch_10
    const v6, 0xbf1a

    goto :goto_5

    :cond_4
    :sswitch_11
    const v5, 0xc240

    goto :goto_4

    :sswitch_12
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :sswitch_13
    if-lez v6, :cond_3

    const v5, 0xc2db

    goto :goto_7

    :sswitch_14
    move-object/from16 v0, v26

    invoke-static {v0, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0xc2fa

    :goto_8
    const v5, 0xc30b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v4, 0xc5a4

    goto :goto_8

    :sswitch_16
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {v26 .. v26}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    :sswitch_17
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x545

    sget v9, Lj2/۠ۤۨۤ;->ۣ۟۟۠ۦ:I

    xor-int/lit16 v9, v9, -0x3d3

    const/16 v10, 0x630

    invoke-static {v4, v6, v9, v10}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۦ۟ۢ۠([SIII)Ljava/lang/String;

    move-result-object v27

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x54c

    sget v9, Ls0/ۧۧۨۥ;->ۣ۠ۢۧ:I

    xor-int/lit16 v9, v9, 0x3b2

    const/16 v10, 0x514

    invoke-static {v4, v6, v9, v10}, Lu3/ۣۡۡۢ;->ۦۢۡۡ([SIII)Ljava/lang/String;

    move-result-object v28

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x553

    sget v9, Lq0/ۥۣۡۧ;->۟ۦ۟ۧ:I

    xor-int/lit16 v9, v9, 0x33d

    const/16 v10, 0x798

    invoke-static {v4, v6, v9, v10}, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->۟۟ۡۢۢ([SIII)Ljava/lang/String;

    move-result-object v29

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x563

    sget v9, Lo5/۟ۧۡۧۦ;->۟ۡۥۣۨ:I

    xor-int/lit16 v9, v9, 0x31e

    const/16 v10, 0x670

    invoke-static {v4, v6, v9, v10}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۢۦۤۧ([SIII)Ljava/lang/String;

    move-result-object v30

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v6, 0x567

    sget v9, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟ۦۧۦ۟:I

    xor-int/lit16 v9, v9, 0x2e0

    const/16 v10, 0x2bd

    invoke-static {v4, v6, v9, v10}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۢۥۣۡ([SIII)Ljava/lang/String;

    move-result-object v31

    const v4, 0xc601

    :goto_9
    const v6, 0xc612

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_8

    goto :goto_9

    :sswitch_18
    if-eqz v5, :cond_5

    const v4, 0xc65e

    goto :goto_9

    :cond_5
    :sswitch_19
    const v4, 0xc63f

    goto :goto_9

    :sswitch_1a
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const v5, 0xc67d

    :goto_a
    const v9, 0xc68e

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_9

    goto :goto_a

    :cond_6
    :sswitch_1b
    const v5, 0xc6bb

    goto :goto_a

    :sswitch_1c
    if-eqz v6, :cond_6

    const v5, 0xc965

    goto :goto_a

    :sswitch_1d
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v6, 0xc984

    :goto_b
    const v9, 0xc995

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_a

    goto :goto_b

    :sswitch_1e
    if-nez v5, :cond_7

    const v6, 0xc9e1

    goto :goto_b

    :cond_7
    :sswitch_1f
    const v6, 0xc9c2

    goto :goto_b

    :sswitch_20
    invoke-static {v4}, Lm4/۟ۧۤ۠;->۟ۥۣۣۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const v5, 0xca00

    :goto_c
    const v9, 0xca11

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_b

    goto :goto_c

    :cond_8
    :sswitch_21
    const v5, 0xca3e

    goto :goto_c

    :sswitch_22
    if-eqz v6, :cond_8

    const v5, 0xca5d

    goto :goto_c

    :sswitch_23
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const v6, 0xca7c

    :goto_d
    const v9, 0xca8d

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_c

    goto :goto_d

    :sswitch_24
    const v6, 0xcd26

    goto :goto_d

    :sswitch_25
    move-object/from16 v5, v18

    :sswitch_26
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v6

    move-object/from16 v0, v30

    invoke-static {v6, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5, v6}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, v29

    invoke-static {v6, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v31

    invoke-static {v6, v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const v5, 0xcd83

    :goto_e
    const v10, 0xcd94

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_d

    goto :goto_e

    :sswitch_27
    if-nez v9, :cond_9

    const v5, 0xcde0

    goto :goto_e

    :cond_9
    :sswitch_28
    const v5, 0xcdc1

    goto :goto_e

    :sswitch_29
    const/4 v5, 0x0

    move-object/from16 v0, v31

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v9

    const v5, 0xcdff

    :goto_f
    const v10, 0xce10

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_e

    goto :goto_f

    :cond_a
    :sswitch_2a
    const v5, 0xce3d

    goto :goto_f

    :sswitch_2b
    if-nez v9, :cond_a

    const v5, 0xd0e7

    goto :goto_f

    :sswitch_2c
    const/4 v5, 0x0

    move-object/from16 v0, v28

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v9

    const v5, 0xd106

    :goto_10
    const v10, 0xd117

    xor-int/2addr v5, v10

    sparse-switch v5, :sswitch_data_f

    goto :goto_10

    :sswitch_2d
    if-nez v9, :cond_b

    const v5, 0xd163

    goto :goto_10

    :cond_b
    :sswitch_2e
    const v5, 0xd144

    goto :goto_10

    :sswitch_2f
    const/4 v5, 0x0

    move-object/from16 v0, v27

    invoke-static {v6, v0, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v5, 0xd182

    :goto_11
    const v9, 0xd193

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_10

    goto :goto_11

    :sswitch_30
    if-eqz v6, :cond_c

    const v5, 0xd1df

    goto :goto_11

    :cond_c
    :sswitch_31
    const v5, 0xd1c0

    goto :goto_11

    :sswitch_32
    invoke-static {v7, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0xd1fe

    :goto_12
    const v5, 0xd20f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_11

    goto :goto_12

    :sswitch_33
    const v4, 0xd4a8

    goto :goto_12

    :sswitch_34
    invoke-static {v7}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    const v4, 0xd505

    :goto_13
    const v6, 0xd516

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_12

    goto :goto_13

    :sswitch_35
    const/4 v4, 0x1

    if-le v5, v4, :cond_d

    const v4, 0xd562

    goto :goto_13

    :cond_d
    :sswitch_36
    const v4, 0xd543

    goto :goto_13

    :sswitch_37
    new-instance v4, Lt1/p;

    sget v5, Lh7/ۣ۟ۤ۠۠;->ۦ۟ۡۨ:I

    xor-int/lit16 v5, v5, 0x2e8

    invoke-direct {v4, v5}, Lt1/p;-><init>(I)V

    invoke-static {v7, v4}, Lr5/۟ۤۨۥۡ;->۠۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_38
    invoke-static {v7}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v32

    :sswitch_39
    invoke-static/range {v32 .. v32}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xd581

    :goto_14
    const v6, 0xd592

    xor-int/2addr v4, v6

    sparse-switch v4, :sswitch_data_13

    goto :goto_14

    :sswitch_3a
    if-eqz v5, :cond_e

    const v4, 0xd869

    goto :goto_14

    :cond_e
    :sswitch_3b
    const v4, 0xd5bf

    goto :goto_14

    :sswitch_3c
    invoke-static/range {v32 .. v32}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v4, v6}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v7

    sget v8, Lk3/۟ۧ۠۠ۦ;->۟ۥۢۦۢ:I

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v15

    const v5, 0xd888

    :goto_15
    const v9, 0xd899

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_14

    goto :goto_15

    :sswitch_3d
    if-nez v15, :cond_f

    const v5, 0xd8e5

    goto :goto_15

    :cond_f
    :sswitch_3e
    const v5, 0xd8c6

    goto :goto_15

    :sswitch_3f
    const v5, 0xd904

    :goto_16
    const v9, 0xd915

    xor-int/2addr v5, v9

    sparse-switch v5, :sswitch_data_15

    goto :goto_16

    :sswitch_40
    const v5, 0xd923

    goto :goto_16

    :sswitch_41
    move-object v15, v4

    :sswitch_42
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-static {v0, v1, v6}, Lcom/auto/accept/service/RideAcceptorService;->۟ۦۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v16

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static/range {v26 .. v26}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v9

    :sswitch_43
    invoke-static {v9}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0xd980

    :goto_17
    const v10, 0xd991

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_16

    goto :goto_17

    :sswitch_44
    if-eqz v5, :cond_10

    const v4, 0xdc68

    goto :goto_17

    :cond_10
    :sswitch_45
    const v4, 0xdc49

    goto :goto_17

    :sswitch_46
    invoke-static {v9}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v4, v10}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v11

    const v5, 0xdc87

    :goto_18
    const v12, 0xdc98

    xor-int/2addr v5, v12

    sparse-switch v5, :sswitch_data_17

    goto :goto_18

    :sswitch_47
    xor-int/lit16 v5, v8, -0x2e1

    add-int/2addr v5, v7

    if-gt v11, v5, :cond_11

    const v5, 0xdce4

    goto :goto_18

    :cond_11
    :sswitch_48
    const v5, 0xdcc5

    goto :goto_18

    :sswitch_49
    invoke-static {v10}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->ۣۡۡۡ(Ljava/lang/Object;)I

    move-result v5

    int-to-double v10, v5

    const v5, 0xdd03

    :goto_19
    const v12, 0xdd14

    xor-int/2addr v5, v12

    sparse-switch v5, :sswitch_data_18

    goto :goto_19

    :sswitch_4a
    const-wide v12, 0x3fbeb851eb851eb8L    # 0.12

    mul-double v12, v12, v24

    cmpl-double v5, v10, v12

    if-lez v5, :cond_12

    const v5, 0x170090

    goto :goto_19

    :cond_12
    :sswitch_4b
    const v5, 0xdd41

    goto :goto_19

    :sswitch_4c
    invoke-static {v6, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_4d
    const v4, 0x1700af

    :goto_1a
    const v5, 0x1700c0

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_19

    goto :goto_1a

    :sswitch_4e
    const v4, 0x1700ce

    goto :goto_1a

    :sswitch_4f
    const v4, 0x17012b

    :goto_1b
    const v5, 0x17013c

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_1a

    goto :goto_1b

    :sswitch_50
    const v4, 0x17014a

    goto :goto_1b

    :sswitch_51
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v6}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v14

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/high16 v22, -0x4010000000000000L    # -1.0

    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    :goto_1c
    invoke-static {v14}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x1701a7

    :goto_1d
    const v10, 0x1701b8

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_1b

    goto :goto_1d

    :sswitch_52
    if-eqz v5, :cond_13

    const v4, 0x17048f

    goto :goto_1d

    :cond_13
    :sswitch_53
    const v4, 0x170470

    goto :goto_1d

    :sswitch_54
    invoke-static {v14}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v10}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v5

    const v4, 0x1704ae

    :goto_1e
    const v11, 0x1704bf

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_1c

    goto :goto_1e

    :sswitch_55
    if-eqz v5, :cond_14

    const v4, 0x17050b

    goto :goto_1e

    :cond_14
    :sswitch_56
    const v4, 0x1704ec

    goto :goto_1e

    :sswitch_57
    invoke-static {v5}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v5, 0x17052a

    :goto_1f
    const v11, 0x17053b

    xor-int/2addr v5, v11

    sparse-switch v5, :sswitch_data_1d

    goto :goto_1f

    :sswitch_58
    if-nez v4, :cond_15

    const v5, 0x170812

    goto :goto_1f

    :cond_15
    :sswitch_59
    const v5, 0x170568

    goto :goto_1f

    :sswitch_5a
    invoke-static {v10}, Lm4/۟ۧۤ۠;->۟ۥۣۣۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v5

    const v4, 0x170831

    :goto_20
    const v11, 0x170842

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_1e

    goto :goto_20

    :cond_16
    :sswitch_5b
    const v4, 0x17086f

    goto :goto_20

    :sswitch_5c
    if-eqz v5, :cond_16

    const v4, 0x17088e

    goto :goto_20

    :sswitch_5d
    invoke-static {v5}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const v5, 0x1708ad

    :goto_21
    const v11, 0x1708be

    xor-int/2addr v5, v11

    sparse-switch v5, :sswitch_data_1f

    goto :goto_21

    :sswitch_5e
    const v5, 0x1708cc

    goto :goto_21

    :sswitch_5f
    move-object/from16 v4, v18

    :sswitch_60
    invoke-static {v4}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v33

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v4

    move-object/from16 v0, v30

    invoke-static {v4, v0}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v33

    invoke-static {v0, v4}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v34

    move-object/from16 v0, v34

    move-object/from16 v1, v29

    invoke-static {v0, v1}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x56d

    const/4 v11, 0x1

    const/16 v20, 0xccb

    move/from16 v0, v20

    invoke-static {v4, v5, v11, v0}, Lz/۟ۥۣۣ۠;->ۧۦۣۢ([SIII)Ljava/lang/String;

    move-result-object v35

    const/4 v4, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v35

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v11

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x56e

    const/16 v20, 0x1

    const/16 v21, 0x617

    move/from16 v0, v20

    move/from16 v1, v21

    invoke-static {v4, v5, v0, v1}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->ۢۡۡۡ([SIII)Ljava/lang/String;

    move-result-object v36

    const/4 v4, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x170929

    :goto_22
    const v20, 0x17093a

    xor-int v4, v4, v20

    sparse-switch v4, :sswitch_data_20

    goto :goto_22

    :sswitch_61
    if-eqz v5, :cond_17

    const v4, 0x170c11

    goto :goto_22

    :cond_17
    :sswitch_62
    const v4, 0x170bf2

    goto :goto_22

    :sswitch_63
    invoke-static/range {v33 .. v33}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v5

    const v4, 0x170c30

    :goto_23
    const v20, 0x170c41

    xor-int v4, v4, v20

    sparse-switch v4, :sswitch_data_21

    goto :goto_23

    :cond_18
    :sswitch_64
    const v4, 0x170c6e

    goto :goto_23

    :sswitch_65
    const/16 v4, 0xa

    if-ge v5, v4, :cond_18

    const v4, 0x170c8d

    goto :goto_23

    :sswitch_66
    const/4 v4, 0x0

    :sswitch_67
    invoke-static/range {v33 .. v33}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v20

    const v5, 0x170cac

    :goto_24
    const v21, 0x170cbd

    xor-int v5, v5, v21

    sparse-switch v5, :sswitch_data_22

    goto :goto_24

    :sswitch_68
    move/from16 v0, v20

    if-ge v4, v0, :cond_19

    const v5, 0x170f94

    goto :goto_24

    :cond_19
    :sswitch_69
    const v5, 0x170cea

    goto :goto_24

    :sswitch_6a
    move-object/from16 v0, v33

    invoke-static {v0, v4}, Ld9/ۨۧۧۦ;->ۣ۟۟۠ۤ(Ljava/lang/Object;I)C

    move-result v5

    invoke-static {v5}, Lf6/ۣۣۣۣ۟;->ۢۤۦۧ(C)Z

    move-result v20

    const v5, 0x170fb3

    :goto_25
    const v21, 0x170fc4

    xor-int v5, v5, v21

    sparse-switch v5, :sswitch_data_23

    goto :goto_25

    :cond_1a
    :sswitch_6b
    const v5, 0x170ff1

    goto :goto_25

    :sswitch_6c
    if-eqz v20, :cond_1a

    const v5, 0x171010

    goto :goto_25

    :sswitch_6d
    const/4 v4, 0x1

    const v5, 0x17102f

    :goto_26
    const v20, 0x171040

    xor-int v5, v5, v20

    sparse-switch v5, :sswitch_data_24

    goto :goto_26

    :goto_27
    :sswitch_6e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v20, 0x56f

    const/16 v21, 0x1

    const/16 v37, 0x65a

    move/from16 v0, v20

    move/from16 v1, v21

    move/from16 v2, v37

    invoke-static {v5, v0, v1, v2}, Lw6/۟ۥۧۡۨ;->۠ۤۤ۠([SIII)Ljava/lang/String;

    move-result-object v20

    const v5, 0x1713b2

    :goto_28
    const v21, 0x1713c3

    xor-int v5, v5, v21

    sparse-switch v5, :sswitch_data_25

    goto :goto_28

    :cond_1b
    :sswitch_6f
    const v5, 0x1713f0

    goto :goto_28

    :sswitch_70
    const v5, 0x17104e

    goto :goto_26

    :sswitch_71
    sget v5, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->ۧ۠ۨۦ:I

    xor-int/lit16 v5, v5, -0x293

    add-int/2addr v4, v5

    const v5, 0x1710ab

    :goto_29
    const v20, 0x1710bc

    xor-int v5, v5, v20

    sparse-switch v5, :sswitch_data_26

    goto :goto_29

    :sswitch_72
    const v5, 0x171355

    goto :goto_29

    :sswitch_73
    const/4 v4, 0x0

    goto :goto_27

    :sswitch_74
    if-nez v11, :cond_1b

    const v5, 0x17140f

    goto :goto_28

    :sswitch_75
    const v5, 0x17142e

    :goto_2a
    const v11, 0x17143f

    xor-int/2addr v5, v11

    sparse-switch v5, :sswitch_data_27

    goto :goto_2a

    :sswitch_76
    if-eqz v4, :cond_1c

    const v5, 0x171716

    goto :goto_2a

    :cond_1c
    :sswitch_77
    const v5, 0x17146c

    goto :goto_2a

    :sswitch_78
    const v4, 0x171735

    :goto_2b
    const v5, 0x171746

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_28

    goto :goto_2b

    :sswitch_79
    const/4 v4, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v20

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17182d

    :goto_2c
    const v11, 0x17183e

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_29

    goto :goto_2c

    :sswitch_7a
    if-nez v5, :cond_1d

    const v4, 0x171b15

    goto :goto_2c

    :sswitch_7b
    const v4, 0x171754

    goto :goto_2b

    :sswitch_7c
    const v4, 0x1717b1

    :goto_2d
    const v5, 0x1717c2

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_2a

    goto :goto_2d

    :goto_2e
    :sswitch_7d
    const v4, 0x172332

    :goto_2f
    const v5, 0x172343

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_2b

    goto :goto_2f

    :goto_30
    :sswitch_7e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x570

    sget v11, Le1/۟ۡۡۤۡ;->۟ۡ۠ۤۧ:I

    xor-int/lit16 v11, v11, -0x15e

    const/16 v21, 0x19a

    move/from16 v0, v21

    invoke-static {v4, v5, v11, v0}, Lh4/ۣ۟ۢۢۡ;->ۣ۟۠۟۟([SIII)Ljava/lang/String;

    move-result-object v37

    const/4 v4, 0x0

    move-object/from16 v0, v34

    move-object/from16 v1, v37

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17810b

    :goto_31
    const v11, 0x17811c

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_2c

    goto :goto_31

    :sswitch_7f
    if-nez v5, :cond_28

    const v4, 0x1783f3

    goto :goto_31

    :sswitch_80
    const v4, 0x1717d0

    goto :goto_2d

    :cond_1d
    :sswitch_81
    const v4, 0x171af6

    goto :goto_2c

    :sswitch_82
    move-object/from16 v0, p0

    move-object/from16 v1, v33

    invoke-static {v0, v1}, Lcom/auto/accept/service/RideAcceptorService;->۠ۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lz8/ۣۤۡۧ;->ۣۣۢ۟(Ljava/lang/Object;)Z

    move-result v11

    const v4, 0x171b34

    :goto_32
    const v21, 0x171b45

    xor-int v4, v4, v21

    sparse-switch v4, :sswitch_data_2d

    goto :goto_32

    :cond_1e
    :sswitch_83
    const v4, 0x171b72

    goto :goto_32

    :sswitch_84
    xor-int/lit8 v4, v11, -0x1

    and-int/lit8 v4, v4, 0x1

    and-int/lit8 v21, v11, -0x2

    or-int v4, v4, v21

    if-eqz v4, :cond_1e

    const v4, 0x171b91

    goto :goto_32

    :sswitch_85
    invoke-static/range {v33 .. v33}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v11, 0x0

    move-object/from16 v0, v36

    invoke-static {v4, v0, v11}, Lcom/auto/accept/service/۟۠ۧۧۢ;->۟۠۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v11

    const v4, 0x171bb0

    :goto_33
    const v21, 0x171bc1

    xor-int v4, v4, v21

    sparse-switch v4, :sswitch_data_2e

    goto :goto_33

    :cond_1f
    :sswitch_86
    const v4, 0x171bee

    goto :goto_33

    :sswitch_87
    if-eqz v11, :cond_1f

    const v4, 0x171e98

    goto :goto_33

    :sswitch_88
    const/4 v4, 0x0

    invoke-static {v5, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v8

    const v4, 0x171eb7

    :goto_34
    const v5, 0x171ec8

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_2f

    goto :goto_34

    :sswitch_89
    const v4, 0x171ed6

    goto :goto_34

    :sswitch_8a
    const/4 v4, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v11

    const v4, 0x171f33

    :goto_35
    const v21, 0x171f44

    xor-int v4, v4, v21

    sparse-switch v4, :sswitch_data_30

    goto :goto_35

    :cond_20
    :sswitch_8b
    const v4, 0x171f71

    goto :goto_35

    :sswitch_8c
    if-eqz v11, :cond_20

    const v4, 0x171f90

    goto :goto_35

    :sswitch_8d
    invoke-static {v5}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v11

    const v4, 0x171faf

    :goto_36
    const v21, 0x171fc0

    xor-int v4, v4, v21

    sparse-switch v4, :sswitch_data_31

    goto :goto_36

    :sswitch_8e
    const/4 v4, 0x2

    if-lt v11, v4, :cond_21

    const v4, 0x172297

    goto :goto_36

    :cond_21
    :sswitch_8f
    const v4, 0x172278

    goto :goto_36

    :sswitch_90
    const/4 v4, 0x0

    invoke-static {v5, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v38

    const v4, 0x1722b6

    :goto_37
    const v11, 0x1722c7

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_32

    goto :goto_37

    :cond_22
    :sswitch_91
    const v4, 0x1722f4

    goto :goto_37

    :sswitch_92
    cmpl-double v4, v38, v6

    if-lez v4, :cond_22

    const v4, 0x172313

    goto :goto_37

    :sswitch_93
    const/4 v4, 0x0

    invoke-static {v5, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v6

    const/4 v4, 0x1

    invoke-static {v5, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v8

    goto/16 :goto_2e

    :sswitch_94
    const v4, 0x172351

    goto/16 :goto_2f

    :sswitch_95
    const v4, 0x17750e

    :goto_38
    const v5, 0x17751f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_33

    goto :goto_38

    :sswitch_96
    const v4, 0x17752d

    goto :goto_38

    :sswitch_97
    invoke-static {v5}, La7/۠ۢۧ;->ۥۣۡۥ(Ljava/lang/Object;)I

    move-result v11

    const v4, 0x17758a

    :goto_39
    const v21, 0x17759b

    xor-int v4, v4, v21

    sparse-switch v4, :sswitch_data_34

    goto :goto_39

    :sswitch_98
    const/4 v4, 0x2

    if-lt v11, v4, :cond_23

    const v4, 0x1775e7

    goto :goto_39

    :cond_23
    :sswitch_99
    const v4, 0x1775c8

    goto :goto_39

    :sswitch_9a
    const/4 v4, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v11

    const v4, 0x177606

    :goto_3a
    const v21, 0x177617

    xor-int v4, v4, v21

    sparse-switch v4, :sswitch_data_35

    goto :goto_3a

    :sswitch_9b
    if-nez v11, :cond_24

    const v4, 0x1778ee

    goto :goto_3a

    :cond_24
    :sswitch_9c
    const v4, 0x1778cf

    goto :goto_3a

    :sswitch_9d
    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lc4/ۡ۟۠ۥ;->ۢۦ۟(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v5

    const v4, 0x17790d

    :goto_3b
    const v11, 0x17791e

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_36

    goto :goto_3b

    :sswitch_9e
    if-eqz v5, :cond_25

    const v4, 0x17796a

    goto :goto_3b

    :cond_25
    :sswitch_9f
    const v4, 0x17794b

    goto :goto_3b

    :sswitch_a0
    invoke-static {v5}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->۟۠۠ۢۢ(Ljava/lang/Object;)D

    move-result-wide v4

    const v11, 0x177989

    :goto_3c
    const v21, 0x17799a

    xor-int v11, v11, v21

    sparse-switch v11, :sswitch_data_37

    goto :goto_3c

    :sswitch_a1
    const v11, 0x1779a8

    goto :goto_3c

    :sswitch_a2
    const-wide/16 v4, 0x0

    :sswitch_a3
    const v11, 0x177c90

    :goto_3d
    const v21, 0x177ca1

    xor-int v11, v11, v21

    sparse-switch v11, :sswitch_data_38

    goto :goto_3d

    :cond_26
    :sswitch_a4
    const v11, 0x177cce

    goto :goto_3d

    :sswitch_a5
    cmpl-double v11, v4, v6

    if-lez v11, :cond_26

    const v11, 0x177ced

    goto :goto_3d

    :sswitch_a6
    const-wide/16 v8, 0x0

    const v6, 0x177d0c

    :goto_3e
    const v7, 0x177d1d

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_39

    goto :goto_3e

    :sswitch_a7
    const v6, 0x177d2b

    goto :goto_3e

    :sswitch_a8
    move-wide v6, v4

    goto/16 :goto_30

    :sswitch_a9
    const/4 v4, 0x0

    invoke-static {v5, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v38

    const v4, 0x177d88

    :goto_3f
    const v11, 0x177d99

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_3a

    goto :goto_3f

    :sswitch_aa
    cmpl-double v4, v38, v6

    if-lez v4, :cond_27

    const v4, 0x178070

    goto :goto_3f

    :cond_27
    :sswitch_ab
    const v4, 0x178051

    goto :goto_3f

    :sswitch_ac
    const/4 v4, 0x0

    invoke-static {v5, v4}, Li/ۢۥۣ۟;->۟۠ۤۦۥ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-static {v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣ۟ۧ۟(Ljava/lang/Object;)D

    move-result-wide v4

    const v6, 0x17808f

    :goto_40
    const v7, 0x1780a0

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_3b

    goto :goto_40

    :sswitch_ad
    const v6, 0x1780ae

    goto :goto_40

    :cond_28
    :sswitch_ae
    const v4, 0x178149

    goto/16 :goto_31

    :sswitch_af
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x572

    sget v11, Ll6/ۥۦۣ۟;->ۣۡۧۧ:I

    xor-int/lit16 v11, v11, 0x19b

    const/16 v21, 0x55e

    move/from16 v0, v21

    invoke-static {v4, v5, v11, v0}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->۟ۥۣۥۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v4, v5}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x178412

    :goto_41
    const v11, 0x178423

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_3c

    goto :goto_41

    :cond_29
    :sswitch_b0
    const v4, 0x178450

    goto :goto_41

    :sswitch_b1
    if-eqz v5, :cond_29

    const v4, 0x17846f

    goto :goto_41

    :sswitch_b2
    const/4 v4, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v20

    invoke-static {v0, v1, v4}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v5

    const v4, 0x17848e

    :goto_42
    const v11, 0x17849f

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_3d

    goto :goto_42

    :sswitch_b3
    if-nez v5, :cond_2a

    const v4, 0x1784eb

    goto :goto_42

    :cond_2a
    :sswitch_b4
    const v4, 0x1784cc

    goto :goto_42

    :sswitch_b5
    move-object/from16 v0, p0

    move-object/from16 v1, v33

    invoke-static {v0, v1}, Lcom/auto/accept/service/RideAcceptorService;->ۣۥۣۧ(Ljava/lang/Object;Ljava/lang/Object;)D

    move-result-wide v20

    const v4, 0x17850a

    :goto_43
    const v5, 0x17851b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_3e

    goto :goto_43

    :sswitch_b6
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpg-double v4, v22, v4

    if-nez v4, :cond_2b

    const v4, 0x1787f2

    goto :goto_43

    :cond_2b
    :sswitch_b7
    const v4, 0x1787d3

    goto :goto_43

    :sswitch_b8
    const v4, 0x178811

    :goto_44
    const v5, 0x178822

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_3f

    goto :goto_44

    :sswitch_b9
    move-wide v4, v12

    move-wide/from16 v22, v20

    :goto_45
    invoke-static/range {v33 .. v33}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v12

    const v11, 0x178b94

    :goto_46
    const v13, 0x178ba5

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_40

    goto :goto_46

    :cond_2c
    :sswitch_ba
    const v11, 0x178bd2

    goto :goto_46

    :sswitch_bb
    const v4, 0x178830

    goto :goto_44

    :sswitch_bc
    const v4, 0x17888d

    :goto_47
    const v5, 0x17889e

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_41

    goto :goto_47

    :sswitch_bd
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpg-double v4, v12, v4

    if-nez v4, :cond_2d

    const v4, 0x178b75

    goto :goto_47

    :cond_2d
    :sswitch_be
    const v4, 0x1788cb

    goto :goto_47

    :sswitch_bf
    move-wide/from16 v4, v20

    goto :goto_45

    :sswitch_c0
    const/4 v11, 0x5

    if-le v12, v11, :cond_2c

    const v11, 0x178bf1

    goto :goto_46

    :sswitch_c1
    const/4 v11, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v35

    invoke-static {v0, v1, v11}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x178c10

    :goto_48
    const v13, 0x178c21

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_42

    goto :goto_48

    :cond_2e
    :sswitch_c2
    const v11, 0x178c4e

    goto :goto_48

    :sswitch_c3
    if-nez v12, :cond_2e

    const v11, 0x178c6d

    goto :goto_48

    :sswitch_c4
    const/4 v11, 0x0

    move-object/from16 v0, v34

    move-object/from16 v1, v31

    invoke-static {v0, v1, v11}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x178c8c

    :goto_49
    const v13, 0x178c9d

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_43

    goto :goto_49

    :sswitch_c5
    if-nez v12, :cond_2f

    const v11, 0x178f74

    goto :goto_49

    :cond_2f
    :sswitch_c6
    const v11, 0x178f55

    goto :goto_49

    :sswitch_c7
    const/4 v11, 0x0

    move-object/from16 v0, v34

    move-object/from16 v1, v37

    invoke-static {v0, v1, v11}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x178f93

    :goto_4a
    const v13, 0x178fa4

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_44

    goto :goto_4a

    :cond_30
    :sswitch_c8
    const v11, 0x178fd1

    goto :goto_4a

    :sswitch_c9
    if-nez v12, :cond_30

    const v11, 0x178ff0

    goto :goto_4a

    :sswitch_ca
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x576

    sget v13, Lv5/ۥۧ۟ۦ;->۠۟ۨۢ:I

    xor-int/lit16 v13, v13, -0x352

    const/16 v20, 0x2ca

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۦۡۧ([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17900f

    :goto_4b
    const v13, 0x179020

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_45

    goto :goto_4b

    :cond_31
    :sswitch_cb
    const v11, 0x17904d

    goto :goto_4b

    :sswitch_cc
    if-nez v12, :cond_31

    const v11, 0x1792f7

    goto :goto_4b

    :sswitch_cd
    const/4 v11, 0x0

    move-object/from16 v0, v33

    move-object/from16 v1, v36

    invoke-static {v0, v1, v11}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x179316

    :goto_4c
    const v13, 0x179327

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_46

    goto :goto_4c

    :cond_32
    :sswitch_ce
    const v11, 0x179354

    goto :goto_4c

    :sswitch_cf
    if-nez v12, :cond_32

    const v11, 0x179373

    goto :goto_4c

    :sswitch_d0
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x57c

    sget v13, Lc1/ۢۥۥ۟;->ۣ۠ۡ۟:I

    xor-int/lit16 v13, v13, 0x332

    const/16 v20, 0x5be

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Ld7/۟ۢۧۧ۠;->۟ۢ۠ۡ۟([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x179392

    :goto_4d
    const v13, 0x1793a3

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_47

    goto :goto_4d

    :cond_33
    :sswitch_d1
    const v11, 0x1793d0

    goto :goto_4d

    :sswitch_d2
    if-nez v12, :cond_33

    const v11, 0x1793ef

    goto :goto_4d

    :sswitch_d3
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x582

    sget v13, Lg8/ۣۣۣ۟;->۟ۢ۟ۥ:I

    xor-int/lit16 v13, v13, -0x3b7

    const/16 v20, 0x3ef

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Ld/۟ۤ۠ۡۨ;->ۦ۠ۥۧ([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17940e

    :goto_4e
    const v13, 0x17941f

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_48

    goto :goto_4e

    :sswitch_d4
    if-nez v12, :cond_34

    const v11, 0x1796f6

    goto :goto_4e

    :cond_34
    :sswitch_d5
    const v11, 0x1796d7

    goto :goto_4e

    :sswitch_d6
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x586

    sget v13, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۣۨۨ۟:I

    xor-int/lit16 v13, v13, -0x370

    const/16 v20, 0xa6c

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Lh/ۢۢۨۨ;->ۡۥۦ۟([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x179715

    :goto_4f
    const v13, 0x179726

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_49

    goto :goto_4f

    :cond_35
    :sswitch_d7
    const v11, 0x179753

    goto :goto_4f

    :sswitch_d8
    if-nez v12, :cond_35

    const v11, 0x179772

    goto :goto_4f

    :sswitch_d9
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x58a

    sget v13, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۡۤۢۢ:I

    xor-int/lit16 v13, v13, -0x2da

    const/16 v20, 0x308

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Ly6/۟ۢ۟ۥۤ;->ۤ۠ۢۦ([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x179791

    :goto_50
    const v13, 0x1797a2

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_4a

    goto :goto_50

    :cond_36
    :sswitch_da
    const v11, 0x1797cf

    goto :goto_50

    :sswitch_db
    if-nez v12, :cond_36

    const v11, 0x17e94e

    goto :goto_50

    :sswitch_dc
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x58e

    sget v13, Lt2/۟ۢ۟ۢ۟;->۟ۢ۠۠ۤ:I

    xor-int/lit16 v13, v13, 0x136

    const/16 v20, 0x4df

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۡۢ۟([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17e96d

    :goto_51
    const v13, 0x17e97e

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_4b

    goto :goto_51

    :sswitch_dd
    if-nez v12, :cond_37

    const v11, 0x17e9ca

    goto :goto_51

    :cond_37
    :sswitch_de
    const v11, 0x17e9ab

    goto :goto_51

    :sswitch_df
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x591

    sget v13, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->۟ۦۡ۠ۧ:I

    xor-int/lit16 v13, v13, -0xd1

    const/16 v20, 0x87e

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Lh7/۟۟ۧۨ۟;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17e9e9

    :goto_52
    const v13, 0x17e9fa

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_4c

    goto :goto_52

    :sswitch_e0
    if-nez v12, :cond_38

    const v11, 0x17ea46

    goto :goto_52

    :cond_38
    :sswitch_e1
    const v11, 0x17ea27

    goto :goto_52

    :sswitch_e2
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v11

    const/16 v12, 0x597

    sget v13, Lw4/ۥۧۡۥ;->ۣۣ۟ۥۤ:I

    xor-int/lit16 v13, v13, 0x355

    const/16 v20, 0x2b2

    move/from16 v0, v20

    invoke-static {v11, v12, v13, v0}, Lr2/ۧۧۢۢ;->ۥۥ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    move-object/from16 v0, v34

    invoke-static {v0, v11, v12}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17ea65

    :goto_53
    const v13, 0x17ea76

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_4d

    goto :goto_53

    :sswitch_e3
    if-nez v12, :cond_39

    const v11, 0x17ed4d

    goto :goto_53

    :cond_39
    :sswitch_e4
    const v11, 0x17ed2e

    goto :goto_53

    :sswitch_e5
    const/4 v11, 0x0

    move-object/from16 v0, v34

    move-object/from16 v1, v28

    invoke-static {v0, v1, v11}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17ed6c

    :goto_54
    const v13, 0x17ed7d

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_4e

    goto :goto_54

    :sswitch_e6
    if-nez v12, :cond_3a

    const v11, 0x17edc9

    goto :goto_54

    :cond_3a
    :sswitch_e7
    const v11, 0x17edaa

    goto :goto_54

    :sswitch_e8
    const/4 v11, 0x0

    move-object/from16 v0, v34

    move-object/from16 v1, v27

    invoke-static {v0, v1, v11}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v12

    const v11, 0x17ede8

    :goto_55
    const v13, 0x17edf9

    xor-int/2addr v11, v13

    sparse-switch v11, :sswitch_data_4f

    goto :goto_55

    :sswitch_e9
    if-nez v12, :cond_3b

    const v11, 0x17f0d0

    goto :goto_55

    :cond_3b
    :sswitch_ea
    const v11, 0x17ee26

    goto :goto_55

    :sswitch_eb
    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v10, v11}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Lq8/f;

    invoke-static {v11}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v11}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v0, v33

    invoke-direct {v10, v0, v11}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v17

    invoke-static {v0, v10}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_ec
    const v10, 0x17f0ef

    :goto_56
    const v11, 0x17f100

    xor-int/2addr v10, v11

    sparse-switch v10, :sswitch_data_50

    goto :goto_56

    :sswitch_ed
    move-wide v12, v4

    goto/16 :goto_1c

    :sswitch_ee
    const v10, 0x17f10e

    goto :goto_56

    :sswitch_ef
    const v4, 0x17f16b

    :goto_57
    const v5, 0x17f17c

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_51

    goto :goto_57

    :sswitch_f0
    const-wide/16 v4, 0x0

    cmpg-double v4, v6, v4

    if-gtz v4, :cond_3c

    const v4, 0x17f1c8

    goto :goto_57

    :cond_3c
    :sswitch_f1
    const v4, 0x17f1a9

    goto :goto_57

    :sswitch_f2
    invoke-static/range {v17 .. v17}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v5

    const v4, 0x17f1e7

    :goto_58
    const v10, 0x17f1f8

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_52

    goto :goto_58

    :sswitch_f3
    if-nez v5, :cond_3d

    const v4, 0x17f4cf    # 2.200037E-39f

    goto :goto_58

    :cond_3d
    :sswitch_f4
    const v4, 0x17f4b0    # 2.199994E-39f

    goto :goto_58

    :sswitch_f5
    const v4, 0x17f4ee    # 2.20008E-39f

    :goto_59
    const v5, 0x17f4ff

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_53

    goto :goto_59

    :sswitch_f6
    const v4, 0x17f50d

    goto :goto_59

    :sswitch_f7
    const v4, 0x17f56a

    :goto_5a
    const v5, 0x17f57b

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_54

    goto :goto_5a

    :sswitch_f8
    const v4, 0x17f589

    goto :goto_5a

    :sswitch_f9
    const v4, 0x17f871

    :goto_5b
    const v5, 0x17f882

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_55

    goto :goto_5b

    :cond_3e
    :sswitch_fa
    const v4, 0x17f8af

    goto :goto_5b

    :sswitch_fb
    const-wide/16 v4, 0x0

    cmpl-double v4, v6, v4

    if-lez v4, :cond_3e

    const v4, 0x17f8ce

    goto :goto_5b

    :sswitch_fc
    invoke-static/range {v17 .. v17}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    const v4, 0x17f8ed

    :goto_5c
    const v10, 0x17f8fe

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_56

    goto :goto_5c

    :sswitch_fd
    const/4 v4, 0x1

    if-le v5, v4, :cond_3f

    const v4, 0x17f94a

    goto :goto_5c

    :cond_3f
    :sswitch_fe
    const v4, 0x17f92b

    goto :goto_5c

    :sswitch_ff
    invoke-static/range {v17 .. v17}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    const v4, 0x17f969

    :goto_5d
    const v10, 0x17f97a

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_57

    goto :goto_5d

    :sswitch_100
    const/4 v4, 0x1

    if-le v5, v4, :cond_40

    const v4, 0x17fc51

    goto :goto_5d

    :cond_40
    :sswitch_101
    const v4, 0x17fc32

    goto :goto_5d

    :sswitch_102
    new-instance v4, Lt1/p;

    sget v5, La2/۟ۡۥۦ۟;->ۣ۟ۧۡ۠:I

    xor-int/lit16 v5, v5, -0xdb

    invoke-direct {v4, v5}, Lt1/p;-><init>(I)V

    move-object/from16 v0, v17

    invoke-static {v0, v4}, Lr5/۟ۤۨۥۡ;->۠۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_103
    new-instance v14, Ljava/util/ArrayList;

    invoke-static/range {v17 .. v17}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۧ۠ۧۢ(Ljava/lang/Object;)I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static/range {v17 .. v17}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :sswitch_104
    invoke-static {v5}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v10

    const v4, 0x17fc70

    :goto_5e
    const v11, 0x17fc81

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_58

    goto :goto_5e

    :cond_41
    :sswitch_105
    const v4, 0x17fcae

    goto :goto_5e

    :sswitch_106
    if-eqz v10, :cond_41

    const v4, 0x17fccd

    goto :goto_5e

    :sswitch_107
    invoke-static {v5}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq8/f;

    invoke-static {v4}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v14, v4}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v4, 0x17fcec

    :goto_5f
    const v10, 0x17fcfd

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_59

    goto :goto_5f

    :sswitch_108
    const v4, 0x17fd0b

    goto :goto_5f

    :sswitch_109
    invoke-static {v14}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v5

    sget v4, Ll6/ۥۦۣ۟;->ۣۡۧۧ:I

    xor-int/lit16 v10, v4, 0x19d

    const v4, 0x17fff3

    :goto_60
    const v11, 0x180004

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_5a

    goto :goto_60

    :cond_42
    :sswitch_10a
    const v4, 0x180031

    goto :goto_60

    :sswitch_10b
    if-lt v5, v10, :cond_42

    const v4, 0x180050

    goto :goto_60

    :sswitch_10c
    new-array v4, v10, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-static {v14, v10}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۡۥۣ۟(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v4, v5

    const/4 v5, 0x1

    invoke-static {v14}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟۠۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v4, v5

    invoke-static {v4}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    :sswitch_10d
    const v4, 0x18006f

    :goto_61
    const v5, 0x180080

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5b

    goto :goto_61

    :sswitch_10e
    const v4, 0x1803f2

    :goto_62
    const v5, 0x180403

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5c

    goto :goto_62

    :cond_43
    :sswitch_10f
    const v4, 0x180430

    goto :goto_62

    :sswitch_110
    const v4, 0x18008e

    goto :goto_61

    :sswitch_111
    const v4, 0x1800eb

    :goto_63
    const v5, 0x1800fc

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5d

    goto :goto_63

    :sswitch_112
    const v4, 0x180395

    goto :goto_63

    :sswitch_113
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpg-double v4, v22, v4

    if-nez v4, :cond_43

    const v4, 0x18044f

    goto :goto_62

    :sswitch_114
    const-wide/16 v10, 0x0

    :goto_64
    const v4, 0x18046e

    :goto_65
    const v5, 0x18047f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5e

    goto :goto_65

    :sswitch_115
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpg-double v4, v12, v4

    if-nez v4, :cond_44

    const v4, 0x180756

    goto :goto_65

    :cond_44
    :sswitch_116
    const v4, 0x1804ac

    goto :goto_65

    :sswitch_117
    const-wide/16 v12, 0x0

    const v4, 0x180775

    :goto_66
    const v5, 0x180786

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5f

    goto :goto_66

    :sswitch_118
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x59f

    sget v17, Lg2/ۢۥۥۡ;->۟ۧۥۦۤ:I

    move/from16 v0, v17

    xor-int/lit16 v0, v0, -0x21b

    move/from16 v17, v0

    const/16 v20, 0x5e9

    move/from16 v0, v17

    move/from16 v1, v20

    invoke-static {v4, v5, v0, v1}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۦۦ۠ۢ([SIII)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v5, p0

    invoke-static/range {v5 .. v17}, Lcom/auto/accept/service/RideAcceptorService;->۟ۤۤۡ۠(Ljava/lang/Object;DDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x1807f1

    :goto_67
    const v5, 0x180802

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_60

    goto :goto_67

    :sswitch_119
    const v4, 0x180810

    goto :goto_67

    :sswitch_11a
    const v4, 0x180794

    goto :goto_66

    :sswitch_11b
    const v4, 0x18086d

    :goto_68
    const v5, 0x18087e

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_61

    goto :goto_68

    :sswitch_11c
    const v4, 0x180b17

    goto :goto_68

    :sswitch_11d
    return-void

    :sswitch_11e
    move-wide/from16 v10, v22

    goto :goto_64

    :sswitch_11f
    move-wide v4, v12

    goto/16 :goto_45

    :sswitch_120
    move-object/from16 v5, v18

    goto/16 :goto_6

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_16
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x11 -> :sswitch_b
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_120
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_e
        0x1f7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0x33 -> :sswitch_0
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_0
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_34
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_26
        0x74 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_25
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
        0x55 -> :sswitch_32
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_32
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_32
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_30
        0x32 -> :sswitch_31
        0x4c -> :sswitch_32
        0x53 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_35
        0x32 -> :sswitch_36
        0x55 -> :sswitch_38
        0x74 -> :sswitch_37
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3a
        0x2d -> :sswitch_11d
        0x32 -> :sswitch_3b
        0xdfb -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3d
        0x3e -> :sswitch_3e
        0x5f -> :sswitch_42
        0x7c -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_40
        0x36 -> :sswitch_41
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_44
        0x5bb -> :sswitch_45
        0x5d8 -> :sswitch_51
        0x5f9 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_47
        0x3e -> :sswitch_48
        0x5d -> :sswitch_4f
        0x7c -> :sswitch_49
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_4a
        0x36 -> :sswitch_4b
        0x55 -> :sswitch_4d
        0x17dd84 -> :sswitch_4c
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_43
        0x6f -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_50
        0x76 -> :sswitch_43
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_52
        0x537 -> :sswitch_54
        0x5c8 -> :sswitch_ef
        0x5e9 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_55
        0x53 -> :sswitch_5a
        0x72 -> :sswitch_56
        0x1b4 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_58
        0x53 -> :sswitch_60
        0x72 -> :sswitch_59
        0xd29 -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_5b
        0x2d -> :sswitch_5f
        0x73 -> :sswitch_5c
        0xcc -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5e
        0x72 -> :sswitch_60
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_61
        0x2c8 -> :sswitch_73
        0x2e9 -> :sswitch_62
        0x52b -> :sswitch_63
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_64
        0x2f -> :sswitch_73
        0x71 -> :sswitch_65
        0xcc -> :sswitch_66
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_68
        0x57 -> :sswitch_73
        0x76 -> :sswitch_69
        0x329 -> :sswitch_6a
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_6b
        0x35 -> :sswitch_71
        0x77 -> :sswitch_6c
        0x1fd4 -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_6e
        0x6f -> :sswitch_70
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x12 -> :sswitch_6f
        0x33 -> :sswitch_78
        0x71 -> :sswitch_74
        0x7cc -> :sswitch_75
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x17 -> :sswitch_72
        0x3e9 -> :sswitch_67
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x11 -> :sswitch_76
        0x53 -> :sswitch_7c
        0x72 -> :sswitch_77
        0x329 -> :sswitch_78
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_79
        0x73 -> :sswitch_7b
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x13 -> :sswitch_7a
        0x2c8 -> :sswitch_7c
        0x2e9 -> :sswitch_81
        0x32b -> :sswitch_82
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x12 -> :sswitch_7d
        0x73 -> :sswitch_80
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x12 -> :sswitch_7e
        0x71 -> :sswitch_94
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0x17 -> :sswitch_7f
        0x36 -> :sswitch_ae
        0x55 -> :sswitch_b2
        0x2ef -> :sswitch_af
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0x16 -> :sswitch_83
        0x37 -> :sswitch_7c
        0x71 -> :sswitch_84
        0xd4 -> :sswitch_85
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0xe -> :sswitch_86
        0x2f -> :sswitch_8a
        0x71 -> :sswitch_87
        0x559 -> :sswitch_88
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x1e -> :sswitch_7e
        0x7f -> :sswitch_89
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x16 -> :sswitch_8b
        0x35 -> :sswitch_97
        0x77 -> :sswitch_8c
        0xd4 -> :sswitch_8d
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x6f -> :sswitch_8e
        0x3d57 -> :sswitch_90
        0x3d99 -> :sswitch_8f
        0x3db8 -> :sswitch_97
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x12 -> :sswitch_91
        0x33 -> :sswitch_95
        0x71 -> :sswitch_92
        0x1d4 -> :sswitch_93
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_96
        0x32 -> :sswitch_7e
    .end sparse-switch

    :sswitch_data_34
    .sparse-switch
        0x11 -> :sswitch_98
        0x32 -> :sswitch_99
        0x53 -> :sswitch_a9
        0x7c -> :sswitch_9a
    .end sparse-switch

    :sswitch_data_35
    .sparse-switch
        0x11 -> :sswitch_9b
        0xea7 -> :sswitch_9c
        0xed8 -> :sswitch_a9
        0xef9 -> :sswitch_9d
    .end sparse-switch

    :sswitch_data_36
    .sparse-switch
        0x13 -> :sswitch_9e
        0x32 -> :sswitch_9f
        0x55 -> :sswitch_a2
        0x74 -> :sswitch_a0
    .end sparse-switch

    :sswitch_data_37
    .sparse-switch
        0x13 -> :sswitch_a1
        0x32 -> :sswitch_a3
    .end sparse-switch

    :sswitch_data_38
    .sparse-switch
        0xe -> :sswitch_a4
        0x31 -> :sswitch_a5
        0x4c -> :sswitch_a6
        0x6f -> :sswitch_7d
    .end sparse-switch

    :sswitch_data_39
    .sparse-switch
        0x11 -> :sswitch_a7
        0x36 -> :sswitch_a8
    .end sparse-switch

    :sswitch_data_3a
    .sparse-switch
        0x11 -> :sswitch_aa
        0xfdab -> :sswitch_ab
        0xfdc8 -> :sswitch_7e
        0xfde9 -> :sswitch_ac
    .end sparse-switch

    :sswitch_data_3b
    .sparse-switch
        0xe -> :sswitch_a6
        0x2f -> :sswitch_ad
    .end sparse-switch

    :sswitch_data_3c
    .sparse-switch
        0x12 -> :sswitch_b0
        0x31 -> :sswitch_b1
        0x4c -> :sswitch_b2
        0x73 -> :sswitch_11f
    .end sparse-switch

    :sswitch_data_3d
    .sparse-switch
        0x11 -> :sswitch_b3
        0x32 -> :sswitch_b4
        0x53 -> :sswitch_11f
        0x74 -> :sswitch_b5
    .end sparse-switch

    :sswitch_data_3e
    .sparse-switch
        0x11 -> :sswitch_b6
        0x2af -> :sswitch_b7
        0x2c8 -> :sswitch_bc
        0x2e9 -> :sswitch_b8
    .end sparse-switch

    :sswitch_data_3f
    .sparse-switch
        0x12 -> :sswitch_b9
        0x33 -> :sswitch_bb
    .end sparse-switch

    :sswitch_data_40
    .sparse-switch
        0x16 -> :sswitch_ba
        0x31 -> :sswitch_c0
        0x54 -> :sswitch_c1
        0x77 -> :sswitch_ec
    .end sparse-switch

    :sswitch_data_41
    .sparse-switch
        0x13 -> :sswitch_bd
        0x32 -> :sswitch_be
        0x55 -> :sswitch_11f
        0x3eb -> :sswitch_bf
    .end sparse-switch

    :sswitch_data_42
    .sparse-switch
        0xe -> :sswitch_c2
        0x31 -> :sswitch_c3
        0x4c -> :sswitch_c4
        0x6f -> :sswitch_ec
    .end sparse-switch

    :sswitch_data_43
    .sparse-switch
        0x11 -> :sswitch_c5
        0x3ab -> :sswitch_c6
        0x3c8 -> :sswitch_ec
        0x3e9 -> :sswitch_c7
    .end sparse-switch

    :sswitch_data_44
    .sparse-switch
        0x16 -> :sswitch_c8
        0x37 -> :sswitch_c9
        0x54 -> :sswitch_ca
        0x75 -> :sswitch_ec
    .end sparse-switch

    :sswitch_data_45
    .sparse-switch
        0xe -> :sswitch_cb
        0x2f -> :sswitch_cc
        0x6d -> :sswitch_ec
        0x2d7 -> :sswitch_cd
    .end sparse-switch

    :sswitch_data_46
    .sparse-switch
        0x12 -> :sswitch_ce
        0x31 -> :sswitch_cf
        0x54 -> :sswitch_d0
        0x73 -> :sswitch_ec
    .end sparse-switch

    :sswitch_data_47
    .sparse-switch
        0x12 -> :sswitch_d1
        0x31 -> :sswitch_d2
        0x4c -> :sswitch_d3
        0x73 -> :sswitch_ec
    .end sparse-switch

    :sswitch_data_48
    .sparse-switch
        0x11 -> :sswitch_d4
        0x2a7 -> :sswitch_d5
        0x2c8 -> :sswitch_ec
        0x2e9 -> :sswitch_d6
    .end sparse-switch

    :sswitch_data_49
    .sparse-switch
        0x12 -> :sswitch_d7
        0x33 -> :sswitch_d8
        0x54 -> :sswitch_d9
        0x75 -> :sswitch_ec
    .end sparse-switch

    :sswitch_data_4a
    .sparse-switch
        0x12 -> :sswitch_da
        0x33 -> :sswitch_db
        0x6d -> :sswitch_ec
        0x7eec -> :sswitch_dc
    .end sparse-switch

    :sswitch_data_4b
    .sparse-switch
        0x13 -> :sswitch_dd
        0xb4 -> :sswitch_df
        0xd5 -> :sswitch_ec
        0xf2 -> :sswitch_de
    .end sparse-switch

    :sswitch_data_4c
    .sparse-switch
        0x13 -> :sswitch_e0
        0x3bc -> :sswitch_e2
        0x3dd -> :sswitch_ec
        0x3f2 -> :sswitch_e1
    .end sparse-switch

    :sswitch_data_4d
    .sparse-switch
        0x13 -> :sswitch_e3
        0x73b -> :sswitch_e5
        0x758 -> :sswitch_ec
        0x779 -> :sswitch_e4
    .end sparse-switch

    :sswitch_data_4e
    .sparse-switch
        0x11 -> :sswitch_e6
        0xb4 -> :sswitch_e8
        0xd7 -> :sswitch_ec
        0xf6 -> :sswitch_e7
    .end sparse-switch

    :sswitch_data_4f
    .sparse-switch
        0x11 -> :sswitch_e9
        0x3df -> :sswitch_ec
        0x3fe -> :sswitch_ea
        0x1d29 -> :sswitch_eb
    .end sparse-switch

    :sswitch_data_50
    .sparse-switch
        0xe -> :sswitch_ed
        0x1ef -> :sswitch_ee
    .end sparse-switch

    :sswitch_data_51
    .sparse-switch
        0x17 -> :sswitch_f0
        0xb4 -> :sswitch_f2
        0xd5 -> :sswitch_f9
        0xf6 -> :sswitch_f1
    .end sparse-switch

    :sswitch_data_52
    .sparse-switch
        0x1f -> :sswitch_f3
        0x537 -> :sswitch_f5
        0x548 -> :sswitch_f7
        0x569 -> :sswitch_f4
    .end sparse-switch

    :sswitch_data_53
    .sparse-switch
        0x11 -> :sswitch_f6
        0x1f2 -> :sswitch_f9
    .end sparse-switch

    :sswitch_data_54
    .sparse-switch
        0x11 -> :sswitch_f8
        0xf2 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_55
    .sparse-switch
        0x12 -> :sswitch_fa
        0x2d -> :sswitch_11b
        0x4c -> :sswitch_fc
        0xf3 -> :sswitch_fb
    .end sparse-switch

    :sswitch_data_56
    .sparse-switch
        0x13 -> :sswitch_fd
        0x1b4 -> :sswitch_ff
        0x1d5 -> :sswitch_103
        0x1f2 -> :sswitch_fe
    .end sparse-switch

    :sswitch_data_57
    .sparse-switch
        0x13 -> :sswitch_100
        0x52b -> :sswitch_102
        0x548 -> :sswitch_103
        0x569 -> :sswitch_101
    .end sparse-switch

    :sswitch_data_58
    .sparse-switch
        0xe -> :sswitch_105
        0x2f -> :sswitch_109
        0x4c -> :sswitch_107
        0xf1 -> :sswitch_106
    .end sparse-switch

    :sswitch_data_59
    .sparse-switch
        0x11 -> :sswitch_108
        0x1f6 -> :sswitch_104
    .end sparse-switch

    :sswitch_data_5a
    .sparse-switch
        0x16 -> :sswitch_10a
        0x35 -> :sswitch_111
        0x54 -> :sswitch_10c
        0xffff7 -> :sswitch_10b
    .end sparse-switch

    :sswitch_data_5b
    .sparse-switch
        0xe -> :sswitch_10e
        0xef -> :sswitch_110
    .end sparse-switch

    :sswitch_data_5c
    .sparse-switch
        0x12 -> :sswitch_10f
        0x33 -> :sswitch_11e
        0x4c -> :sswitch_114
        0x7f1 -> :sswitch_113
    .end sparse-switch

    :sswitch_data_5d
    .sparse-switch
        0x17 -> :sswitch_112
        0x369 -> :sswitch_10d
    .end sparse-switch

    :sswitch_data_5e
    .sparse-switch
        0x11 -> :sswitch_115
        0xd3 -> :sswitch_118
        0xf2 -> :sswitch_116
        0x329 -> :sswitch_117
    .end sparse-switch

    :sswitch_data_5f
    .sparse-switch
        0x12 -> :sswitch_118
        0xf3 -> :sswitch_11a
    .end sparse-switch

    :sswitch_data_60
    .sparse-switch
        0x12 -> :sswitch_39
        0xff3 -> :sswitch_119
    .end sparse-switch

    :sswitch_data_61
    .sparse-switch
        0x13 -> :sswitch_11c
        0x369 -> :sswitch_39
    .end sparse-switch
.end method

.method private final scanNodeForUber(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 17

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1, v2}, Lcom/auto/accept/service/RideAcceptorService;->ۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v9

    const-wide/16 v4, 0x0

    const/4 v13, 0x0

    :sswitch_0
    invoke-static {v9}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v6

    const/4 v3, 0x0

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz v6, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v9}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {v2}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۥۢۤۤ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v6, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v3, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x748

    :goto_2
    xor-int/lit16 v6, v6, 0x759

    sparse-switch v6, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-nez v3, :cond_2

    const v6, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v6, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {v2}, Lm4/۟ۧۤ۠;->۟ۥۣۣۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v6

    const v3, 0xbe7f

    :goto_3
    const v7, 0xbe90

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_a
    const v3, 0xbebd

    goto :goto_3

    :sswitch_b
    if-eqz v6, :cond_3

    const v3, 0xbedc

    goto :goto_3

    :sswitch_c
    invoke-static {v6}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v6, 0xbefb

    :goto_4
    const v7, 0xbf0c

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_d
    invoke-static {v3}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v6

    const v3, 0xc202

    :goto_6
    const v7, 0xc213

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    if-nez v6, :cond_4

    const v3, 0xc25f

    goto :goto_6

    :sswitch_f
    const v6, 0xbf1a

    goto :goto_4

    :sswitch_10
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_4
    :sswitch_11
    const v3, 0xc240

    goto :goto_6

    :sswitch_12
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۥۢۡ۠()Ljava/util/Locale;

    move-result-object v3

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v6

    const/16 v7, 0x5a5

    sget v11, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۧۨۡۤ:I

    xor-int/lit16 v11, v11, -0x147

    const/16 v12, 0x7d0

    invoke-static {v6, v7, v11, v12}, Ld9/ۨۧۧۦ;->ۨۤۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v10, v3}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5a9

    sget v7, Lz0/ۣ۟۠ۤ۟;->ۣۣ۟ۡ:I

    xor-int/lit16 v7, v7, 0x3bf

    const/16 v12, 0x1ed

    invoke-static {v3, v6, v7, v12}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۨۤۧۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5b9

    const/4 v7, 0x1

    const/16 v12, 0x939

    invoke-static {v3, v6, v7, v12}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->۟ۡۥۨۤ([SIII)Ljava/lang/String;

    move-result-object v12

    const/4 v3, 0x0

    invoke-static {v10, v12, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0xc27e

    :goto_7
    const v7, 0xc28f

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v3, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-eqz v6, :cond_5

    const v3, 0xc2db

    goto :goto_7

    :sswitch_15
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5ba

    const/4 v7, 0x1

    const/16 v14, 0x6f8

    invoke-static {v3, v6, v7, v14}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟ۥۡۤۦ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v10, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0xc2fa

    :goto_8
    const v7, 0xc30b

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    if-nez v6, :cond_6

    const v3, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_17
    const v3, 0xc5c3

    goto :goto_8

    :sswitch_18
    move-object/from16 v0, p0

    invoke-static {v0, v10}, Lcom/auto/accept/service/RideAcceptorService;->۠ۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lc4/ۡ۟۠ۥ;->ۢۦ۟(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v6

    const v3, 0xc601

    :goto_9
    const v7, 0xc612

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_8

    goto :goto_9

    :sswitch_19
    if-eqz v6, :cond_7

    const v3, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1a
    const v3, 0xc63f

    goto :goto_9

    :sswitch_1b
    invoke-static {v6}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->۟۠۠ۢۢ(Ljava/lang/Object;)D

    move-result-wide v6

    const v3, 0xc67d

    :goto_a
    const v14, 0xc68e

    xor-int/2addr v3, v14

    sparse-switch v3, :sswitch_data_9

    goto :goto_a

    :goto_b
    :sswitch_1c
    const v3, 0xc984

    :goto_c
    const v14, 0xc995

    xor-int/2addr v3, v14

    sparse-switch v3, :sswitch_data_a

    goto :goto_c

    :sswitch_1d
    cmpl-double v3, v6, v4

    if-lez v3, :cond_8

    const v3, 0xc9e1

    goto :goto_c

    :sswitch_1e
    const v3, 0xc69c

    goto :goto_a

    :sswitch_1f
    const-wide/16 v6, 0x0

    goto :goto_b

    :cond_8
    :sswitch_20
    const v3, 0xc9c2

    goto :goto_c

    :sswitch_21
    move-wide v4, v6

    :sswitch_22
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5bb

    sget v7, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۧ۟ۤ:I

    xor-int/lit16 v7, v7, 0x305

    const/16 v14, 0x380

    invoke-static {v3, v6, v7, v14}, Le1/۟ۡۡۤۡ;->۟ۥۦۧۧ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v11, v6}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v14, 0x5c0

    sget v15, Lq9/۟ۧۦۤۨ;->ۣ۟ۤۡ۠:I

    xor-int/lit16 v15, v15, 0x324

    const/16 v16, 0x41b

    move/from16 v0, v16

    invoke-static {v3, v14, v15, v0}, Lf6/ۦۣۦ۟;->۟ۤۥ۟۠([SIII)Ljava/lang/String;

    move-result-object v14

    const v3, 0xca00

    :goto_d
    const v15, 0xca11

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_b

    goto :goto_d

    :cond_9
    :sswitch_23
    const v3, 0xca3e

    goto :goto_d

    :sswitch_24
    if-nez v7, :cond_9

    const v3, 0xca5d

    goto :goto_d

    :sswitch_25
    const/4 v3, 0x0

    invoke-static {v11, v6, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v3, 0xca7c

    :goto_e
    const v15, 0xca8d

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_c

    goto :goto_e

    :sswitch_26
    if-nez v7, :cond_a

    const v3, 0xcd64

    goto :goto_e

    :cond_a
    :sswitch_27
    const v3, 0xcd45

    goto :goto_e

    :sswitch_28
    const/4 v3, 0x0

    invoke-static {v11, v14, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v3, 0xcd83

    :goto_f
    const v15, 0xcd94

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_d

    goto :goto_f

    :sswitch_29
    if-nez v7, :cond_b

    const v3, 0xcde0

    goto :goto_f

    :cond_b
    :sswitch_2a
    const v3, 0xcdc1

    goto :goto_f

    :sswitch_2b
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v7, 0x5c7

    sget v15, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۣۣ:I

    xor-int/lit16 v15, v15, -0x171

    const/16 v16, 0x86c

    move/from16 v0, v16

    invoke-static {v3, v7, v15, v0}, Lr2/۠ۦۡۤ;->ۣۣۡۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v3, 0xcdff

    :goto_10
    const v15, 0xce10

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_e

    goto :goto_10

    :cond_c
    :sswitch_2c
    const v3, 0xce3d

    goto :goto_10

    :sswitch_2d
    if-nez v7, :cond_c

    const v3, 0xd0e7

    goto :goto_10

    :sswitch_2e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v7, 0x5cd

    sget v15, Lcom/google/firebase/firestore/core/ۣۣۣ۟۟;->۟ۡۨۢۤ:I

    xor-int/lit16 v15, v15, -0x3bb

    const/16 v16, 0xbcc

    move/from16 v0, v16

    invoke-static {v3, v7, v15, v0}, Lv6/۟ۦۨۦۣ;->۟ۥۡۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v11, v3, v7}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v3, 0xd106

    :goto_11
    const v15, 0xd117

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_f

    goto :goto_11

    :sswitch_2f
    if-eqz v7, :cond_d

    const v3, 0xd163

    goto :goto_11

    :cond_d
    :sswitch_30
    const v3, 0xd144

    goto :goto_11

    :sswitch_31
    invoke-static {v2}, Lcom/google/android/gms/internal/stats/ۣۣ۟ۡۡ;->۟ۢۨ۠ۢ(Ljava/lang/Object;)Z

    move-result v7

    const v3, 0xd182

    :goto_12
    const v15, 0xd193

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_10

    goto :goto_12

    :sswitch_32
    if-eqz v7, :cond_e

    const v3, 0xd1df

    goto :goto_12

    :cond_e
    :sswitch_33
    const v3, 0xd1c0

    goto :goto_12

    :sswitch_34
    const v3, 0xd1fe

    :goto_13
    const v7, 0xd20f

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_11

    goto :goto_13

    :sswitch_35
    const v3, 0xd4a8

    goto :goto_13

    :sswitch_36
    move-object v13, v2

    :sswitch_37
    invoke-static {v10}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    const v3, 0xdc87

    :goto_14
    const v15, 0xdc98

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_12

    goto :goto_14

    :sswitch_38
    const/4 v3, 0x5

    if-le v7, v3, :cond_13

    const v3, 0xdce4

    goto :goto_14

    :sswitch_39
    invoke-static {v11, v6}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const v3, 0xd505

    :goto_15
    const v15, 0xd516

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_13

    goto :goto_15

    :sswitch_3a
    if-nez v7, :cond_f

    const v3, 0xd562

    goto :goto_15

    :cond_f
    :sswitch_3b
    const v3, 0xd543

    goto :goto_15

    :sswitch_3c
    const/4 v3, 0x0

    invoke-static {v11, v14, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v3, 0xd581

    :goto_16
    const v15, 0xd592

    xor-int/2addr v3, v15

    sparse-switch v3, :sswitch_data_14

    goto :goto_16

    :sswitch_3d
    if-eqz v7, :cond_10

    const v3, 0xd869

    goto :goto_16

    :cond_10
    :sswitch_3e
    const v3, 0xd5bf

    goto :goto_16

    :sswitch_3f
    const v3, 0xd888

    :goto_17
    const v7, 0xd899

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_15

    goto :goto_17

    :sswitch_40
    if-nez v13, :cond_11

    const v3, 0xd8e5

    goto :goto_17

    :cond_11
    :sswitch_41
    const v3, 0xd8c6

    goto :goto_17

    :sswitch_42
    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v13

    const v3, 0xd904

    :goto_18
    const v7, 0xd915

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_16

    goto :goto_18

    :sswitch_43
    if-nez v13, :cond_12

    const v3, 0xd961

    goto :goto_18

    :cond_12
    :sswitch_44
    const v3, 0xd942

    goto :goto_18

    :sswitch_45
    const v3, 0xd980

    :goto_19
    const v7, 0xd991

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_17

    goto :goto_19

    :sswitch_46
    const v3, 0xdc2a

    goto :goto_19

    :cond_13
    :sswitch_47
    const v3, 0xdcc5

    goto/16 :goto_14

    :sswitch_48
    const/4 v3, 0x0

    invoke-static {v10, v12, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v7

    const v3, 0xdd03

    :goto_1a
    const v12, 0xdd14

    xor-int/2addr v3, v12

    sparse-switch v3, :sswitch_data_18

    goto :goto_1a

    :sswitch_49
    if-nez v7, :cond_14

    const v3, 0x170090

    goto :goto_1a

    :cond_14
    :sswitch_4a
    const v3, 0xdd41

    goto :goto_1a

    :sswitch_4b
    const/4 v3, 0x0

    invoke-static {v11, v6, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x1700af

    :goto_1b
    const v7, 0x1700c0

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_19

    goto :goto_1b

    :cond_15
    :sswitch_4c
    const v3, 0x1700ed

    goto :goto_1b

    :sswitch_4d
    if-nez v6, :cond_15

    const v3, 0x17010c

    goto :goto_1b

    :sswitch_4e
    const/4 v3, 0x0

    invoke-static {v11, v14, v3}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x17012b

    :goto_1c
    const v7, 0x17013c

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_1a

    goto :goto_1c

    :sswitch_4f
    if-nez v6, :cond_16

    const v3, 0x170188

    goto :goto_1c

    :cond_16
    :sswitch_50
    const v3, 0x170169

    goto :goto_1c

    :sswitch_51
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5d8

    sget v7, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۢۤۥۡ:I

    xor-int/lit16 v7, v7, -0x2b0

    const/16 v12, 0x598

    invoke-static {v3, v6, v7, v12}, Landroidx/activity/ۣۧۧۢ;->ۤۥۣۥ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x1701a7

    :goto_1d
    const v7, 0x1701b8

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_1b

    goto :goto_1d

    :sswitch_52
    if-nez v6, :cond_17

    const v3, 0x17048f

    goto :goto_1d

    :cond_17
    :sswitch_53
    const v3, 0x170470

    goto :goto_1d

    :sswitch_54
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5db

    sget v7, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣۨ۠ۥ:I

    xor-int/lit16 v7, v7, 0x32b

    const/16 v12, 0x84c

    invoke-static {v3, v6, v7, v12}, Landroidx/compose/ui/draw/ۣ۟ۨۨۦ;->ۣ۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x1704ae

    :goto_1e
    const v7, 0x1704bf

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_1c

    goto :goto_1e

    :sswitch_55
    if-nez v6, :cond_18

    const v3, 0x17050b

    goto :goto_1e

    :cond_18
    :sswitch_56
    const v3, 0x1704ec

    goto :goto_1e

    :sswitch_57
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5dd

    sget v7, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->۟۟۟۠ۨ:I

    xor-int/lit16 v7, v7, 0x3ad

    const/16 v12, 0x3d0

    invoke-static {v3, v6, v7, v12}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟۠ۤۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x17052a

    :goto_1f
    const v7, 0x17053b

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_1d

    goto :goto_1f

    :sswitch_58
    if-nez v6, :cond_19

    const v3, 0x170812

    goto :goto_1f

    :cond_19
    :sswitch_59
    const v3, 0x170568

    goto :goto_1f

    :sswitch_5a
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5e0

    sget v7, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۣۤۦۨ:I

    xor-int/lit8 v7, v7, 0x6d

    const/16 v12, 0x5c4

    invoke-static {v3, v6, v7, v12}, Landroidx/compose/ui/input/key/ۣۢۥۢ;->۠ۥۤۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x170831

    :goto_20
    const v7, 0x170842

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_1e

    goto :goto_20

    :cond_1a
    :sswitch_5b
    const v3, 0x17086f

    goto :goto_20

    :sswitch_5c
    if-nez v6, :cond_1a

    const v3, 0x17088e

    goto :goto_20

    :sswitch_5d
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5e4

    sget v7, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۥۤۤ:I

    xor-int/lit16 v7, v7, -0xcc

    const/16 v12, 0x347

    invoke-static {v3, v6, v7, v12}, Ll0/ۡۦۦۡ;->۠۟ۦۥ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x1708ad

    :goto_21
    const v7, 0x1708be

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_1f

    goto :goto_21

    :sswitch_5e
    if-nez v6, :cond_1b

    const v3, 0x17090a

    goto :goto_21

    :cond_1b
    :sswitch_5f
    const v3, 0x1708eb

    goto :goto_21

    :sswitch_60
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5e8

    sget v7, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣۣۤۤ:I

    xor-int/lit16 v7, v7, -0x1a1

    const/16 v12, 0xb03

    invoke-static {v3, v6, v7, v12}, Lg9/۠ۨۧۤ;->۟ۢۥۨۤ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x170929

    :goto_22
    const v7, 0x17093a

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_20

    goto :goto_22

    :sswitch_61
    if-nez v6, :cond_1c

    const v3, 0x170c11

    goto :goto_22

    :cond_1c
    :sswitch_62
    const v3, 0x170bf2

    goto :goto_22

    :sswitch_63
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v3

    const/16 v6, 0x5ec

    sget v7, Lu1/۟ۧۥۢ۠;->۟ۥ۟۟ۡ:I

    xor-int/lit16 v7, v7, -0xdf

    const/16 v12, 0x6ca

    invoke-static {v3, v6, v7, v12}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۣ۟۠([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v11, v3, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->۟ۤۦۨۢ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v6

    const v3, 0x170c30

    :goto_23
    const v7, 0x170c41

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_21

    goto :goto_23

    :cond_1d
    :sswitch_64
    const v3, 0x170c6e

    goto :goto_23

    :sswitch_65
    if-nez v6, :cond_1d

    const v3, 0x170c8d

    goto :goto_23

    :sswitch_66
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    invoke-static {v2, v3}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lq8/f;

    invoke-static {v3}, Lu0/ۣ۟ۤ۟ۡ;->ۣۣۨ۟(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v2, v10, v3}, Lq8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v2}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0x170cac

    :goto_24
    const v3, 0x170cbd

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_22

    goto :goto_24

    :sswitch_67
    const v2, 0x170ccb

    goto :goto_24

    :sswitch_68
    const v2, 0x170fb3

    :goto_25
    const v6, 0x170fc4

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_23

    goto :goto_25

    :cond_1e
    :sswitch_69
    const v2, 0x170ff1

    goto :goto_25

    :sswitch_6a
    if-eqz v13, :cond_1e

    const v2, 0x171010

    goto :goto_25

    :sswitch_6b
    const v2, 0x17102f

    :goto_26
    const v6, 0x171040

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_24

    goto :goto_26

    :cond_1f
    :sswitch_6c
    const v2, 0x17106d

    goto :goto_26

    :sswitch_6d
    const-wide/16 v6, 0x0

    cmpl-double v2, v4, v6

    if-lez v2, :cond_1f

    const v2, 0x17108c

    goto :goto_26

    :sswitch_6e
    invoke-static {v8}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v3

    const v2, 0x1710ab

    :goto_27
    const v6, 0x1710bc

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_25

    goto :goto_27

    :sswitch_6f
    const/4 v2, 0x1

    if-le v3, v2, :cond_20

    const v2, 0x171393

    goto :goto_27

    :cond_20
    :sswitch_70
    const v2, 0x171374

    goto :goto_27

    :sswitch_71
    invoke-static {v8}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v3

    const v2, 0x1713b2

    :goto_28
    const v6, 0x1713c3

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_26

    goto :goto_28

    :cond_21
    :sswitch_72
    const v2, 0x1713f0

    goto :goto_28

    :sswitch_73
    const/4 v2, 0x1

    if-le v3, v2, :cond_21

    const v2, 0x17140f

    goto :goto_28

    :sswitch_74
    new-instance v2, Lt1/p;

    sget v3, Lv0/ۣۣۡۢ;->۟ۧۦۧ۟:I

    xor-int/lit16 v3, v3, -0x32e

    invoke-direct {v2, v3}, Lt1/p;-><init>(I)V

    invoke-static {v8, v2}, Lr5/۟ۤۨۥۡ;->۠۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_75
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v8}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۧ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v8}, Ln7/۟ۤ۠۟ۥ;->ۤۥۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_76
    invoke-static {v3}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v6

    const v2, 0x17142e

    :goto_29
    const v7, 0x17143f

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_27

    goto :goto_29

    :sswitch_77
    if-eqz v6, :cond_22

    const v2, 0x171716

    goto :goto_29

    :cond_22
    :sswitch_78
    const v2, 0x17146c

    goto :goto_29

    :sswitch_79
    invoke-static {v3}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq8/f;

    invoke-static {v2}, La2/۟ۡۥۦ۟;->ۢۦ۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v12, v2}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v2, 0x171735

    :goto_2a
    const v6, 0x171746

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_28

    goto :goto_2a

    :sswitch_7a
    const v2, 0x171754

    goto :goto_2a

    :sswitch_7b
    invoke-static {v12}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v3

    const v2, 0x1717b1

    :goto_2b
    const v6, 0x1717c2

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_29

    goto :goto_2b

    :cond_23
    :sswitch_7c
    const v2, 0x1717ef

    goto :goto_2b

    :sswitch_7d
    const/4 v2, 0x2

    if-lt v3, v2, :cond_23

    const v2, 0x17180e

    goto :goto_2b

    :sswitch_7e
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v6, 0x2

    invoke-static {v12, v6}, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۡۥۣ۟(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v2, v3

    const/4 v3, 0x1

    invoke-static {v12}, Lrikka/shizuku/۟ۤۦ۟ۦ;->۟۠۠ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v2, v3

    invoke-static {v2}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const v2, 0x17182d

    :goto_2c
    const v3, 0x17183e

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_2a

    goto :goto_2c

    :sswitch_7f
    const v2, 0x171ad7

    goto :goto_2c

    :sswitch_80
    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x5f5

    sget v15, Lq7/۟ۢۡ۟۟;->ۣۥۦۨ:I

    xor-int/lit16 v15, v15, 0xc3

    const/16 v16, 0x203

    move/from16 v0, v16

    invoke-static {v2, v3, v15, v0}, Lj2/۠ۤۨۤ;->۟۟ۥۥ([SIII)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v15}, Lcom/auto/accept/service/RideAcceptorService;->۟ۤۤۡ۠(Ljava/lang/Object;DDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2d
    :sswitch_81
    return-void

    :sswitch_82
    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦ۠ۨۤ(Ljava/lang/Object;)J

    move-result-wide v4

    const v2, 0x171b34

    :goto_2e
    const v8, 0x171b45

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_2b

    goto :goto_2e

    :cond_24
    :sswitch_83
    const v2, 0x171b72

    goto :goto_2e

    :sswitch_84
    const-wide/16 v8, 0x18

    sub-long v8, v6, v8

    sub-long/2addr v8, v4

    const-wide/16 v10, 0x18

    add-long/2addr v8, v10

    const-wide/16 v10, 0x7d0

    cmp-long v2, v8, v10

    if-gez v2, :cond_24

    const v2, 0x171b91

    goto :goto_2e

    :sswitch_85
    invoke-static {}, Lg4/۠ۤۢۥ;->ۨۡۥۧ()I

    move-result v3

    const v2, 0x171bb0

    :goto_2f
    const v4, 0x171bc1

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_2c

    goto :goto_2f

    :cond_25
    :sswitch_86
    const v2, 0x171bee

    goto :goto_2f

    :sswitch_87
    if-ltz v3, :cond_25

    const v2, 0x171e98

    goto :goto_2f

    :sswitch_88
    const-string v2, "OE0lxTGjsWaZSWXXdjCKAMQc"

    invoke-static {v2}, Lv9/۠ۡۨۨ;->ۣ۟ۨ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_2d

    :sswitch_89
    :try_start_0
    invoke-static {}, Lj4/ۣۧۤ;->ۧۦۡ()Z

    move-result v4

    const v2, 0x171eb7

    :goto_30
    const v5, 0x171ec8

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_2d

    goto :goto_30

    :cond_26
    :sswitch_8a
    const v2, 0x171ef5

    goto :goto_30

    :sswitch_8b
    if-nez v4, :cond_26

    const v2, 0x171f14

    goto :goto_30

    :sswitch_8c
    const v2, 0x171f33

    :goto_31
    const v3, 0x171f44

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_2e

    goto :goto_31

    :sswitch_8d
    const v2, 0x171f52

    goto :goto_31

    :sswitch_8e
    invoke-static {}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->۟ۢۥ۟ۧ()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    const v2, 0x171faf

    :goto_32
    const v5, 0x171fc0

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_2f

    goto :goto_32

    :sswitch_8f
    if-nez v4, :cond_27

    const v2, 0x172297

    goto :goto_32

    :cond_27
    :sswitch_90
    const v2, 0x172278

    goto :goto_32

    :sswitch_91
    invoke-static/range {p0 .. p0}, Landroidx/core/app/ۣۥۢۧ;->ۨۨ۠ۦ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۨۢۥۧ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v2}, Lh5/۟ۦۣۣ;->ۦۣۦۦ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v2}, Lz0/ۣ۟۠ۤ۟;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    div-int/lit8 v5, v4, 0x2

    int-to-double v8, v2

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Integer;

    const/4 v4, 0x0

    const-wide/high16 v10, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v10, v8

    double-to-int v10, v10

    invoke-static {v10}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v2, v4

    const/4 v4, 0x1

    const-wide v10, 0x3feb333333333333L    # 0.85

    mul-double/2addr v10, v8

    double-to-int v10, v10

    invoke-static {v10}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v2, v4

    const/4 v4, 0x2

    const-wide v10, 0x3feccccccccccccdL    # 0.9

    mul-double/2addr v8, v10

    double-to-int v8, v8

    invoke-static {v8}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v2, v4

    invoke-static {v2}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v8, 0x5f9

    sget v9, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->ۤۢۧۢ:I

    xor-int/lit16 v9, v9, 0x16e

    const/16 v10, 0x16f

    invoke-static {v4, v8, v9, v10}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۣ۠۠۟([SIII)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v8, 0x605

    sget v9, Lm7/ۡۢۦۢ;->ۣ۠۠۠:I

    xor-int/lit16 v9, v9, 0x295

    const/16 v10, 0x25a

    invoke-static {v4, v8, v9, v10}, Lh5/۟ۦۣۣ;->۟ۤ۠۟ۤ([SIII)Ljava/lang/String;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v8

    :goto_33
    invoke-static {v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0x1722b6

    :goto_34
    const v9, 0x1722c7

    xor-int/2addr v2, v9

    sparse-switch v2, :sswitch_data_30

    goto :goto_34

    :cond_28
    :sswitch_92
    const v2, 0x1722f4

    goto :goto_34

    :sswitch_93
    if-eqz v4, :cond_28

    const v2, 0x172313

    goto :goto_34

    :sswitch_94
    invoke-static {v8}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget v9, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->۟۟ۥۢۡ:I

    const v4, 0x172332

    :goto_35
    const v10, 0x172343

    xor-int/2addr v4, v10

    sparse-switch v4, :sswitch_data_31

    goto :goto_35

    :cond_29
    :sswitch_95
    const v4, 0x172370

    goto :goto_35

    :sswitch_96
    if-ltz v3, :cond_29

    const v4, 0x1774ef

    goto :goto_35

    :sswitch_97
    check-cast v2, Ljava/lang/Number;

    invoke-static {v2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v2

    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v10

    invoke-direct {v4, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v10, Lb5/h;

    invoke-direct {v10, v5, v2}, Lb5/h;-><init>(II)V

    sget v2, Lq7/۟ۢۢ۟ۧ;->۟ۦۤۤ۟:I

    xor-int/lit16 v2, v2, -0x18f

    mul-int/2addr v2, v3

    int-to-long v12, v2

    invoke-static {v4, v10, v12, v13}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    xor-int/lit16 v2, v9, -0x321

    add-int/2addr v2, v3

    const v3, 0x17750e

    :goto_36
    const v4, 0x17751f

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_32

    goto :goto_36

    :sswitch_98
    const v3, 0x17752d

    goto :goto_36

    :sswitch_99
    move v3, v2

    goto :goto_33

    :sswitch_9a
    invoke-static {}, Lcom/google/firebase/firestore/proto/۟ۥۡۤۧ;->ۣۣ۠ۤ()V

    const/4 v2, 0x0

    throw v2

    :sswitch_9b
    move-object/from16 v0, p0

    iput-wide v6, v0, Lcom/auto/accept/service/RideAcceptorService;->lastUberBlindFireTime:J

    sget v2, Lia/۟۠ۡۦ۟;->۟ۥۥۧۡ:I

    xor-int/lit16 v2, v2, 0x3ae7

    int-to-long v2, v2

    div-long v2, v6, v2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v4

    const/16 v5, 0x64d

    sget v6, Ls/ۧۥ۟۟;->۟۟ۨۢۧ:I

    xor-int/lit16 v6, v6, -0x2ee

    const/16 v7, 0x42c

    invoke-static {v4, v5, v6, v7}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟ۧۢ۠ۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2, v3}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۨۨ۟ۧ(Ljava/lang/Object;J)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v4, 0x658

    sget v5, Lu/ۤ;->۠ۦۧۥ:I

    xor-int/lit16 v5, v5, 0x14c

    const/16 v6, 0xb2a

    invoke-static {v2, v4, v5, v6}, Lu8/ۨۡ۠;->ۨۢۢۤ([SIII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v7}, Lcom/auto/accept/service/RideAcceptorService;->۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V

    goto/16 :goto_2d

    :catch_0
    move-exception v2

    const v2, 0x17758a

    :goto_37
    const v3, 0x17759b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_33

    goto :goto_37

    :sswitch_9c
    const v2, 0x1775a9

    goto :goto_37

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_68
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_10
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_22
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_22
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_1a
        0x4c -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1d
        0x36 -> :sswitch_20
        0x57 -> :sswitch_22
        0x74 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_23
        0x11 -> :sswitch_24
        0x2f -> :sswitch_31
        0x4c -> :sswitch_25
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_26
        0x7ab -> :sswitch_27
        0x7c8 -> :sswitch_31
        0x7e9 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_29
        0x36 -> :sswitch_2a
        0x55 -> :sswitch_31
        0x74 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2c
        0x2d -> :sswitch_31
        0x3ef -> :sswitch_2d
        0x1ef7 -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2f
        0x32 -> :sswitch_30
        0x53 -> :sswitch_39
        0x74 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_32
        0x32 -> :sswitch_33
        0x4c -> :sswitch_34
        0x53 -> :sswitch_39
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_35
        0x6a7 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x1f -> :sswitch_38
        0x3e -> :sswitch_47
        0x5d -> :sswitch_0
        0x7c -> :sswitch_48
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3a
        0x32 -> :sswitch_3b
        0x55 -> :sswitch_3f
        0x74 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x13 -> :sswitch_3d
        0x2d -> :sswitch_37
        0x32 -> :sswitch_3e
        0xdfb -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_40
        0x3e -> :sswitch_41
        0x5f -> :sswitch_37
        0x7c -> :sswitch_42
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_43
        0x36 -> :sswitch_44
        0x57 -> :sswitch_37
        0x74 -> :sswitch_45
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x11 -> :sswitch_46
        0x5bb -> :sswitch_34
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_49
        0x36 -> :sswitch_4a
        0x55 -> :sswitch_0
        0x17dd84 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_4c
        0x2d -> :sswitch_0
        0x6f -> :sswitch_4d
        0x1cc -> :sswitch_4e
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_4f
        0x55 -> :sswitch_0
        0x76 -> :sswitch_50
        0xb4 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_52
        0x537 -> :sswitch_54
        0x5c8 -> :sswitch_0
        0x5e9 -> :sswitch_53
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_55
        0x53 -> :sswitch_0
        0x72 -> :sswitch_56
        0x1b4 -> :sswitch_57
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_58
        0x53 -> :sswitch_0
        0x72 -> :sswitch_59
        0xd29 -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_5b
        0x2d -> :sswitch_0
        0x73 -> :sswitch_5c
        0xcc -> :sswitch_5d
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_5e
        0x55 -> :sswitch_0
        0x72 -> :sswitch_5f
        0x1b4 -> :sswitch_60
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_61
        0x2c8 -> :sswitch_0
        0x2e9 -> :sswitch_62
        0x52b -> :sswitch_63
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_64
        0x2f -> :sswitch_0
        0x71 -> :sswitch_65
        0xcc -> :sswitch_66
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_67
        0x76 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_69
        0x35 -> :sswitch_82
        0x77 -> :sswitch_6a
        0x1fd4 -> :sswitch_6b
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_6c
        0x2d -> :sswitch_82
        0x6f -> :sswitch_6d
        0xcc -> :sswitch_6e
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_6f
        0x32f -> :sswitch_71
        0x3c8 -> :sswitch_75
        0x3e9 -> :sswitch_70
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_72
        0x33 -> :sswitch_75
        0x71 -> :sswitch_73
        0x7cc -> :sswitch_74
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x11 -> :sswitch_77
        0x53 -> :sswitch_7b
        0x72 -> :sswitch_78
        0x329 -> :sswitch_79
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_76
        0x73 -> :sswitch_7a
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_7c
        0x2d -> :sswitch_80
        0x73 -> :sswitch_7d
        0xfcc -> :sswitch_7e
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x13 -> :sswitch_7f
        0x2e9 -> :sswitch_80
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x16 -> :sswitch_83
        0x37 -> :sswitch_89
        0x71 -> :sswitch_84
        0xd4 -> :sswitch_85
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0xe -> :sswitch_86
        0x2f -> :sswitch_81
        0x71 -> :sswitch_87
        0x559 -> :sswitch_88
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0x1e -> :sswitch_8a
        0x3d -> :sswitch_8e
        0x7f -> :sswitch_8b
        0x1dc -> :sswitch_8c
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0x16 -> :sswitch_81
        0x77 -> :sswitch_8d
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x6f -> :sswitch_8f
        0x3d57 -> :sswitch_91
        0x3d99 -> :sswitch_90
        0x3db8 -> :sswitch_81
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x12 -> :sswitch_92
        0x33 -> :sswitch_9b
        0x71 -> :sswitch_93
        0x1d4 -> :sswitch_94
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x12 -> :sswitch_95
        0x33 -> :sswitch_9a
        0x71 -> :sswitch_96
        0x57ac -> :sswitch_97
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x11 -> :sswitch_98
        0x32 -> :sswitch_99
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_9c
        0x32 -> :sswitch_81
    .end sparse-switch
.end method

.method private static final scanNodeForUber$lambda$17$lambda$16(II)V
    .locals 0

    invoke-static {p0, p1}, Lo2/۟ۤۨۡۥ;->۟ۧۡۦ۠(II)V

    return-void
.end method

.method private final updatePreferences()V
    .locals 10

    const/16 v4, 0x70a

    const/16 v3, 0x6cc

    const/16 v2, 0x10

    const/4 v9, 0x0

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۣۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v5

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x65c

    sget v6, Lx0/ۣ۠۟۠;->۟۠ۨ۠ۢ:I

    xor-int/lit16 v6, v6, 0x15b

    const/16 v7, 0x47f

    invoke-static {v0, v1, v6, v7}, La7/۠ۢۧ;->ۦۣۧۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v9}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    nop

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x66b

    sget v6, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->۟ۦۧۨۤ:I

    xor-int/lit16 v6, v6, -0x3c0

    const/16 v7, 0x1ba

    invoke-static {v0, v1, v6, v7}, Lk8/ۣ۠ۨۤ;->ۣۤۤ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x673

    sget v7, Lcom/google/android/gms/common/api/internal/ۣ۟ۨۡۥ;->ۣۣ۟۟ۡ:I

    xor-int/lit16 v7, v7, -0x30b

    const/16 v8, 0x191

    invoke-static {v0, v6, v7, v8}, Lg/۟ۧ۠ۤ;->۟۠۟۠۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v1, v0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۣۣ۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v3, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    move v3, v4

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    move-object v0, v1

    :sswitch_8
    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->۟ۡۦ۟ۥ(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v1

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {v1}, Ln9/ۤۧۧۤ;->ۣۣۧ۠(Ljava/lang/Object;)I

    move-result v0

    const v1, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minFare:I

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x675

    sget v3, Lm1/۟ۧۥ۟ۨ;->۟ۤۢۤۧ:I

    xor-int/lit16 v3, v3, -0x2c8

    const/16 v6, 0x570

    invoke-static {v0, v1, v3, v6}, Landroid/os/ۣۣ۟ۤۨ;->ۡۦۡۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v3, 0x67d

    sget v6, Laa/ۣۣ۟۟;->ۦۣۨۡ:I

    xor-int/lit16 v6, v6, 0x167

    const/16 v7, 0x7d8

    invoke-static {v0, v3, v6, v7}, Lcom/google/firebase/iid/ۣۨۥۣ;->ۣۣۣۡ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v1, v0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۣۣ۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const v3, 0xc202

    :goto_6
    const v6, 0xc213

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_5

    goto :goto_6

    :sswitch_d
    if-nez v1, :cond_3

    const v3, 0xc25f

    goto :goto_6

    :sswitch_e
    const v1, 0xbf1a

    goto :goto_4

    :sswitch_f
    const/16 v0, 0x32

    goto :goto_5

    :cond_3
    :sswitch_10
    const v3, 0xc240

    goto :goto_6

    :sswitch_11
    const v1, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :goto_8
    :sswitch_12
    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->۟ۡۦ۟ۥ(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v1

    const v0, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_13
    if-eqz v1, :cond_4

    const v0, 0xc5e2

    goto :goto_9

    :sswitch_14
    const v1, 0xc29d

    goto :goto_7

    :sswitch_15
    move-object v0, v1

    goto :goto_8

    :cond_4
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_17
    invoke-static {v1}, Ln9/ۤۧۧۤ;->ۣۣۧ۠(Ljava/lang/Object;)I

    move-result v0

    const v1, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    const v1, 0xc620

    goto :goto_a

    :sswitch_19
    const/16 v0, 0x1f4

    :sswitch_1a
    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxFare:I

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۧۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-static {}, Lq0/ۥۣۡۧ;->ۥ۠۠ۢ()Lr8/r;

    move-result-object v1

    const v0, 0xc67d

    :goto_b
    const v6, 0xc68e

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_5
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-eqz v3, :cond_5

    const v0, 0xc965

    goto :goto_b

    :sswitch_1d
    :try_start_0
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x680

    sget v7, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۣۧۡۨ:I

    xor-int/lit16 v7, v7, 0x341

    const/16 v8, 0x987

    invoke-static {v0, v6, v7, v8}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۥۣۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->distanceFilterEnabled:Z

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x69b

    sget v7, Lu4/۟ۡۢۦۣ;->۠ۧۢۡ:I

    xor-int/lit16 v7, v7, -0x38b

    const/16 v8, 0x2cf

    invoke-static {v0, v6, v7, v8}, Lfa/ۣ۟ۥۤ;->ۣ۟ۨۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Lz0/ۣ۟۠ۤ۟;->ۣۣۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)F

    move-result v0

    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minPickupKm:F

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x6ac

    sget v7, Lp0/۟ۢۤۧ;->۟ۢ۠ۦۦ:I

    xor-int/lit16 v7, v7, -0x34c

    const/16 v8, 0x594

    invoke-static {v0, v6, v7, v8}, Lz7/۟۟ۨۢۢ;->ۨ۠۟ۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const/high16 v6, 0x42480000    # 50.0f

    invoke-static {v3, v0, v6}, Lz0/ۣ۟۠ۤ۟;->ۣۣۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)F

    move-result v0

    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxPickupKm:F

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x6bd

    sget v7, Lcom/google/firebase/analytics/connector/ۣ۟ۢۢ۟;->ۦۥۧۤ:I

    xor-int/lit16 v7, v7, 0x3b0

    const/16 v8, 0x43f

    invoke-static {v0, v6, v7, v8}, Ll8/ۣ۟ۧۢ۠;->ۣۧ۠۠([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Lz0/ۣ۟۠ۤ۟;->ۣۣۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)F

    move-result v0

    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minDropKm:F

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x6cc

    sget v7, Lfa/ۦۣۡۢ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v7, v7, 0x326

    const/16 v8, 0xb8c

    invoke-static {v0, v6, v7, v8}, Lz3/۟ۢۢ۟ۢ;->ۣۣۥۦ([SIII)Ljava/lang/String;

    move-result-object v0

    const/high16 v6, 0x42c80000    # 100.0f

    invoke-static {v3, v0, v6}, Lz0/ۣ۟۠ۤ۟;->ۣۣۡۨ(Ljava/lang/Object;Ljava/lang/Object;F)F

    move-result v0

    iput v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxDropKm:F

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x6db

    sget v7, Laa/ۣۣ۟۟;->ۦۣۨۡ:I

    xor-int/lit16 v7, v7, 0x17f

    const/16 v8, 0x462

    invoke-static {v0, v6, v7, v8}, Lr1/۟ۤۤۡ۠;->ۣۢۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilterEnabled:Z

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v6, 0x6f6

    sget v7, Le2/۟۟ۥۦ;->۟ۢ۠ۨۥ:I

    xor-int/lit16 v7, v7, -0x2e1

    const/16 v8, 0xb5d

    invoke-static {v0, v6, v7, v8}, Lq5/۟ۥۣۢۨ;->ۣ۟۟۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۣۣ۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v0, 0xc984

    :goto_c
    const v6, 0xc995

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_1e
    if-eqz v3, :cond_6

    const v0, 0xc9e1

    goto :goto_c

    :cond_6
    :sswitch_1f
    const v0, 0xc9c2

    goto :goto_c

    :sswitch_20
    invoke-static {v3}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v6

    const v0, 0xca00

    :goto_d
    const v7, 0xca11

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_7
    :sswitch_21
    const v0, 0xca3e

    goto :goto_d

    :sswitch_22
    if-nez v6, :cond_7

    const v0, 0xca5d

    goto :goto_d

    :sswitch_23
    const v0, 0xca7c

    :goto_e
    const v3, 0xca8d

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    const v0, 0xcd26

    goto :goto_e

    :sswitch_25
    new-instance v0, Lz4/c;

    invoke-direct {v0}, Lz4/c;-><init>()V

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣۥۧۤ(Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v0

    new-instance v6, Lp7/n;

    invoke-direct {v6}, Lp7/n;-><init>()V

    invoke-static {v6, v3, v0}, Lh5/ۢ۠۠۟;->۟۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const v3, 0xcd83

    :goto_f
    const v6, 0xcd94

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_d

    goto :goto_f

    :sswitch_26
    if-nez v0, :cond_8

    const v3, 0xcde0

    goto :goto_f

    :cond_8
    :sswitch_27
    const v3, 0xcdc1

    goto :goto_f

    :sswitch_28
    move-object v0, v1

    :sswitch_29
    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilters:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xcdff

    :goto_10
    const v1, 0xce10

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_e

    goto :goto_10

    :goto_11
    :sswitch_2a
    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟۠ۡ۠()Lcom/auto/accept/data/model/SupportedApp$Companion;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۡۡۤۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟ۧ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll8/ۣ۟ۧۢ۠;->۟ۡۤۧۡ(I)I

    move-result v1

    const v3, 0xd182

    :goto_12
    const v6, 0xd193

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_f

    goto :goto_12

    :sswitch_2b
    if-ge v1, v2, :cond_9

    const v3, 0xd1df

    goto :goto_12

    :sswitch_2c
    const v0, 0xce1e

    goto :goto_10

    :catch_0
    move-exception v0

    iput-boolean v9, p0, Lcom/auto/accept/service/RideAcceptorService;->distanceFilterEnabled:Z

    iput-boolean v9, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilterEnabled:Z

    iput-object v1, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilters:Ljava/util/List;

    const v0, 0xd106

    :goto_13
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_10

    goto :goto_13

    :sswitch_2d
    const v0, 0xd125

    goto :goto_13

    :sswitch_2e
    iput-boolean v9, p0, Lcom/auto/accept/service/RideAcceptorService;->distanceFilterEnabled:Z

    iput-boolean v9, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilterEnabled:Z

    iput-object v1, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilters:Ljava/util/List;

    goto :goto_11

    :cond_9
    :sswitch_2f
    const v3, 0xd1c0

    goto :goto_12

    :sswitch_30
    move v1, v2

    :sswitch_31
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v0}, Lt3/ۣ۟ۧۡ;->۟۠ۨۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_32
    invoke-static {v1}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xd1fe

    :goto_14
    const v6, 0xd20f

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_11

    goto :goto_14

    :sswitch_33
    if-eqz v3, :cond_a

    const v0, 0xd4e6

    goto :goto_14

    :cond_a
    :sswitch_34
    const v0, 0xd4c7

    goto :goto_14

    :sswitch_35
    invoke-static {v1}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/auto/accept/data/model/SupportedApp;

    invoke-static {v0}, Lw5/ۣۨۧ۠;->۟۠۠۟ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0}, Lw5/ۣۨۧ۠;->۟۠۠۟ۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v7

    sget v8, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟۠ۦۤ۠:I

    xor-int/lit16 v8, v8, 0x97

    const/16 v9, 0x1dd

    invoke-static {v7, v4, v8, v9}, Lx7/۟ۤۡ۟ۦ;->ۦۥۡۦ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x1

    invoke-static {v5, v0, v6}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v2, v3, v0}, Ld1/۟۟ۥۡۡ;->۟ۤۧۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0xd505

    :goto_15
    const v3, 0xd516

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_12

    goto :goto_15

    :sswitch_36
    const v0, 0xd524

    goto :goto_15

    :sswitch_37
    iput-object v2, p0, Lcom/auto/accept/service/RideAcceptorService;->perAppSettings:Ljava/util/Map;

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦۢ۠ۧ(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۡۡۡ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۨۤۦۧ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۥۡۡۨ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v5

    const/16 v6, 0x716

    sget v7, Landroidx/annotation/۟ۥۥۣۨ;->۟ۧۦۣۦ:I

    xor-int/lit16 v7, v7, -0x24c

    const/16 v8, 0x228

    invoke-static {v5, v6, v7, v8}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->۟ۡۢۥۣ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v0}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟ۥۤۦ(Ljava/lang/Object;Z)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v5, 0x720

    sget v6, Lr2/۠ۨۦۢ;->۠ۥۨۡ:I

    xor-int/lit16 v6, v6, 0x393

    const/16 v7, 0x2b2

    invoke-static {v0, v5, v6, v7}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۢ۟۟ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x72a

    sget v5, Lf/۟ۤۧ۠ۡ;->ۣۡۡۡ:I

    xor-int/lit16 v5, v5, -0x2dc

    const/16 v6, 0xa32

    invoke-static {v0, v1, v5, v6}, Lq5/۟ۥۣۢۨ;->ۣ۟۟۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v2}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۣ۟ۧۨ(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x72c

    sget v2, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۧ۠ۡ۟:I

    xor-int/lit16 v2, v2, -0x328

    const/16 v5, 0xcab

    invoke-static {v0, v1, v2, v5}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۨۦۦ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4, v3}, Ld1/ۣۣ۟ۢۨ;->۟ۤۤۧۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x734

    sget v2, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۤۤۦۥ:I

    xor-int/lit16 v2, v2, -0x15b

    const/16 v3, 0x4d2

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->ۣۡۤۤ([SIII)Ljava/lang/String;

    :sswitch_38
    invoke-static {}, Lw5/ۢۤۢ۠;->ۣۢۧۨ()I

    move-result v1

    const v0, 0xd581

    :goto_16
    const v2, 0xd592

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_13

    goto :goto_16

    :sswitch_39
    if-ltz v1, :cond_b

    const v0, 0xd869

    goto :goto_16

    :cond_b
    :sswitch_3a
    const v0, 0xd5bf

    goto :goto_16

    :sswitch_3b
    const-string v0, "zM8zUUkycRI8WM4f2R"

    invoke-static {v0}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->۠ۥۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_3c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_38
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_13
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_2e
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_28
        0x74 -> :sswitch_20
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_25
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_28
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_27
        0x55 -> :sswitch_29
        0x74 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_2a
        0x3ef -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2b
        0x32 -> :sswitch_2f
        0x4c -> :sswitch_30
        0x53 -> :sswitch_31
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2a
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_33
        0x6a7 -> :sswitch_34
        0x6c8 -> :sswitch_37
        0x6e9 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_39
        0x2d -> :sswitch_3c
        0x32 -> :sswitch_3a
        0xdfb -> :sswitch_3b
    .end sparse-switch
.end method

.method public static ۟۟ۦۦۥ(Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->۠ۧۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaFare:D

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟ۦۦۧ(Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Lw4/۟ۤ۠۟ۨ;->۟ۦۤۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaTip:D

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۠۟ۨ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lt2/۟ۦۣۡۤ;->ۣ۟ۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastBroadcastTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۢۦ۠(Ljava/lang/Object;IZ)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->ۧۡۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    invoke-direct {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->broadcastFareDetected(IZ)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۥۢۤ()[S
    .locals 2

    invoke-static {}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۤۦۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۠ۧۢ(Ljava/lang/Object;)Landroid/content/SharedPreferences;
    .locals 2

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->encryptedPrefs:Landroid/content/SharedPreferences;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۡۡ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۧۦۨ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minFare:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Ld9/ۧۧۨۥ;->۠ۦۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilterEnabled:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۡۦ۠ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;)V
    .locals 6

    invoke-static {}, Lz0/ۣ۟۠ۤ۟;->ۣ۟ۡۤۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lcom/auto/accept/service/RideAcceptorService;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v5, p5

    check-cast v5, Ljava/lang/String;

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/auto/accept/service/RideAcceptorService;->logHistoryIfNew(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۦۦۡ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->ۦۧ۟ۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->findClickableAncestor(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۢۨۥۤ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    invoke-direct {p0}, Lcom/auto/accept/service/RideAcceptorService;->updatePreferences()V

    :sswitch_3
    invoke-static {}, Lh7/ۣ۟ۤ۠۠;->ۧ۠ۨۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "0tT6XcKEqIko9kqAvrtVaR"

    invoke-static {v0}, Lt2/۟ۢ۟ۢ۟;->ۣ۟۟ۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۢۤ۠(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Ld3/ۡۨۢۦ;->۟ۢۧۦۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedPlanExpiry:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۢۧۥ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۟ۤۨۢۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxPickupKm:F

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۦ۠ۦ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۥۤۨۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->globalAcceptCooldown:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۦۨۦ(Ljava/lang/Object;)Ljava/util/regex/Pattern;
    .locals 2

    invoke-static {}, Lu/ۣۤۧ۠;->ۣۨۧۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->numberPattern:Ljava/util/regex/Pattern;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۤۡ۠(Ljava/lang/Object;DDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 15

    invoke-static {}, Lc7/۟ۦۣۢۦ;->۟ۦۨۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v1, p0

    check-cast v1, Lcom/auto/accept/service/RideAcceptorService;

    move-object/from16 v10, p9

    check-cast v10, Ljava/util/List;

    move-object/from16 v11, p10

    check-cast v11, Landroid/view/accessibility/AccessibilityNodeInfo;

    move-object/from16 v12, p11

    check-cast v12, Landroid/view/accessibility/AccessibilityNodeInfo;

    move-object/from16 v13, p12

    check-cast v13, Ljava/lang/String;

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    invoke-direct/range {v1 .. v13}, Lcom/auto/accept/service/RideAcceptorService;->processRideDecision(DDDDLjava/util/List;Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/core/content/ۣۣۣ۟;->ۣۢۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "y7J7oZHp3PrAa23P3SoBT1t"

    invoke-static {v0}, Lq0/۟ۧۤۧ;->ۦۨۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lf0/ۣۦۦ۠;->۟ۥۥۣۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    check-cast p2, Lcom/auto/accept/data/model/SupportedApp;

    invoke-direct {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->routeToScanner(Landroid/view/accessibility/AccessibilityNodeInfo;Lcom/auto/accept/data/model/SupportedApp;)V

    :sswitch_3
    invoke-static {}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۢۨۨۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "6uIuv"

    invoke-static {v0}, Lv0/۟ۦۣ۟ۤ;->ۨۧ۟ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/firestore/ktx/ۢ۠ۢۧ;->ۣۢۥۧ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeForRapido(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :sswitch_3
    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "TaiBPCIMjUAI4f1"

    invoke-static {v0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥۡۤۡ(Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->۟ۦۣۧۧ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaDropDist:D

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۣ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 2

    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟ۤۨۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Ljava/util/List;

    check-cast p2, Landroid/graphics/Rect;

    invoke-direct {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->findRejectButton(Ljava/util/List;Landroid/graphics/Rect;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Le1/۟ۢ۟ۤۡ;->ۡۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lc9/c;

    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->processRideDecision$lambda$19(Lc9/c;Ljava/lang/Object;)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۤۦۡ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟ۢۤۡ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastOlaCacheTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧ۟ۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeForOla(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۟ۧۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/preference/۟ۤۥۦۧ;->ۣۡۡۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->distanceFilterEnabled:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۦۧۥ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۣۢۡۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaAddresses:Ljava/util/List;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۨۡ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lt0/ۣ۟۠ۡۢ;->۟ۤۤۦۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minPickupKm:F

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠۟ۡۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lg7/۠ۤۧ;->ۨ۟ۥۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->isTapBurstRunning:Z

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۢۥۨ(Ljava/lang/Object;)Landroid/os/PowerManager$WakeLock;
    .locals 2

    invoke-static {}, Lc4/۟ۦۧۦۤ;->ۡ۟۟ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠ۢۧ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lc6/۟ۧۧ۠ۤ;->ۣۥۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/media/ToneGenerator;

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->executeAccept$lambda$27$lambda$26(Landroid/media/ToneGenerator;)V

    :sswitch_3
    invoke-static {}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۠ۥۧۢ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "ut1ouILRTC"

    invoke-static {v0}, Lcom/google/firebase/tracing/ۢۤۡۨ;->ۣۧ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۠ۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lk2/۟ۢۦۤۤ;->۟ۦۣۤ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢ۠۟ۤ(Ljava/lang/Object;)Lz4/g;
    .locals 2

    invoke-static {}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۧ۟ۥۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->rideHistoryManager:Lz4/g;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۢۧۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۥۡۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    check-cast p2, Ljava/util/List;

    invoke-direct {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->fetchIterableNodes(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V

    :sswitch_3
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤۤ۟ۦ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "eFyCWf"

    invoke-static {v0}, Ld9/ۣ۟۠ۢۡ;->۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۦۣ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->۟ۦۣۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityEvent;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->handleEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣۤۢ(Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 2

    invoke-static {}, Landroidx/core/content/ۣۣۣ۟;->ۣۢۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->evaluatedOrders:Ljava/util/LinkedHashMap;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۥۣۧ(Ljava/lang/Object;Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Lx8/ۢۨۥۨ;->۟۟ۢ۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->extractDistance(Ljava/lang/String;)D

    move-result-wide v0

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣۣۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;
    .locals 2

    invoke-static {}, Ln7/۟ۡۢۦ;->۠ۧۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->sharedPrefs:Landroid/content/SharedPreferences;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۢۤ۠(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastPlanExpiryCheckTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۥۧۢ(Ljava/lang/Object;Ljava/lang/Object;DDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

    invoke-static {}, Ln7/۟ۤ۠۟ۥ;->۠ۦۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lcom/auto/accept/service/RideAcceptorService;

    move-object v1, p1

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo;

    move-object/from16 v6, p6

    check-cast v6, Ljava/lang/String;

    move-object/from16 v7, p7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v8, p8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v9, p9

    check-cast v9, Ljava/lang/String;

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v9}, Lcom/auto/accept/service/RideAcceptorService;->executeAccept(Landroid/view/accessibility/AccessibilityNodeInfo;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۟۠ۦۤ۠()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "vfoKIxNgJXoFwq3veJjQBqG"

    invoke-static {v0}, Lr2/۠ۨۦۢ;->ۨۤۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۦۨۤ()V
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->executeAccept$lambda$27()V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥ۠ۡ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lm4/۟ۧۤ۠;->ۨ۟ۦ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastHistoryOrderId:Ljava/lang/String;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۡۡۨ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 2

    invoke-static {}, Lk1/ۨ۟ۧۡ;->۟ۤ۟ۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->perAppSettings:Ljava/util/Map;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۣۦۦ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lg3/۟ۥۣۣۥ;->۟ۤۡۧۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->locationFilters:Ljava/util/List;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۣۨۥ(II)V
    .locals 2

    invoke-static {}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۣ۟ۥۧۧ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeForUber$lambda$17$lambda$16(II)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۤۧۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lp8/۟۟ۢ۟ۢ;->۟ۤۡ۠۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeForUber(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦ۟ۨۧ(IILjava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p2, Lcom/auto/accept/service/RideAcceptorService;

    invoke-static {p0, p1, p2}, Lcom/auto/accept/service/RideAcceptorService;->executeAccept$lambda$24(IILcom/auto/accept/service/RideAcceptorService;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦ۠ۥ۟(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lp8/ۡۤ;->ۦ۠ۢۧ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lcom/auto/accept/service/RideAcceptorService;->minDropKm:F

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦ۠ۨۤ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣ۟۟۠ۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastUberBlindFireTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۢ۠ۧ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Lc3/۟ۡۧۢۥ;->۟ۧ۟ۤۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0


    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    :try_start_0
    invoke-static {p0}, Lcom/ride/accepter/licence/LicenceGate;->engineGateOk(Landroid/content/Context;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_gate

    if-eqz v0, :lic_off

    iget-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    goto :sswitch_3

    :lic_off
    const/4 v0, 0x0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :catch_gate
    iget-boolean v0, p0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    goto :sswitch_3

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۣ۟۟(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Lz3/۟ۢۢ۟ۢ;->۟۠ۨ۠۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxDropKm:F

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۣۨۦ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lh3/ۣ۠ۡۨ;->ۥۥ۟ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastScanTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;)Lcom/auto/accept/data/model/SupportedApp;
    .locals 2

    invoke-static {}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۣۣ۟۟۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->findTrackedApp(Ljava/lang/String;)Lcom/auto/accept/data/model/SupportedApp;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۦۦۥ۠(IILjava/lang/Object;J)V
    .locals 3

    invoke-static {}, Lh7/ۥۥۢ۟;->ۦ۠ۤۤ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3, p4}, Lcom/auto/accept/service/RideAcceptorService;->executeAccept$lambda$25(IILjava/lang/String;J)V

    :sswitch_3
    invoke-static {}, Lv8/۟ۧۢ۟ۢ;->ۨۥۦۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "OiS37UrQmJD"

    invoke-static {v0}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۠ۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۤۦۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->ۧۦۦۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget v0, p0, Lcom/auto/accept/service/RideAcceptorService;->maxFare:I

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۦۣۤ(Ljava/lang/Object;)J
    .locals 3

    invoke-static {}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->ۣ۟ۤۢۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->lastHistoryLogTime:J

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۦۣۧ(Ljava/lang/Object;)D
    .locals 3

    invoke-static {}, Lc3/۟ۥ۠ۡۧ;->۟ۥ۠ۨۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lcom/auto/accept/service/RideAcceptorService;

    iget-wide v0, p0, Lcom/auto/accept/service/RideAcceptorService;->cachedOlaPickupDist:D

    :sswitch_3
    return-wide v0

    :sswitch_4
    const-wide/16 v0, 0x0

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v2, 0x6eb

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.field public static volatile foregroundPackage:Ljava/lang/String;
.field public static volatile overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

.method public static isOverlayTargetEnabled()Z
    .locals 1

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :off

    iget-boolean v0, v0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    return v0

    :off
    const/4 v0, 0x0

    return v0
.end method

.field public static volatile detectOnly:Z = true

.method public static setDetectOnly(Z)V
    .locals 2

    sput-boolean p0, Lcom/auto/accept/service/RideAcceptorService;->detectOnly:Z

    const-string v0, "RideToggle"

    if-eqz p0, :off

    const-string v1, "DETECT MODE -> ON (log only)"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :off
    const-string v1, "DETECT MODE -> OFF (live)"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static getEngineEnabled()Z
    .locals 1

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :off

    iget-boolean v0, v0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    return v0

    :off
    const/4 v0, 0x0

    return v0
.end method

.method public static getDetectOnly()Z
    .locals 1

    sget-boolean v0, Lcom/auto/accept/service/RideAcceptorService;->detectOnly:Z

    return v0
.end method

.field public static volatile minFare:D = 0.0

.field public static volatile maxFare:D = 100000.0

.field public static volatile minPickup:D = 0.0

.field public static volatile maxPickup:D = 1000.0

.field public static volatile minDrop:D = 0.0

.field public static volatile maxDrop:D = 1000.0

.field public static volatile fareFilterOn:Z

.field public static volatile distanceFilterOn:Z

.field public static volatile lastFare:I

.method public static setFilters(DDDD)V
    .locals 0

    sput-wide p0, Lcom/auto/accept/service/RideAcceptorService;->minFare:D

    sput-wide p2, Lcom/auto/accept/service/RideAcceptorService;->maxFare:D

    sput-wide p4, Lcom/auto/accept/service/RideAcceptorService;->maxPickup:D

    sput-wide p6, Lcom/auto/accept/service/RideAcceptorService;->maxDrop:D

    return-void
.end method

.method public static setFilterFlags(ZZ)V
    .locals 0

    sput-boolean p0, Lcom/auto/accept/service/RideAcceptorService;->fareFilterOn:Z

    sput-boolean p1, Lcom/auto/accept/service/RideAcceptorService;->distanceFilterOn:Z

    return-void
.end method

.method public static getFilterSummary()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "minFare="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v1, Lcom/auto/accept/service/RideAcceptorService;->minFare:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " maxFare="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v1, Lcom/auto/accept/service/RideAcceptorService;->maxFare:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " maxPickup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v1, Lcom/auto/accept/service/RideAcceptorService;->maxPickup:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " maxDrop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-wide v1, Lcom/auto/accept/service/RideAcceptorService;->maxDrop:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.field public static volatile alertOnAccept:Z = true

.method public static setAlertOnAccept(Z)V
    .locals 0

    sput-boolean p0, Lcom/auto/accept/service/RideAcceptorService;->alertOnAccept:Z

    return-void
.end method

.method public static setServiceEnabled(Z)V
    .locals 2

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :done

    iput-boolean p0, v0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    iget-object v1, v0, Lcom/auto/accept/service/RideAcceptorService;->sharedPrefs:Landroid/content/SharedPreferences;

    if-eqz v1, :log

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v0, "service_enabled"

    invoke-interface {v1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :log
    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    const-string v1, "RideToggle"

    if-eqz p0, :off

    const-string v0, "ENGINE -> ON"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :off
    const-string v0, "ENGINE -> OFF"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :done
    return-void
.end method

.method public static setAppEnabled(Ljava/lang/String;Z)V
    .locals 3

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :done

    iget-object v1, v0, Lcom/auto/accept/service/RideAcceptorService;->sharedPrefs:Landroid/content/SharedPreferences;

    if-eqz v1, :done

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "app_enabled_"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    invoke-direct {v0}, Lcom/auto/accept/service/RideAcceptorService;->updatePreferences()V

    :done
    return-void
.end method

.method public static settingsLocationFilters(Ljava/lang/String;Z)V
    .locals 5

    const-string v3, "AcceptPro-Test"

    const-string v4, "zone-sync: begin"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :tryCtx

    move-object v1, v0

    goto :haveCtx

    :tryCtx
    sget-object v1, Lcom/auto/accept/service/RideAcceptorService;->uiCtx:Landroid/content/Context;

    if-eqz v1, :noCtx

    :haveCtx
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zone-sync: enabledArg="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AcceptPro-Test"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lz4/b;

    invoke-direct {v2, v1}, Lz4/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, p0}, Lz4/b;->b(Ljava/lang/String;)V

    invoke-virtual {v2}, Lz4/b;->a()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "sec_location_filter_enabled"

    invoke-interface {v2, v3, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    if-eqz v0, :skipReload

    invoke-direct {v0}, Lcom/auto/accept/service/RideAcceptorService;->updatePreferences()V

    :skipReload
    const-string v3, "AcceptPro-Test"

    const-string v4, "zone-sync: rules written"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :done

    :noCtx
    const-string v3, "AcceptPro-Test"

    const-string v4, "zone-sync: no context"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :done
    return-void
.end method

.method public static testZoneEngine(Ljava/lang/String;)V
    .locals 14

    const-string v13, "AcceptPro-Test"

    const-string v12, "probe: begin"

    invoke-static {v13, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :noTarget

    invoke-direct {v0}, Lcom/auto/accept/service/RideAcceptorService;->updatePreferences()V

    const-class v1, Lz4/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AcceptPro-Test"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "loc-enabled="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, v0, Lcom/auto/accept/service/RideAcceptorService;->locationFilterEnabled:Z

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AcceptPro-Test"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "loc-filters="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v0, Lcom/auto/accept/service/RideAcceptorService;->locationFilters:Ljava/util/List;

    if-eqz v1, :nullList

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :afterList

    :nullList
    const-string v3, "null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :afterList
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "AcceptPro-Test"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-boolean v13, Lcom/auto/accept/service/RideAcceptorService;->detectOnly:Z

    const/4 v1, 0x1

    sput-boolean v1, Lcom/auto/accept/service/RideAcceptorService;->detectOnly:Z

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide v1, 0x4059000000000000L

    const-wide/16 v3, 0x0

    const-wide v5, 0x4014000000000000L

    const-wide v7, 0x4014000000000000L

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "AcceptPro Test"

    invoke-direct/range {v0 .. v12}, Lcom/auto/accept/service/RideAcceptorService;->processRideDecision(DDDDLjava/util/List;Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    sput-boolean v13, Lcom/auto/accept/service/RideAcceptorService;->detectOnly:Z

    const-string v1, "AcceptPro-Test"

    const-string v2, "probe: engine decision done"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :done

    :noTarget
    const-string v1, "AcceptPro-Test"

    const-string v2, "probe: no service target"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :done
    return-void
.end method

.method public static toggleFromOverlay()V
    .locals 2

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :done

    iget-boolean v1, v0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    :done
    return-void
.end method

.method private static toggleFromUi(Landroid/view/accessibility/AccessibilityEvent;Lcom/auto/accept/service/RideAcceptorService;)V
    .locals 2
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v1

    const-string v0, "RideToggle"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I


    if-eqz p0, :done

    if-eqz p1, :done

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :done

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :done

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.ride.accepter"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :done

    iget-boolean v0, p1, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p1, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    iget-object v1, p1, Lcom/auto/accept/service/RideAcceptorService;->sharedPrefs:Landroid/content/SharedPreferences;

    if-eqz v1, :done

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string p0, "service_enabled"

    invoke-interface {v1, p0, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :done
    return-void
.end method

.method public onAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 6
    invoke-static {p1, p0}, Lcom/auto/accept/service/RideAcceptorService;->toggleFromUi(Landroid/view/accessibility/AccessibilityEvent;Lcom/auto/accept/service/RideAcceptorService;)V

    if-eqz p1, :nofg

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getPackageName()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :nofg

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->foregroundPackage:Ljava/lang/String;

    :nofg

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۦۢ۠ۧ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    :try_start_0
    invoke-static {p0, p1}, Lcom/auto/accept/service/RideAcceptorService;->ۣ۟ۦۣ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_8
    return-void

    :sswitch_9
    const v0, 0xbe9e

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x740

    sget v4, Lf1/ۥۦ۟ۥ;->۟ۥ۠ۥ:I

    xor-int/lit16 v4, v4, 0x1a9

    const/16 v5, 0x7f7

    invoke-static {v2, v3, v4, v5}, Lt2/۟ۦۢۡۧ;->ۣۣۥۣ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x74d

    sget v2, Lcom/google/firebase/remoteconfiginterop/۟ۤۢۧ;->ۣۣۤۤ:I

    xor-int/lit16 v2, v2, -0x1a9

    const/16 v3, 0x27e

    invoke-static {v0, v1, v2, v3}, Ldagger/hilt/components/۟ۦۣۤۤ;->ۣ۠۠۟([SIII)Ljava/lang/String;

    goto :goto_4

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_9
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 5

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    :try_start_0
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->۠ۢۥۨ(Ljava/lang/Object;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟ۥ۟۠ۥ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v1}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->۟ۡ۠ۤ(Ljava/lang/Object;)V

    :sswitch_6
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->wakeLock:Landroid/os/PowerManager$WakeLock;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_7
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۣۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {v1, p0}, Lf6/ۣۣۣۣ۟;->ۥۨۡ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_b
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x759

    sget v3, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۥۤۤ:I

    xor-int/lit16 v3, v3, -0xd2

    const/16 v4, 0x800

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/iid/ۣۨۥۣ;->ۣۣۣۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x777

    sget v3, Lg8/ۣۣۣ۟;->۟ۢ۟ۥ:I

    xor-int/lit16 v3, v3, -0x3bc

    const/16 v4, 0x6bc

    invoke-static {v1, v2, v3, v4}, Lh4/۟ۧۢۡۦ;->ۣ۟ۡۨۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lh4/ۣ۟ۢۢۡ;->۟ۥ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/Intent;

    invoke-static {p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Li/ۢۥۣ۟;->۟ۥۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x780

    sget v2, Lcom/google/firebase/iid/ۥۣۣۡ;->ۢۤۧۥ:I

    xor-int/lit16 v2, v2, -0x99

    const/16 v3, 0x6e5

    invoke-static {v0, v1, v2, v3}, Lz8/ۣۤۡۧ;->۟ۥ۠۠۠([SIII)Ljava/lang/String;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x78c

    sget v2, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۣۧ۠ۡ:I

    xor-int/lit16 v2, v2, 0xaf

    const/16 v3, 0x92e

    invoke-static {v0, v1, v2, v3}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۨۤۧۦ([SIII)Ljava/lang/String;

    invoke-static {}, Lh/۟ۡۥۡۧ;->ۣۡۥ۟()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_3

    :sswitch_d
    if-ltz v1, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_e
    const-string v0, "Rm4nVF3C45VWi3XiOvR2"

    invoke-static {v0}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->ۦ۠ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_f
    return-void

    :catch_0
    move-exception v0

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_10
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_f
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_7
        0x1f7 -> :sswitch_10
    .end sparse-switch
.end method

.method public onInterrupt()V
    .locals 5

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e0"

    move v2, v3

    move v4, v3

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const-string v1, "\u06e4\u06e4\u06e5"

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x7a0

    const/16 v3, 0x8c0

    invoke-static {v0, v1, v4, v3}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->ۦۨۨ۟([SIII)Ljava/lang/String;

    const-string v1, "\u06e1\u06e2\u06e5"

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v3, v2, 0x158

    const-string v1, "\u06df\u06e5\u06e2"

    move v4, v3

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v3, v2, -0x342

    const-string v1, "\u06e3\u06e4\u06e5"

    move v4, v3

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const-string v1, "\u06e0\u06e0\u06e4"

    goto :goto_0

    :sswitch_4
    sget v2, Lv5/ۥۧ۟ۦ;->۠۟ۨۢ:I

    const-string v1, "\u06e4\u06e1\u06e4"

    goto :goto_0

    :sswitch_5
    const/16 v1, 0x7ac

    const/16 v3, 0x493

    invoke-static {v0, v1, v4, v3}, Lt8/ۦۣ۠;->ۡۧۧ۠([SIII)Ljava/lang/String;

    const-string v1, "\u06e1\u06e8\u06e2"

    goto :goto_0

    :sswitch_6
    sget v2, Lx0/ۣ۠۟۠;->۟۠ۨ۠ۢ:I

    const-string v1, "\u06e8\u06e6\u06df"

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7bc -> :sswitch_0
        0x1aaae4 -> :sswitch_4
        0x1aaee4 -> :sswitch_3
        0x1aaf9b -> :sswitch_7
        0x1ab6a4 -> :sswitch_5
        0x1aba07 -> :sswitch_2
        0x1aba65 -> :sswitch_6
        0x1ac9a1 -> :sswitch_1
    .end sparse-switch
.end method

.method public onServiceConnected()V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x7c2

    sget v2, Landroidx/fragment/app/ۣۣۣۨ;->ۥۧۤ۠:I

    xor-int/lit8 v2, v2, 0x55

    const/16 v3, 0xa63

    invoke-static {v0, v1, v2, v3}, Lu7/ۣ۟ۡ۟;->۟۟۠۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-super {p0}, Landroid/accessibilityservice/AccessibilityService;->onServiceConnected()V
    sput-object p0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;
    iput-boolean v7, p0, Lcom/auto/accept/service/RideAcceptorService;->serviceEnabled:Z

    new-instance v0, Landroid/accessibilityservice/AccessibilityServiceInfo;

    invoke-direct {v0}, Landroid/accessibilityservice/AccessibilityServiceInfo;-><init>()V

    const/16 v2, 0x861

    iput v2, v0, Landroid/accessibilityservice/AccessibilityServiceInfo;->eventTypes:I

    const/16 v2, 0x10

    iput v2, v0, Landroid/accessibilityservice/AccessibilityServiceInfo;->feedbackType:I

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Landroid/accessibilityservice/AccessibilityServiceInfo;->notificationTimeout:J

    const/16 v2, 0x53

    iput v2, v0, Landroid/accessibilityservice/AccessibilityServiceInfo;->flags:I

    invoke-static {p0, v0}, Le1/۟ۢ۟ۤۡ;->ۣ۟۟ۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->ۣ۟۠ۡ۠(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->ۣۣۣۧ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v2

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2, p0}, Lr5/۟ۤۨۥۡ;->ۣۨ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    :try_start_0
    new-instance v0, Lc4/c;

    invoke-direct {v0, p0}, Lc4/c;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lv0/۟ۤۧ۠ۧ;->ۣۥ۠۟(Ljava/lang/Object;)V

    invoke-static {v0}, Lw5/ۢۤۢ۠;->۟ۢ۠ۥۨ(Ljava/lang/Object;)Lc4/d;

    move-result-object v0

    invoke-static {p0, v0}, Lj6/ۣۦۢ۠;->ۣ۟ۤ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)Lc4/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v1, 0x6eb

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x7ce

    sget v4, Lc0/ۦ۠۟ۥ;->ۣۨۤ۠:I

    xor-int/lit16 v4, v4, -0x30f

    const/16 v5, 0x1a6

    invoke-static {v2, v3, v4, v5}, Landroidx/profileinstaller/۠ۡۥۡ;->ۣ۟ۨۡۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_1
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v2, 0x811

    sget v3, Landroidx/activity/ۣۧۧۢ;->ۤۧۥ:I

    xor-int/lit16 v3, v3, -0x1aa

    const/16 v4, 0xa80

    invoke-static {v0, v2, v3, v4}, Lr5/۟ۤۨۥۡ;->۟۟ۥۢۤ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {p0, v0, v2}, Lv5/ۧۥۢۡ;->ۥۨۨۨ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/content/SharedPreferences;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v1, 0xbe22

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v2

    const/16 v3, 0x82a

    sget v4, Ls/ۧۥ۟۟;->۟۟ۨۢۧ:I

    xor-int/lit16 v4, v4, -0x2c8

    const/16 v5, 0x73f

    invoke-static {v2, v3, v4, v5}, Ll8/ۢۦۥۢ;->۟۟۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lg5/ۣۡۦۣ;->۟ۡۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :sswitch_6
    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->encryptedPrefs:Landroid/content/SharedPreferences;

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۨۥۤ(Ljava/lang/Object;)V

    new-instance v0, Lz4/g;

    invoke-direct {v0, p0}, Lz4/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/auto/accept/service/RideAcceptorService;->rideHistoryManager:Lz4/g;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x84b

    sget v2, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟۟ۥۡ:I

    xor-int/lit16 v2, v2, 0x353

    const/16 v3, 0x8a9

    invoke-static {v0, v1, v2, v3}, Lo1/۟ۡۡۦۣ;->ۣۡۧ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ld4/۟۠۠۟ۢ;->۟ۤ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x850

    sget v3, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣ۟ۢ۠ۥ:I

    xor-int/lit16 v3, v3, -0xba

    const/16 v4, 0x63b

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->۟ۤ۟ۧۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lh3/۟ۡۥ۠۠;->۟۠۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Landroid/os/PowerManager;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x88c

    sget v3, Landroidx/compose/ui/input/key/ۣۢۥۢ;->۟ۧۡۧ۠:I

    xor-int/lit16 v3, v3, -0xf6

    const/16 v4, 0x6f7

    invoke-static {v1, v2, v3, v4}, Lq9/۟ۧۦۤۨ;->۟ۦۦۣ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v7, v1}, Lcom/google/protobuf/ۧ۠۠ۥ;->ۢۧۥۧ(Ljava/lang/Object;ILjava/lang/Object;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    iput-object v1, p0, Lcom/auto/accept/service/RideAcceptorService;->wakeLock:Landroid/os/PowerManager$WakeLock;

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_7
    const v0, 0xbebd

    goto :goto_3

    :sswitch_8
    if-eqz v1, :cond_1

    const v0, 0xbedc

    goto :goto_3

    :sswitch_9
    invoke-static {v1, v6}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->ۨۦۥ۟(Ljava/lang/Object;Z)V

    :sswitch_a
    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->۠ۢۥۨ(Ljava/lang/Object;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_2
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-eqz v1, :cond_2

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    invoke-static {v1}, Lr2/ۡۧۥۧ;->۟ۦۨۤۡ(Ljava/lang/Object;)V

    :sswitch_e
    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v0

    const/16 v1, 0x8a2

    sget v2, Lv5/ۧۥۢۡ;->ۣۧ۟ۨ:I

    xor-int/lit16 v2, v2, 0x229

    const/16 v3, 0x99f

    invoke-static {v0, v1, v2, v3}, Lp0/۟ۧۧۧ۟;->۟۟ۡ۟۟([SIII)Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x8b6

    sget v3, Lp8/ۡۤ;->ۡ۟ۤۥ:I

    xor-int/lit16 v3, v3, -0x2de

    const/16 v4, 0x9e8

    invoke-static {v1, v2, v3, v4}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۣۢۧ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->۟۠ۥۢۤ()[S

    move-result-object v1

    const/16 v2, 0x8d4

    sget v3, Ld7/ۢۧۧۢ;->۟ۢۧۤۦ:I

    xor-int/lit8 v3, v3, -0x76

    const/16 v4, 0x659

    invoke-static {v1, v2, v3, v4}, Lh4/ۣ۟ۢۢۡ;->ۣ۟۠۟۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7}, Lh4/ۣ۟ۢۢۡ;->۟ۥ۟۠ۧ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/Intent;

    invoke-static {p0}, Lv5/ۧۥۢۡ;->۟ۥۡۧۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Li/ۢۥۣ۟;->۟ۥۡۦۨ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lcom/google/firebase/provider/ۧۦ۟ۢ;->ۢۨۦۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

    move-result v1

    const v0, 0xc202

    :goto_5
    const v2, 0xc213

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_f
    if-ltz v1, :cond_3

    const v0, 0xc25f

    goto :goto_5

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_5

    :sswitch_11
    const-string v0, "KQ7w0M"

    invoke-static {v0}, Lw5/ۢۤۢ۠;->۟ۢۤۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_12
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0x2d -> :sswitch_a
        0x4c -> :sswitch_9
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_12
    .end sparse-switch
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 2

    invoke-static {p0}, Lcom/auto/accept/service/RideAcceptorService;->۟ۢۨۥۤ(Ljava/lang/Object;)V

    invoke-static {}, Lf/ۣ۟ۤۤ;->ۦۤۥ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "cld4JO25y3VLHAYZ"

    invoke-static {v0}, La2/ۢۦۧۦ;->ۨۧ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

# ============================================================================
# Native Settings UI bridges (classes2.dex -> DashboardActivity) - PATCHES.md.
# Each handler bridge CONSTRUCTS AND INVOKES the original shipped click lambda
# with its original captured state and dispatch key (values recomputed from the
# original construction sites). No handler logic is reimplemented here.
# ============================================================================

.field private static volatile uiCtx:Landroid/content/Context;
.field private static volatile uiZ:Lz4/d;
.field private static volatile uiM:Lcom/auto/accept/ui/viewmodel/MainViewModel;

# ---- shared plumbing -------------------------------------------------------

.method public static uiInit(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :ok

    return-void

    :ok
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->uiCtx:Landroid/content/Context;

    return-void
.end method

.method private static uiZ4()Lz4/d;
    .locals 3

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->uiZ:Lz4/d;

    if-eqz v0, :make

    return-object v0

    :make
    sget-object v1, Lcom/auto/accept/service/RideAcceptorService;->uiCtx:Landroid/content/Context;

    new-instance v0, Lz4/b;

    invoke-direct {v0, v1}, Lz4/b;-><init>(Landroid/content/Context;)V

    new-instance v2, Lz4/d;

    invoke-direct {v2, v1, v0}, Lz4/d;-><init>(Landroid/content/Context;Lz4/b;)V

    sput-object v2, Lcom/auto/accept/service/RideAcceptorService;->uiZ:Lz4/d;

    return-object v2
.end method

.method private static uiVm()Lcom/auto/accept/ui/viewmodel/MainViewModel;
    .locals 6

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->uiM:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    if-eqz v0, :make

    return-object v0

    :make
    new-instance v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    sget-object v1, Lcom/auto/accept/service/RideAcceptorService;->uiCtx:Landroid/content/Context;

    check-cast v1, Landroid/app/Application;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiZ4()Lz4/d;

    move-result-object v2

    new-instance v3, La5/j;

    invoke-direct {v3}, La5/j;-><init>()V

    new-instance v4, La5/z;

    invoke-direct {v4}, La5/z;-><init>()V

    new-instance v5, La5/i0;

    invoke-direct {v5}, La5/i0;-><init>()V

    invoke-direct/range {v0 .. v5}, Lcom/auto/accept/ui/viewmodel/MainViewModel;-><init>(Landroid/app/Application;Lz4/d;La5/j;La5/z;La5/i0;)V

    sput-object v0, Lcom/auto/accept/service/RideAcceptorService;->uiM:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    return-object v0
.end method

# ---- state reads (same store + keys the engine and z4/d use) ----------------

# current app language: mirrors z4/d.M (pref key z4/d.L = "app_language", def "en")
.method public static uiLang()Ljava/lang/String;
    .locals 3

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiZ4()Lz4/d;

    move-result-object v0

    iget-object v1, v0, Lz4/d;->L:Ljava/lang/String;

    iget-object v0, v0, Lz4/d;->c:Landroid/content/SharedPreferences;

    const-string v2, "en"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

# localized row text: the original string table lookup g5/b.b(key, lang)
.method public static uiText(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiLang()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lg5/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static uiBool(Ljava/lang/String;Z)Z
    .locals 2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiZ4()Lz4/d;

    move-result-object v0

    iget-object v0, v0, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static uiInt(Ljava/lang/String;I)I
    .locals 2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiZ4()Lz4/d;

    move-result-object v0

    iget-object v0, v0, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static uiString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiZ4()Lz4/d;

    move-result-object v0

    iget-object v0, v0, Lz4/d;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

# ---- row handlers: original shipped lambdas, invoked 1:1 --------------------

# Row "Hide Developer Options" (anti_detection_title / anti_detection_desc).
# Original click lambda: Lz/p;->invoke()V default packed-switch case, built at
# d5/k1.smali:2416 as <init>(Context, Object, l3, I) with dispatch
#   sget androidx/versionedparcelable/...;->...:I = -0x2e1  xor -0x2e8  = 7.
# Captured states (d5/k1 ctor a=1 mapping): d = Boolean state
#   "Shizuku.checkSelfPermission() == 0" (d5/o1.smali:19908), b = language
#   state (d5/o1.smali:20599 = vm.P0 = z4/d.N).
.method public static settingsHideDevOptions(Landroid/content/Context;)V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lla/g;->c()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :gate

    const/4 v0, 0x1

    goto :gate

    :catch_0
    move-exception v1

    :gate
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Lm0/h1;->a:Lm0/h1;

    invoke-static {v1, v2}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    new-instance v2, Lm0/n3;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiLang()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lm0/n3;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lz/p;

    const/4 v4, 0x7

    invoke-direct {v3, p0, v1, v2, v4}, Lz/p;-><init>(Landroid/content/Context;Ljava/lang/Object;Lm0/l3;I)V

    invoke-virtual {v3}, Lz/p;->invoke()V

    return-void
.end method

# Row "Select App Language" -> save (select_language / save_language).
# Original handler: Lz/p;->invoke()V :pswitch_0, built at d5/k.smali:3966 as
# <init>(Object, Object, Object, I) with dispatch
#   sget com/google/firebase/firestore/ktx/...;->...:I = 0x1a2  xor 0x1a4 = 6.
# Captured: b = MainViewModel, c = Context (toast), d = g1 state holding the
# new langCode string.
.method public static settingsSaveLanguage(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    sget-object v0, Lm0/h1;->a:Lm0/h1;

    invoke-static {p1, v0}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v0

    new-instance v1, Lz/p;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiVm()Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v2

    const/4 v3, 0x6

    invoke-direct {v1, v2, p0, v0, v3}, Lz/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1}, Lz/p;->invoke()V

    return-void
.end method

# Row "Alert on Accept" (alert_on_accept / play_sound_on_accept) -> pref key
# "ride_alert_enabled" (plain store, engine reads it with default true).
# Original handler: Lh1/b;->invoke(Ljava/lang/Object;) pswitch_6 (packed-switch
# key 13), built at d5/a.smali:2544 with dispatch
#   sget a/...;->...:I = -0x3d2  xor -0x3dd  = 13.  Captured b = MainViewModel.
.method public static settingsAlertOnAccept(Z)V
    .locals 4

    new-instance v0, Lh1/b;

    invoke-static {}, Lcom/auto/accept/service/RideAcceptorService;->uiVm()Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lh1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh1/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

# ===== settings-row bridges (block 2) =========================================
# Each bridge only constructs the SAME lambda object the shipping Compose UI
# builds and calls its invoke() body. No logic is reimplemented.

# Row "Grant Shizuku Permission / Pair" (grant_shizuku_btn). Click = the
# shipping Lc5/p; lambda built at d5/k1.smali:5641-5649 as
# (Context, g1{Lg5/c;}, dispatch 2). Its invoke()V state machine:
#   g5/c ordinal 0 -> install (market://), 1 -> open Shizuku app,
#   2 -> la/g.g(I) = Shizuku.requestPermission, 3 -> toast "Active & Ready".
# The state mirrors d5/o1.smali:19908 (Shizuku.checkSelfPermission() == 0).
.method public static settingsShizukuGrant(Landroid/content/Context;)V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "moe.shizuku.privileged.api"

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :installed

    :catch_0
    move-exception v1

    sget-object v0, Lg5/c;->a:Lg5/c;

    goto :status

    :installed
    sget-object v0, Lg5/c;->c:Lg5/c;

    :try_start_1
    invoke-static {}, Lla/g;->c()I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v1, :status

    sget-object v0, Lg5/c;->d:Lg5/c;

    goto :status

    :catch_1
    move-exception v1

    :status
    sget-object v1, Lm0/h1;->a:Lm0/h1;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v1

    new-instance v2, Lc5/p;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v1, v3}, Lc5/p;-><init>(Landroid/content/Context;Lm0/g1;I)V

    invoke-virtual {v2}, Lc5/p;->invoke()V

    return-void
.end method

# Community link rows (url_website / url_telegram / url_whatsapp). Click = the
# shipping Lk4/p; lambda (y3/e.smali:55553/55575/55597; dispatch 2/3/4
# recomputed from their XOR constants). invoke()V opens ACTION_VIEW with the
# original res URL (0x7f0e0095 / 0x7f0e0094 / 0x7f0e0096).
#   which: 2 = url_website, 3 = url_telegram, 4 = url_whatsapp
.method public static settingsOpenUrl(Landroid/content/Context;I)V
    .locals 2

    new-instance v0, Lk4/p;

    invoke-direct {v0, p0, p1}, Lk4/p;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Lk4/p;->invoke()V

    return-void
.end method
# ===== bridge block 3: accept-timer row =======================================
# Row "Ola accept timers remove" (accept_timer_title / accept_timer_desc).
# Switch onCheckedChange = the shipping Lb/g; lambda built at s/k.smali:984-986
# as <init>(Object,Object,Object,I) = (Context, g1{Boolean Shizuku-ready},
# g1{writable checked state}, 0x15). invoke(Boolean) packed-switch key 0x15 ->
# :pswitch_3 -> f(Z) default (a != 0x14) = "Zero Animation Mode": gate on the
# captured Shizuku-ready state (toast "Enable Shizuku first to use this
# feature" when false), set the checked state, then via Shizuku
#   settings put global window_animation_scale|transition_animation_scale|
#   animator_duration_scale <0|1>
# + Log.d "ShellTapExecutor" "\u26a1 Zero Animation Mode set to scale=<z>";
# catch -> "Zero Animation Mode failed: ". Checked state mirrors
# Settings.Global.window_animation_scale == 0f (the original has no pref).
.method public static settingsAcceptTimer(Landroid/content/Context;Z)V
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lla/g;->c()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :gate

    const/4 v0, 0x1

    goto :gate

    :catch_0
    move-exception v1

    :gate
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Lm0/h1;->a:Lm0/h1;

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object v3

    new-instance v0, Lb/g;

    const/16 v4, 0x15

    invoke-direct {v0, p0, v2, v3, v4}, Lb/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

# Row state for the accept-timer switch (read-only): the original derives it
# from Settings.Global.window_animation_scale == 0f (d5/o1.smali:19690).
.method public static uiZeroAnim()Z
    .locals 3

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->uiCtx:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "window_animation_scale"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :off

    const/4 v0, 0x1

    return v0

    :off
    const/4 v0, 0x0

    return v0
.end method

.method private final scanNodeAllApps(Landroid/view/accessibility/AccessibilityNodeInfo;Lcom/auto/accept/data/model/SupportedApp;)V
    .locals 24

    # ============================================================
    # Universal platform scanner (block 4).
    # 1) Runs the proven generic scanner first (unchanged behavior).
    # 2) Then an extra pass for platforms whose accept button is not
    #    labelled "accept"/"confirm" (start/take/pick/grab + Hindi).
    # Overlap guard: if any node text contains accept/confirm the
    # original scanner owns that popup and this pass returns early.
    # Decides through the existing processRideDecision bridge using
    # the engine's own conventions (0.0 = unknown for km slots).
    # Registers: invoke operands kept in v0..v13 (35c limit v15);
    # wide values in v16..v23. Frame v0..v12 assembled at :assemble.
    # ============================================================

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-wide/16 v22, 0x0

    invoke-direct {v0, v1}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeForRapido(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v3}, Lcom/auto/accept/service/RideAcceptorService;->fetchIterableNodes(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/4 v7, 0x0

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :loop
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :loop_end

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v8, ""

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :after_text

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :after_text
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :after_cd

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, " "

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :after_cd
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v14

    if-eqz v14, :loop

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v9

    const-string v10, "accept"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :guard_confirm

    return-void

    :guard_confirm
    const-string v10, "confirm"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :guard_done

    return-void

    :guard_done
    if-nez v7, :do_numbers

    const-string v10, "start"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_take

    goto :found_word

    :w_take
    const-string v10, "take"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_pick

    goto :found_word

    :w_pick
    const-string v10, "pick"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_grab

    goto :found_word

    :w_grab
    const-string v10, "grab"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_claim

    goto :found_word

    :w_claim
    const-string v10, "claim"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_order

    goto :found_word

    :w_order
    const-string v10, "order"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_book

    goto :found_word

    :w_book
    const-string v10, "book"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_approve

    goto :found_word

    :w_approve
    const-string v10, "approve"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_receive

    goto :found_word

    :w_receive
    const-string v10, "receive"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_continue

    goto :found_word

    :w_continue
    const-string v10, "continue"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_proceed

    goto :found_word

    :w_proceed
    const-string v10, "proceed"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_offer

    goto :found_word

    :w_offer
    const-string v10, "offer"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi1

    goto :found_word

    :w_hi1
    const-string v10, "\u0938\u094d\u0935\u0940\u0915\u093e\u0930"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi2

    goto :found_word

    :w_hi2
    const-string v10, "\u092a\u0941\u0937\u094d\u091f\u093f"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi3

    goto :found_word

    :w_hi3
    const-string v10, "\u0936\u0941\u0930\u0942"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi4

    goto :found_word

    :w_hi4
    const-string v10, "\u0938\u094d\u0935\u0940\u0915\u0943\u0924"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi5

    goto :found_word

    :w_hi5
    const-string v10, "\u092c\u0941\u0915"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :do_numbers

    goto :found_word

    :found_word
    const-string v10, "reject"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_pass

    goto :do_numbers

    :x_pass
    const-string v10, "pass"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_skip

    goto :do_numbers

    :x_skip
    const-string v10, "skip"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_decline

    goto :do_numbers

    :x_decline
    const-string v10, "decline"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_cancel

    goto :do_numbers

    :x_cancel
    const-string v10, "cancel"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_close

    goto :do_numbers

    :x_close
    const-string v10, "close"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_later

    goto :do_numbers

    :x_later
    const-string v10, "later"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_ignore

    goto :do_numbers

    :x_ignore
    const-string v10, "ignore"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_location

    goto :do_numbers

    :x_location
    const-string v10, "location"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_address

    goto :do_numbers

    :x_address
    const-string v10, "address"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_detail

    goto :do_numbers

    :x_detail
    const-string v10, "detail"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_km

    goto :do_numbers

    :x_km
    const-string v10, "km"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_kg

    goto :do_numbers

    :x_kg
    const-string v10, "kg"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_min

    goto :do_numbers

    :x_min
    const-string v10, "min"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_rupee

    goto :do_numbers

    :x_rupee
    const-string v10, "\u20b9"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_call

    goto :do_numbers

    :x_call
    const-string v10, "call"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_chat

    goto :do_numbers

    :x_chat
    const-string v10, "chat"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_more

    goto :do_numbers

    :x_more
    const-string v10, "more"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_size

    goto :do_numbers

    :x_size
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v14

    const/16 v15, 0x28

    if-gt v14, v15, :do_numbers

    invoke-direct {v0, v5}, Lcom/auto/accept/service/RideAcceptorService;->findClickableAncestor(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v11

    if-eqz v11, :do_numbers

    move-object v7, v11

    :do_numbers
    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractDistance(Ljava/lang/String;)D

    move-result-wide v10

    cmpl-double v14, v10, v22

    if-lez v14, :currency

    cmpl-double v14, v18, v22

    if-nez v14, :dist_drop

    move-wide/from16 v18, v10

    goto :currency

    :dist_drop
    cmpl-double v14, v20, v22

    if-nez v14, :currency

    move-wide/from16 v20, v10

    :currency
    const-string v10, "\u20b9"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cur_dollar

    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    goto :num_iter

    :cur_dollar
    const-string v10, "$"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cur_euro

    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    goto :num_iter

    :cur_euro
    const-string v10, "\u20ac"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cur_none

    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    goto :num_iter

    :cur_none
    goto/16 :loop

    :num_iter
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :num_loop
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :num_end

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Double;

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    cmpl-double v14, v10, v16

    if-lez v14, :num_loop

    move-wide/from16 v16, v10

    goto :num_loop

    :num_end
    goto/16 :loop

    :loop_end
    if-eqz v7, :end

    cmpl-double v14, v16, v22

    if-lez v14, :end

    cmpl-double v14, v18, v22

    if-gez v14, :norm_drop

    move-wide/from16 v18, v22

    :norm_drop
    cmpl-double v14, v20, v22

    if-gez v14, :assemble

    move-wide/from16 v20, v22

    :assemble
    move-object v9, v6

    move-object v10, v7

    const/4 v11, 0x0

    invoke-virtual {v2}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v12

    move-wide/from16 v1, v16

    const-wide/16 v3, 0x0

    move-wide/from16 v5, v18

    move-wide/from16 v7, v20

    invoke-static/range {v0 .. v12}, Lcom/auto/accept/service/RideAcceptorService;->۟ۤۤۡ۠(Ljava/lang/Object;DDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :end
    return-void
.end method

# ---- block 5: language table bridge (read-only accessor) ----
# Flattens g5/b.a (List<g5/a>) into [code, name, nativeName] * n for the
# Settings language picker. g5/a fields: a=ISO code, b=English name,
# c=language name in its own script (see analysis/settings_strings.json).
.method public static uiLangs()[Ljava/lang/String;
    .locals 8

    sget-object v0, Lg5/b;->a:Ljava/util/List;

    if-eqz v0, :empty

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :empty

    mul-int/lit8 v2, v1, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    :loop
    if-ge v3, v1, :done

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg5/a;

    mul-int/lit8 v5, v3, 0x3

    iget-object v6, v4, Lg5/a;->a:Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v7, v5, 0x1

    iget-object v6, v4, Lg5/a;->b:Ljava/lang/String;

    aput-object v6, v2, v7

    add-int/lit8 v5, v5, 0x2

    iget-object v6, v4, Lg5/a;->c:Ljava/lang/String;

    aput-object v6, v2, v5

    add-int/lit8 v3, v3, 0x1

    goto :loop

    :done
    return-object v2

    :empty
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public static probeLicenceGate()V
    .locals 3

    sget-object v0, Lcom/auto/accept/service/RideAcceptorService;->overlayToggleTarget:Lcom/auto/accept/service/RideAcceptorService;

    if-eqz v0, :none

    invoke-static {v0}, Lcom/auto/accept/service/RideAcceptorService;->ۦۢ۠ۧ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :deny

    const-string v1, "AcceptPro-Test: probe: gate=ALLOW"

    goto :log

    :deny
    const-string v1, "AcceptPro-Test: probe: gate=DENY"

    :log
    const-string v2, "AcceptPro-Test: lic"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :none
    const-string v1, "AcceptPro-Test: probe: no service target"

    const-string v2, "AcceptPro-Test: lic"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
