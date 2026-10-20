.class public final synthetic Lk6/x5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field public static final a:Lk6/x5;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/x5;

    invoke-direct {v0}, Lk6/x5;-><init>()V

    sput-object v0, Lk6/x5;->a:Lk6/x5;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const-string v3, "\u06e8\u06e1\u06e5"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    move-object v0, p1

    check-cast v0, Lk6/i7;

    const-string v1, "\u06e5\u06e5\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0}, Lh3/ۣ۟ۢۡۤ;->ۨۦ۠۠(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v1, "\u06e4\u06e0\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    const-string v3, "\u06e7\u06e7\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1ab9e4 -> :sswitch_1
        0x1abe47 -> :sswitch_0
        0x1ac601 -> :sswitch_2
    .end sparse-switch
.end method
