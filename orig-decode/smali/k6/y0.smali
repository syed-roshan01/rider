.class public final synthetic Lk6/y0;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/w3;


# static fields
.field public static final a:Lk6/y0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/y0;

    invoke-direct {v0}, Lk6/y0;-><init>()V

    sput-object v0, Lk6/y0;->a:Lk6/y0;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 5

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e5\u06e8"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    long-to-int v4, v2

    const-string v1, "\u06e6\u06e8\u06e8"

    goto :goto_0

    :sswitch_0
    invoke-static {v4}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "\u06e4\u06e1\u06e1"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ld9/ۡۥۣۡ;->ۣۣ۟۟ۦ()J

    move-result-wide v2

    const-string v1, "\u06e7\u06e7\u06e6"

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lb/۠ۨۦۥ;->۟ۧۢۥۢ()Ljava/util/List;

    const-string v1, "\u06e6\u06e4\u06e2"

    goto :goto_0

    :sswitch_3
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1ab305 -> :sswitch_2
        0x1aba04 -> :sswitch_3
        0x1ac1e4 -> :sswitch_1
        0x1ac266 -> :sswitch_0
    .end sparse-switch
.end method
