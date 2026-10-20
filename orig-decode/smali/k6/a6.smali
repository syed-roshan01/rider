.class public final synthetic Lk6/a6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final a:Lk6/a6;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/a6;

    invoke-direct {v0}, Lk6/a6;-><init>()V

    sput-object v0, Lk6/a6;->a:Lk6/a6;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 11

    const-wide/16 v6, 0x0

    const/4 v0, 0x0

    const/4 v10, 0x0

    const-string v3, "\u06e7\u06e4\u06e3"

    move-object v1, v0

    move-object v2, v0

    move-wide v4, v6

    move-wide v8, v6

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {v1}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v6

    const-string v0, "\u06e1\u06e1\u06e7"

    move-object v3, v0

    move-wide v8, v6

    goto :goto_0

    :sswitch_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Long;

    const-string v3, "\u06e1\u06e4\u06e3"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    invoke-static {v2}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v0, "\u06e7\u06df\u06e6"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Ljava/lang/Long;

    const-string v3, "\u06e1\u06e6\u06e2"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    cmp-long v6, v4, v8

    const-string v0, "\u06e2\u06e8\u06e4"

    move-object v3, v0

    move v10, v6

    goto :goto_0

    :sswitch_4
    return v10

    :sswitch_data_0
    .sparse-switch
        0x1aaec7 -> :sswitch_3
        0x1aaf20 -> :sswitch_1
        0x1aaf5d -> :sswitch_0
        0x1ab35e -> :sswitch_4
        0x1ac5a6 -> :sswitch_2
    .end sparse-switch
.end method
