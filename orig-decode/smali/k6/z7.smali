.class public final Lk6/z7;
.super Lk6/m7;


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/util/HashSet;

.field public f:Lq/f;

.field public g:Ljava/lang/Long;

.field public h:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s(Ljava/lang/Integer;)Lk6/a8;
    .locals 2

    invoke-static {p0}, La/ۥۡۢۨ;->۟ۤۧۥۥ(Ljava/lang/Object;)Lq/f;

    move-result-object v0

    invoke-static {v0, p1}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->ۣۣۤ۠(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-static {p0}, La/ۥۡۢۨ;->۟ۤۧۥۥ(Ljava/lang/Object;)Lq/f;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/firebase/measurement/ۧۤۦۧ;->۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/a8;

    :goto_1
    return-object v0

    :sswitch_3
    new-instance v0, Lk6/a8;

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۦۣ۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lk6/a8;-><init>(Lk6/z7;Ljava/lang/String;)V

    invoke-static {p0}, La/ۥۡۢۨ;->۟ۤۧۥۥ(Ljava/lang/Object;)Lq/f;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lg3/۟ۥۣۣۥ;->۠۠ۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
