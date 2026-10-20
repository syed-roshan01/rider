.class public final Ld5/f;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Lc9/a;

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lc9/a;II)V
    .locals 3

    iput p4, p0, Ld5/f;->a:I

    iput-object p1, p0, Ld5/f;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/f;->c:Lc9/a;

    iput p3, p0, Ld5/f;->d:I

    sget v0, Lh/ۥۦۡۧ;->ۤۢۨۨ:I

    xor-int/lit16 v0, v0, -0x89

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lq6/۟ۥۦۡ۟;->۟ۦۥۢ()I

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
    const-string v0, "RYgCYKiajYnKBtVEq6R"

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->۟ۦۢۢ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Le1/ۦۣۢۥ;->ۦۣ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Landroidx/profileinstaller/۟۟۟ۧۦ;->ۣۣ۟ۨ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v2

    invoke-static {p0}, Lga/۟ۢۧ۟ۦ;->۠ۦۦۦ(Ljava/lang/Object;)Lc9/a;

    move-result-object v3

    invoke-static {p0}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->ۣ۟ۡ۠ۥ(Ljava/lang/Object;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    packed-switch v4, :pswitch_data_1

    xor-int/lit8 v4, v1, 0x1

    and-int/lit8 v1, v1, 0x1

    or-int/2addr v1, v4

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v2, v3, p1, v1}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۧۥۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-object v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :pswitch_0
    xor-int/lit8 v4, v1, 0x1

    and-int/lit8 v1, v1, 0x1

    or-int/2addr v1, v4

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v2, v3, p1, v1}, Lw4/۟ۤ۠۟ۨ;->ۣ۟ۧۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    packed-switch v4, :pswitch_data_2

    xor-int/lit8 v4, v1, 0x1

    and-int/lit8 v1, v1, 0x1

    or-int/2addr v1, v4

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v2, v3, p1, v1}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۧۥۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_2
    const/16 v1, 0x6eb

    goto :goto_2

    :pswitch_2
    xor-int/lit8 v4, v1, 0x1

    and-int/lit8 v1, v1, 0x1

    or-int/2addr v1, v4

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v2, v3, p1, v1}, Lw4/۟ۤ۠۟ۨ;->ۣ۟ۧۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method
