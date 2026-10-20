.class public final synthetic Lk6/h;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/g;
.implements Lk6/w3;


# static fields
.field public static final a:Lk6/h;

.field public static final b:Lk6/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/h;

    invoke-direct {v0}, Lk6/h;-><init>()V

    sput-object v0, Lk6/h;->a:Lk6/h;

    new-instance v0, Lk6/h;

    invoke-direct {v0}, Lk6/h;-><init>()V

    sput-object v0, Lk6/h;->b:Lk6/h;

    return-void
.end method

.method public static b()Z
    .locals 3

    invoke-static {}, Li/ۣۢۦ۠;->ۣۧۨ۟()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

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
    if-ne v1, v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    :goto_1
    return v0

    :sswitch_3
    const/4 v0, 0x0

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public zza()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lb/۠ۨۦۥ;->۟ۧۢۥۢ()Ljava/util/List;

    invoke-static {}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۨۢ۟ۨ()J

    move-result-wide v0

    invoke-static {v0, v1}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
