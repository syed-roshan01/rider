.class public final synthetic Lk6/y2;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/w3;


# static fields
.field public static final a:Lk6/y2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/y2;

    invoke-direct {v0}, Lk6/y2;-><init>()V

    sput-object v0, Lk6/y2;->a:Lk6/y2;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 5

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e4\u06e0"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lb/۠ۨۦۥ;->۟ۧۢۥۢ()Ljava/util/List;

    const-string v1, "\u06e4\u06e1\u06e8"

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۡ۟ۢۧ()J

    move-result-wide v2

    const-string v1, "\u06e6\u06e0\u06e3"

    goto :goto_0

    :sswitch_1
    long-to-int v4, v2

    const-string v1, "\u06e0\u06e0\u06e2"

    goto :goto_0

    :sswitch_2
    invoke-static {v4}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "\u06e4\u06e8\u06e1"

    goto :goto_0

    :sswitch_3
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1aaae2 -> :sswitch_2
        0x1aba0b -> :sswitch_0
        0x1abadd -> :sswitch_3
        0x1ac169 -> :sswitch_1
    .end sparse-switch
.end method
