.class public final Lf0/z1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:Lf0/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0/z1;

    sget v1, Lcom/google/android/gms/auth/api/signin/ۦ۟;->۟ۧۧۧۧ:I

    xor-int/lit16 v1, v1, 0xba

    invoke-direct {v0, v1}, Lf0/z1;-><init>(I)V

    sput-object v0, Lf0/z1;->a:Lf0/z1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    check-cast p1, Lv0/d;

    check-cast p2, Lf0/a2;

    invoke-static {p2}, Lt8/ۦۣ۠;->ۧۥۨ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v0

    invoke-static {v0}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v0

    invoke-static {v0}, Ld4/۟۠۠۟ۢ;->ۣۤ۟۠(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static {p2}, Ln7/۟ۡۢۦ;->ۡۥۧ۠(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    invoke-static {v0}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv/h1;

    invoke-static {}, Ll0/ۡۦۦۡ;->ۧۢۥ()Lv/h1;

    move-result-object v5

    const/16 v3, 0x650

    :goto_0
    xor-int/lit16 v3, v3, 0x661

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v3, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne v0, v5, :cond_0

    const/16 v3, 0x6ad

    goto :goto_0

    :sswitch_2
    move v0, v1

    :goto_1
    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v4, v3, v2

    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v3}, Lr9/۟ۢۢۤۨ;->ۧۧ۠ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_3
    move v0, v2

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
