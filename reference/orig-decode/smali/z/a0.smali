.class public final Lz/a0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final a:Lz/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz/a0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lz/a0;->a:Lz/a0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lv0/d;

    check-cast p2, Lz/g0;

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Integer;

    iget-object v0, p2, Lz/g0;->c:Lz/z;

    iget-object v0, v0, Lz/z;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/u2;->d()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    iget-object p2, p2, Lz/g0;->c:Lz/z;

    iget-object p2, p2, Lz/z;->b:Lm0/l1;

    invoke-virtual {p2}, Lm0/u2;->d()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    aput-object p2, p1, v0

    invoke-static {p1}, Ld7/t;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
