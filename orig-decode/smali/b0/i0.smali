.class public final Lb0/i0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:Lb0/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb0/i0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lb0/i0;->a:Lb0/i0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lv0/d;

    check-cast p2, Lb0/k0;

    iget-object p1, p2, Lb0/h0;->e:Lb0/a0;

    invoke-virtual {p1}, Lb0/a0;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p2, Lb0/h0;->e:Lb0/a0;

    invoke-virtual {v0}, Lb0/a0;->b()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2}, Lb0/k0;->k()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, v0, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
