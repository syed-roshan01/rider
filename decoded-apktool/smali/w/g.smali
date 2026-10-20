.class public final Lw/g;
.super Lw8/c;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lw/h;

.field public c:I


# direct methods
.method public constructor <init>(Lw/h;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lw/g;->b:Lw/h;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lw/g;->a:Ljava/lang/Object;

    iget p1, p0, Lw/g;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw/g;->c:I

    iget-object v0, p0, Lw/g;->b:Lw/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lw/h;->b(Lw/h;Lv/r1;FFLw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
