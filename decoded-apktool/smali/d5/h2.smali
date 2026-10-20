.class public final Ld5/h2;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Z

.field public final d:I

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;ZIII)V
    .locals 2

    iput p5, p0, Ld5/h2;->a:I

    iput-object p1, p0, Ld5/h2;->b:Ljava/lang/Object;

    iput-boolean p2, p0, Ld5/h2;->c:Z

    iput p3, p0, Ld5/h2;->d:I

    iput p4, p0, Ld5/h2;->e:I

    sget v0, Lz3/۟ۡ۠ۦۣ;->ۣ۠ۦۣ:I

    xor-int/lit8 v0, v0, 0x35

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lv9/۟۟ۤۥ;->ۣ۟۟ۧ۠()I

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
    const-string v0, "leXKGHqcH"

    invoke-static {v0}, Lu8/ۨۡ۠;->ۨۨۤۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public constructor <init>(ZLc9/a;II)V
    .locals 2

    sget v0, Lh8/۟ۨۧ;->ۨ۟ۧ:I

    xor-int/lit16 v0, v0, 0x100

    iput v0, p0, Ld5/h2;->a:I

    iput-boolean p1, p0, Ld5/h2;->c:Z

    iput-object p2, p0, Ld5/h2;->b:Ljava/lang/Object;

    iput p3, p0, Ld5/h2;->d:I

    iput p4, p0, Ld5/h2;->e:I

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lr5/۟ۤۨۥۡ;->ۥ۠ۥ۟()I

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
    const-string v0, "iufgoE4FdcQEJm0F8hIz"

    invoke-static {v0}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣ۟ۤۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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
.method public final a(Lm0/m;I)V
    .locals 5

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦۡۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lr6/۟ۡ۠۟ۡ;->۟۟ۤ۟ۡ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۥۡۢ۟;->ۨۡ۠ۤ(Ljava/lang/Object;)I

    move-result v3

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۧۨۨ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {p0}, Lp5/۟ۡۧۡۨ;->ۣ۟ۧۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lc9/a;

    xor-int/lit8 v1, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v1, v4

    invoke-static {v2, v0, p1, v1, v3}, Lq1/۠۠ۤ;->۟ۦۤۨۢ(ZLjava/lang/Object;Ljava/lang/Object;II)V

    invoke-static {}, Lcom/google/firebase/installations/۠ۤۢ۟;->ۡۥۣ۠()I

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
    const-string v0, "zsmnKkl"

    invoke-static {v0}, Ldagger/hilt/android/migration/۟ۧ۟۠ۡ;->ۦۨۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    xor-int/lit8 v1, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v1, v4

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v0, v2, p1, v1, v3}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣۣۣ۟ۧ(Ljava/lang/Object;ZLjava/lang/Object;II)V

    goto :goto_1

    :pswitch_1
    check-cast v0, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    xor-int/lit8 v1, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v1, v4

    invoke-static {v1}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v1

    invoke-static {v0, v2, p1, v1, v3}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣۣۣ۟ۧ(Ljava/lang/Object;ZLjava/lang/Object;II)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۧۦۡۤ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lb/۠ۨۦۥ;->ۥۡۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lb/۠ۨۦۥ;->ۥۡۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lb/۠ۨۦۥ;->ۥۡۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
