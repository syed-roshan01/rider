.class public final Lh8/t;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lja/g;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Lja/g;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/t;->a:Lja/g;

    iput p2, p0, Lh8/t;->b:I

    return-void
.end method


# virtual methods
.method public final a([BII)V
    .locals 1

    iget-object v0, p0, Lh8/t;->a:Lja/g;

    invoke-virtual {v0, p1, p2, p3}, Lja/g;->f0([BII)V

    iget p1, p0, Lh8/t;->b:I

    sub-int/2addr p1, p3

    iput p1, p0, Lh8/t;->b:I

    iget p1, p0, Lh8/t;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lh8/t;->c:I

    return-void
.end method
