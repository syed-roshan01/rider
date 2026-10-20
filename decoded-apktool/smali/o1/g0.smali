.class public final Lo1/g0;
.super Lw8/c;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lo1/h0;

.field public c:I


# direct methods
.method public constructor <init>(Lo1/h0;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lo1/g0;->b:Lo1/h0;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lo1/g0;->a:Ljava/lang/Object;

    iget p1, p0, Lo1/g0;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo1/g0;->c:I

    const/4 p1, 0x0

    iget-object v0, p0, Lo1/g0;->b:Lo1/h0;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2, p1, p0}, Lo1/h0;->i(JLv/n2;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
