.class public final Lw/f;
.super Lw8/c;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lw/h;

.field public c:I


# direct methods
.method public constructor <init>(Lw/h;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lw/f;->b:Lw/h;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lw/f;->a:Ljava/lang/Object;

    iget p1, p0, Lw/f;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw/f;->c:I

    const/4 p1, 0x0

    iget-object v0, p0, Lw/f;->b:Lw/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, v1, p0}, Lw/h;->d(Lv/h2;FLc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
